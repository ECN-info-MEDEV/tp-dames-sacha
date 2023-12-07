/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author bebom
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

    

    /**
     * Test of movement method, of class Pion.
     */
    @Test
    public void testMovement() {
        
    }

    /**
     * Test of manger method, of class Pion.
     */
    @Test
    @Disabled
    public void testManger() {
        Pion pion = new Pion(3, 3, "B");
        List<Pion> pions = new ArrayList<>();

        // Crear algunos piones en posiciones específicas
        Pion pionAComer = new Pion(2, 2, "W");
        pions.add(pionAComer);
        pions.add(new Pion(4, 4, "W"));
        pions.add(new Pion(2, 4, "B"));

        // Comer un pion
        pion.manger(pions, pionAComer);

        // Verificar que el pion ha sido eliminado de la lista
        assertFalse(pions.contains(pionAComer));
        assertEquals(2, pions.size());
    }

    

    /**
     * Test of getCasesLibres method, of class Pion.
     */
    @Test
    public void testGetCasesLibres() {
        Pion pion = new Pion(3, 3, "B");
        List<Pion> pions = new ArrayList<>();

        // Crear algunos piones en posiciones específicas
        pions.add(new Pion(2, 2, "W"));
        pions.add(new Pion(4, 4, "W"));
        pions.add(new Pion(2, 4, "B"));

        // Obtener las casillas libres para el pion
        List<Pion> casillasLibres = pion.getCasesLibres(pions);
        for (Pion libre : casillasLibres) {
            System.out.println(libre.getX()+","+libre.getY());

        }
        
        // Verificar que las casillas libres son las esperadas
        assertEquals(3, casillasLibres.size());
        assertFalse(casillasLibres.contains(new Pion(2, 2, "")));
        assertFalse(casillasLibres.contains(new Pion(4, 4, "")));
        assertFalse(casillasLibres.contains(new Pion(2, 4, "")));
    }
    
}
