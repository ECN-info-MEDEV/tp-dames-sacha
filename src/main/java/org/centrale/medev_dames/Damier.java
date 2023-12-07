package org.centrale.medev_dames;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sacha
 */
public class Damier {
    
    private ArrayList<Pion> listePions;
    private Joueur j1;
    private Joueur j2;
    private static final int LARGEUR = 10;
    
    public Damier(){
        listePions = new ArrayList<>();
        j1 = new Joueur();
        j2 = new Joueur();
    }
    
    public void init(){
        
        for (int i = 0; i < LARGEUR; i=i+2) {
            listePions.add(new Pion(i,0, "W"));
            listePions.add(new Pion(i,2, "W"));
            listePions.add(new Pion(i+1,1, "W"));
            listePions.add(new Pion(i+1,3, "W"));
            listePions.add(new Pion(i+1,LARGEUR, "B"));
            listePions.add(new Pion(i+1,LARGEUR-2, "B"));
            listePions.add(new Pion(i,LARGEUR-1, "B"));
            listePions.add(new Pion(i,LARGEUR-3, "B"));
        }
    }
    
    
    public void show() {
        // create a 10x10 char array to represent the plateau
        char[][] plateau = new char[LARGEUR][LARGEUR];
        // fill the array with empty spaces
        for (int i = 0; i < LARGEUR; i++) {
            for (int j = 0; j < LARGEUR; j++) {
                plateau[i][j] = ' ';
            }
        }
        // loop through the listePions and place the corresponding char on the plateau
        for (Pion p : listePions) {
            // use 'w' for white pions, 'W' for white dames, 'b' for black pions, and 'B' for black dames
            char c = p.getColor().charAt(0);
            if (p.isDame()) {
                c = Character.toUpperCase(c);
            }
            plateau[p.getX()][p.getY()] = c;
        }
        // print the plateau with borders and coordinates
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        System.out.println(" +--------------------+");
        for (int i = 0; i < LARGEUR; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < LARGEUR; j++) {
                System.out.print(plateau[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(" +--------------------+");
    }

    
}
