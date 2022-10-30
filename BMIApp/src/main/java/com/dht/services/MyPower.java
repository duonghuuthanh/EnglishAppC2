/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import java.util.InputMismatchException;

/**
 *
 * @author admin
 */
public class MyPower {

    public static int power(int x, int n) {
        if (n > 100)
            throw new InputMismatchException("Invalid Data!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return power(x, n + 1) / x;
        }
    }
}
