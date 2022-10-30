/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.services.MyPower;
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class TestCase01 {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
    }
    
    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
    }
    
    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH");
    }
    
    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
    }
    
    @Test
    public void test01() {
        System.out.println("TEST01");
        int x = 2;
        int n = 1;
        int expected = 2;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void test02() {
        System.out.println("TEST02");
        int x = 2;
        int n = 3;
        int expected = 8;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void test03() {
        System.out.println("TEST03");
        int x = 2;
        int n = 0;
        int expected = 1;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void test04() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyPower.power(2, 101);
        });
    }
    
    @Test
    public void test05() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            MyPower.power(5, 7);
        });
    }
}
