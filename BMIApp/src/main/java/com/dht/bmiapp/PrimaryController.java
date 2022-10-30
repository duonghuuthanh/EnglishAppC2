package com.dht.bmiapp;

import com.dht.services.BmiService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lblRe;
    
    public void bmiHandler(ActionEvent evt) {
        double height = Double.parseDouble(this.txtHeight.getText());
        double weight = Double.parseDouble(this.txtWeight.getText());
        
        BmiService s = new BmiService(height, weight);
        if (s.getResultBmi() == 0) { 
            this.lblRe.setText("Bình thường");
            this.lblRe.setTextFill(Color.BLUE);
        } else {
            this.lblRe.setText("Béo phì");
            this.lblRe.setTextFill(Color.RED);
        }
           
    }
}
