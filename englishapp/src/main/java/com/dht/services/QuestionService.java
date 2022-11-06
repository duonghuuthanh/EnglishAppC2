/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import com.dht.pojo.Choice;
import com.dht.pojo.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class QuestionService {
    public boolean addQuestion(Question q, List<Choice> choices) throws SQLException {
        if (choices.size() != 4)
            return false;
        
        try (Connection conn = JdbcUtils.getConn()) {
            String sql = "INSERT INTO question(id, content, category_id) VALUES(?, ?, ?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, q.getId());
            stm.setString(2, q.getContent());
            stm.setInt(3, q.getCategoryId());
            if (stm.executeUpdate()> 0) {
                
                for (Choice c: choices) {
                    sql = "INSERT INTO choice(id, content, is_correct, question_id) VALUES(?, ?, ?, ?)";
                    stm = conn.prepareStatement(sql);
                    stm.setString(1, c.getId());
                    stm.setString(2, c.getContent());
                    stm.setBoolean(3, c.isCorrect());
                    stm.setString(4, c.getQuestionId());
                    stm.executeUpdate();
                }
                
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
}
