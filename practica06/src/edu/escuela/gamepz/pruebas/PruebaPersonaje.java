package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
public class PruebaPersonaje {
    public static void main(String[] args){
        Personaje per01 = new Personaje("Almendra" , 200);
        Personaje per02 = new Personaje("Ricardo" , 10);
        Personaje per03 = new Personaje("Blanca" , 1);
        Personaje per04 = new Personaje("Leonel" , -10);
        Personaje per05 = new Personaje("Hector" , 500);
        per01.getDetalle();
        per02.getDetalle();
        per03.getDetalle();
        per04.getDetalle();
        per05.getDetalle();
        System.out.println("------");

        Personaje per06 = per05;
        Personaje per07 = per04;
        Personaje per08 = per03;
        Personaje per09 = per02;
        Personaje per10 = per01;
        per06.setNombre("Francisco Xavier Zepeda Flores");
        per07.setEdad((int) Math. random()*1000);
        per08.setNombre("Dayan");
        per09.setEdad((int) Math.random()*1000);
        per10.setNombre("Axel Fabian Eduardo David");
        System.out.println("------");
        per01.getDetalle();
        per02.getDetalle();
        per03.getDetalle();
        per04.getDetalle();
        per05.getDetalle();
    }
    
}