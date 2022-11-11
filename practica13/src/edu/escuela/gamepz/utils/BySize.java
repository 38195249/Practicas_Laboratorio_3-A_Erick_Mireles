package edu.escuela.gamepz.utils;

import java.util.Comparator;
import edu.escuela.gamepz.personajes.Personaje;

public class BySize implements Comparator<Personaje>{

    public int compare(Personaje p1, Personaje p2) {
        if(p1.getVida() != p2.getVida()){
            return p2.getVida() - p1.getVida();
        } 
        if (p1.getSize() != p2.getSize()){
            return (p2.getSize()<p1.getSize())? -1:1;
        }
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
