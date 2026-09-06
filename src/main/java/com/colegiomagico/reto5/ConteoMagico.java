package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
       Integer numero = 0;
       Integer sumaNum = 0;
       

       while (numero <= limite) {
        sumaNum += numero;
        numero++;
       }
    
       return sumaNum;
        
        // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
