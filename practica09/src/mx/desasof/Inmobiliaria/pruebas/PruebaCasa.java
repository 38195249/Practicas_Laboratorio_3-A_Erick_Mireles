package mx.desasof.Inmobiliaria.pruebas;

import mx.desasof.Inmobiliaria.casas.Campo;
import mx.desasof.Inmobiliaria.casas.Casa;
import mx.desasof.Inmobiliaria.casas.Urbana;

public class PruebaCasa {
        
    public static void main(String[] args) {
        
        Casa [] casas = {new Casa("Estandar", 3, 3000000),
                    new Campo("Cazador", 3.5f, 10f),
                    new Urbana("Residencia", 3, 2500000, 2),
                    new Casa("Estandar", 3, 3000000),
                    new Campo("Cazador", 3.5f, 10f),
                    new Urbana("Residencia", 3, 2500000, 2),
                    new Casa("Estandar"),
                    new Campo("Cazador", 4, 15000, 3.5f, 5f),
                    new Urbana("Residencia", 5)};

        int i= 0;
        while (i < casas.length){
            for (Casa c: casas){
                if (c == casas[i]){
                    System.out.println(c.toString() + " - Son el mismo objeto - " + casas[i].toString());
                    System.out.println(" - - - - - ");
                    break;
                }
                if(c.equals(casas[i])){
                    System.out.println(c.toString() + " - Son objetos iguales - " + casas[i].toString());
                    System.out.println(" e e e e e ");
                    break;
                }  
                System.out.println(c.toString() + " - Son diferentes - "+ casas[i].toString());
                System.out.println(" ! ! ! ! ! ");
            }
            i++;
        }
    }
}
// Preguntar si la posicion de i y c son iguales imprimir son el mismo objeto
// (-----)
// Se termina el ciclo for
// Si no entra preguntar si son iguales imprimir son objetos iguales (objeto x = objeto y)
// (e e e e e)
// Si no imprimir son diferentes
// (! ! ! ! !)