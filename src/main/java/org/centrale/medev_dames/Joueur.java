package org.centrale.medev_dames;

import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class Joueur {
    private String color;
    private String name;
    
    public Joueur(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public Joueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = scanner.nextLine();
    }
        
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
