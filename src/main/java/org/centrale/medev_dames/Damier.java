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
            listePions.add(new Pion(0,i, "W"));
            listePions.add(new Pion(2,i, "W"));
            listePions.add(new Pion(1,i+1, "W"));
            listePions.add(new Pion(3,i+1, "W"));
            listePions.add(new Pion(LARGEUR-1,i+1, "B"));
            listePions.add(new Pion(LARGEUR-3,i+1, "B"));
            listePions.add(new Pion(LARGEUR-2,i, "B"));
            listePions.add(new Pion(LARGEUR-4,i, "B"));
        }
    }
    
    
    public void show() {
        // create a 10x10 String array to represent the plateau
        String[][] plateau = new String[LARGEUR][LARGEUR];
        // fill the array with empty spaces
        for (int i = 0; i < LARGEUR; i++) {
            for (int j = 0; j < LARGEUR; j++) {
                plateau[i][j] = " . ";
            }
        }
        // loop through the listePions and place the corresponding string on the plateau
        for (Pion p : listePions) {
            String pieceRepresentation = getRep(p);
            plateau[p.getX()][p.getY()] = pieceRepresentation;
        }
        // print the plateau with borders and coordinates
        System.out.println("    0  1  2  3  4  5  6  7  8  9");
        System.out.println("  +------------------------------+");
        for (int i = 0; i < LARGEUR; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < LARGEUR; j++) {
                System.out.print(plateau[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("  +------------------------------+");
    }

    public String getRep(Pion p) {
        String rep;
        if (p.getColor().equals("B")) {
            if (p.isDame()){
                rep = ":B:";
            }
            else{
                rep = " B ";
            }
        } else {
            if (p.isDame()){
                rep = ":W:";
            }
            else{
                rep = " W ";
            }
        }
        return rep;
    }

}
