/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.List;
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
public class PionTest {
    
    public PionTest() {
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
    
    @Test
    public void testGetRep() {
        // Create instances of Pion for testing
        Pion pion1 = new Pion(1, 1, "B");
        Pion pion2 = new Pion(2, 2, "W");
        Pion pion3 = new Pion(3, 3, "B");
        Pion pion4 = new Pion(4, 4, "W");
        pion3.setDame(true);
        pion4.setDame(true);

        String rep1 = pion1.getRep();
        String rep2 = pion2.getRep();
        String rep3 = pion3.getRep();
        String rep4 = pion4.getRep();

        assertEquals(" B ", rep1);
        assertEquals(" W ", rep2);
        assertEquals(":B:", rep3);
        assertEquals(":W:", rep4);
    }

}
