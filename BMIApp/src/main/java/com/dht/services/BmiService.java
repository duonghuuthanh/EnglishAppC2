/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

/**
 *
 * @author admin
 */
public class BmiService {
    private double height;
    private double weight;

    public BmiService(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public int getResultBmi() {
        double bmi = weight / Math.pow(height, 2);
        if (bmi > 1)
            return 1;
        return 0;
    }
}
