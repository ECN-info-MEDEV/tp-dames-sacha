/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.ArrayList;
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
        x = 0;
        y = 0;
        dame = false;
    }

    public Pion(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.dame = false;
    }

    //---------------GETTERS & SETTERS---------
    public int getX() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //---------------METHODES------------------
    /**
     *
     * @param casesLibres
     */
    public void movement(List<Pion> casesLibres) {
        Scanner scanner = new Scanner(System.in);
        List <Pion> casesLibresPion = new ArrayList<>();
        
        if (dame) {
            System.out.println("Las casillas libres para la dama son:");
            for (Pion cases : casesLibres) {
                System.out.println("(" + cases.getX() + ", " + cases.getY() + ")");
            }
            System.out.println("Ingrese las coordenadas de la casilla a la que desea mover el pion:");
            do{
                int x = scanner.nextInt();
                int y = scanner.nextInt();
            }while();
            this.setX(x);
            this.setY(y);
        } else {
            System.out.println("Las casillas libres para el pion son:");
            if (casesLibres.size() > 1) {
                System.out.println("(" + casesLibres.get(0).getX() + ", " + casesLibres.get(0).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(0).getX(), casesLibres.get(0).getY(), ""));
                System.out.println("(" + casesLibres.get(1).getX() + ", " + casesLibres.get(1).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(1).getX(), casesLibres.get(1).getY(), ""));
                
            } else if (casesLibres.size() == 1) {
                System.out.println("(" + casesLibres.get(0).getX() + ", " + casesLibres.get(0).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(0).getX(), casesLibres.get(0).getY(), ""));
            } else {
                System.out.println("No hay casillas libres para el pion.");
            }
            
        }
    }

    public void manger(List<Pion> pions) {

    }

    public void test() {
        System.out.println("test");
    }

    public List<Pion> getCasesLibres(List<Pion> pions) {
        List<Pion> casillasLibres = new ArrayList<>();
        int X = this.getX();
        int Y = this.getY();
        int i = 1;
        while (X + i < 8 && y + i < 8) {
            if (pions.stream().noneMatch(p -> p.getX() == X + i && p.getY() == Y + i)) {
                casillasLibres.add(new Pion(X + i, Y + i, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X - i >= 0 && y + i < 8) {
            if (pions.stream().noneMatch(p -> p.getX() == X - i && p.getY() == Y + i)) {
                casillasLibres.add(new Pion(X - i, Y + i, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X + i < 8 && y - i >= 0) {
            if (pions.stream().noneMatch(p -> p.getX() == X + i && p.getY() == Y - i)) {
                casillasLibres.add(new Pion(X + i, Y - i, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X - i >= 0 && y - i >= 0) {
            if (pions.stream().noneMatch(p -> p.getX() == X - i && p.getY() == Y - i)) {
                casillasLibres.add(new Pion(X - i, Y - i, ""));
            } else {
                break;
            }
            i++;
        }
        return casillasLibres;
    }

}
