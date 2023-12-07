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
            listePions.add(new Pion(i,0));
        }
    }
    
    
}
