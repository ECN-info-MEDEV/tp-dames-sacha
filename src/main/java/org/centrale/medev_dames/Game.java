/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class Game {
    public static void main(String[] args) {
        
        System.out.println("\n===== INITIALIALIZATION =====");

        System.out.println("\n--- White's Pieces ---");
        Joueur j1 = new Joueur();
        j1.setColor("W");
        System.out.println("\n--- Black's Pieces ---");
        Joueur j2 = new Joueur();        
        j2.setColor("B");
        
        Damier d = new Damier();
        d.init();
        
        System.out.println("\n===== GAME =====");
        
        Joueur[] joueurs = {j1,j2};
        int i = 0;
        while (true){
            Joueur j = joueurs[i];
            System.out.println("\n--- "+ j.getName() +"'s Turn ---");
            d.show();
            d.turn(j.getColor());
        }
        
        

    }
}
