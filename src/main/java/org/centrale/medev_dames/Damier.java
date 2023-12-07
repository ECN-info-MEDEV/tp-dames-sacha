package org.centrale.medev_dames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class Damier {
    
    private ArrayList<Pion> listePions;
    private static final int LARGEUR = 10;
    
    public Damier(){
        listePions = new ArrayList<>();
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
    
    
    /**
     * Shows the Damier with its Pions
     */
    public void show() {
        String[][] plateau = new String[LARGEUR][LARGEUR];
        // fill the array with empty spaces
        for (int i = 0; i < LARGEUR; i++) {
            for (int j = 0; j < LARGEUR; j++) {
                plateau[i][j] = " . ";
            }
        }
        for (Pion p : listePions) {
            String pieceRepresentation = p.getRep();
            plateau[p.getX()][p.getY()] = pieceRepresentation;
        }
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
    
    public void turn(String color){
        Pion p = selectPion();
    }
    
    public Pion selectPion() {
        System.out.println("Select a Pion:");
        for (int i = 0; i < listePions.size(); i++) {
            Pion p = listePions.get(i);
            System.out.println(i + " : [" + p.getX() + ", " + p.getY() + "]");
        }
        System.out.println("TEST");
        int selectedNumber = getInput();
        while (selectedNumber < 0 || selectedNumber >= listePions.size()) {
            System.out.println("Invalid selection. Please choose a number between 0 and " + (listePions.size() - 1) + ".");
            selectedNumber = getInput();
        }
        return listePions.get(selectedNumber);
    }

    private int getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("TEST _ TEST");
        try {
            int input = scan.nextInt();
            scan.nextLine(); 
            System.out.println("okay" + input);
            return input;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scan.nextLine();
            return getInput();
        }
    }


}
