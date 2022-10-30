/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;
import com.dht.services.BmiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author admin
 */

public class TestCase02 {
    @Test
    public void test01() {
        BmiService s = new BmiService(1.7, 70);
        Assertions.assertTrue(s.getResultBmi() == 0);
    }
    
    @Test
    public void test02() {
        BmiService s = new BmiService(1.7, 75);
        Assertions.assertTrue(s.getResultBmi() == 1);
    }
}
