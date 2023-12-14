/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_dames;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sacha et Mario
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
        List<Pion> casesLibresPion = new ArrayList<>();
        int pos_x = 0;
        int pos_y = 0;
        boolean caseValide = false;
        if (dame) {
            System.out.println("Les cases libres pour la dame sont :");
            for (Pion cases : casesLibres) {
                System.out.println("(" + cases.getX() + ", " + cases.getY() + ")");
            }
            do {
                System.out.println("Veuillez entrer les coordonnées de la case vers laquelle vous souhaitez déplacer la dame:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                caseValide = casesLibres.stream().anyMatch(c -> c.getX() == pos_x && c.getY() == pos_y);
                if (!caseValide) {
                    System.out.println("La case saisie n'est pas valide. Veuillez réessayer..");
                }
            } while (!caseValide);
        } else {
            System.out.println("Les cases libres pour le pion sont:");
            if (casesLibres.size() > 1) {
                System.out.println("(" + casesLibres.get(0).getX() + ", " + casesLibres.get(0).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(0).getX(), casesLibres.get(0).getY(), ""));
                System.out.println("(" + casesLibres.get(1).getX() + ", " + casesLibres.get(1).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(1).getX(), casesLibres.get(1).getY(), ""));

            } else if (casesLibres.size() == 1) {
                System.out.println("(" + casesLibres.get(0).getX() + ", " + casesLibres.get(0).getY() + ")");
                casesLibresPion.add(new Pion(casesLibres.get(0).getX(), casesLibres.get(0).getY(), ""));
            } else {
                System.out.println("Il n'y a pas de cases libres pour le pion..");
            }
            do {
                System.out.println("Veuillez entrer les coordonnées de la case vers laquelle vous souhaitez déplacer le pion:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                caseValide = casesLibresPion.stream().anyMatch(c -> c.getX() == pos_x && c.getY() == pos_y);
                if (!caseValide) {
                    System.out.println("La case saisie n'est pas valide. Veuillez réessayer.");
                }

            } while (!caseValide);
        }

        if (!casesLibres.isEmpty()) {
            do {
                System.out.println("Veuillez entrer les coordonnées de la case vers laquelle vous souhaitez déplacer le pion:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                caseValide = casesLibresPion.stream().anyMatch(c -> c.getX() == x && c.getY() == y);
                if (!caseValide) {
                    System.out.println("La case saisie n'est pas valide. Veuillez réessayer.");
                }

                // Verificar si se ha comido un peón
                if (caseValide) {
                    Pion pionMovido = new Pion(x, y, color);
                    manger(casesLibres, pionMovido);
                }

            } while (!caseValide);
        }
    }

    public void manger(List<Pion> pions, Pion pion_A_Manger) {
        Iterator<Pion> iterator = pions.iterator();
        while (iterator.hasNext()) {
            Pion peon = iterator.next();
            if (peon.getX() == pion_A_Manger.getX() && peon.getY() == pion_A_Manger.getY() && !peon.getColor().equals(pion_A_Manger.getColor())) {
                iterator.remove(); // Elimina el peón de otro color
                break; // Solo se permite comer un peón a la vez
            }
        }
    }

    public void test() {
        System.out.println("test");
    }

    public List<Pion> getCasesLibres(List<Pion> pions) {
        List<Pion> casillasLibres = new ArrayList<>();
        int X = this.getX();
        int Y = this.getY();

        int i = 1;
        while (X + i < 8 && Y + i < 8) {
            final int finalI = i;  
            if (pions.stream().noneMatch(p -> p.getX() == X + finalI && p.getY() == Y + finalI)) {
                casillasLibres.add(new Pion(X + finalI, Y + finalI, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X - i >= 0 && y + i < 8) {
            final int finalI = i;  
            if (pions.stream().noneMatch(p -> p.getX() == X - finalI && p.getY() == Y + finalI)) {
                casillasLibres.add(new Pion(X - finalI, Y + finalI, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X + i < 8 && y - i >= 0) {
            final int finalI = i;  
            if (pions.stream().noneMatch(p -> p.getX() == X + finalI && p.getY() == Y - finalI)) {
                casillasLibres.add(new Pion(X + finalI, Y - finalI, ""));
            } else {
                break;
            }
            i++;
        }
        i = 1;
        while (X - i >= 0 && y - i >= 0) {
            final int finalI = i;  
            if (pions.stream().noneMatch(p -> p.getX() == X - finalI && p.getY() == Y - finalI)) {
                casillasLibres.add(new Pion(X - finalI, Y - finalI, ""));
            } else {
                break;
            }
            i++;
        }
        return casillasLibres;
    }

}
