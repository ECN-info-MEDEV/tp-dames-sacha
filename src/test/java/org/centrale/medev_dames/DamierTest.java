/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev_dames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sacha
 */
public class DamierTest {
    
    public DamierTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of show method, of class Damier.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        Damier d = new Damier();
        d.init();
        d.show();
    }
    
//    /**
//     * Test of selectPion method, of class Damier.
//     */
//    @Test
//    public void testSelectPion() {
//        Damier damier = new Damier();
//        damier.init();
//        damier.show();
//        Pion selectedPion = damier.selectPion();
//        System.out.println("Selected Pion: [" + selectedPion.getX() + ", " + selectedPion.getY() + "]");
//    }
    
    
}
