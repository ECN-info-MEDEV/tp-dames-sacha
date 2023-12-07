/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.List;

/**
 *
 * @author sacha
 */
public class Pion {

    //---------------ATTRIBUTES---------------
    private int x;
    private int y;
    private boolean dame;
    private String color;
    //movimiento(List<pion>), comer(List<pion>)
    //---------------CONSTRUCTORS--------------

    public Pion(String color) {
        x=0;
        y=0;
        dame=false;
    }

    public Pion(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.dame = false;
    }

    //---------------GETTERS & SETTERS---------
    public int getX(){
        return x;
        
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isDame() {
        return dame;
    }
    
    public void setDame(boolean dame) {    
        this.dame = dame;
    }

    //---------------METHODES------------------
    /**
     *
     * @param pions
     */
    public void movement(List <Pion> pions) {
        if (dame) {
            
        }
    }
    public void manger(List <Pion> pions){
        
    }
    
    public void test(){
        System.out.println("test");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    /**
     * @return Sting representation of the Pion for the show() method in Damier class
     */
    public String getRep() {
        String rep;
        if (dame){
            return ":"+color+":";
        }
        else{
            return " "+color+" ";
        }
    }
}
