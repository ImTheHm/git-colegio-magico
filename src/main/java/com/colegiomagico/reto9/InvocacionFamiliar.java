package com.colegiomagico.reto9;

/**
 * Retorna una cadena formateada: 'Familiar: [tipo] llamado [nombre]'.
 */
public class InvocacionFamiliar {

    public static String invocar(String nombre, String tipo) {
        
        String texto = "Familiar: " + tipo + " llamado " + nombre;
        
        return texto; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println(invocar("Hedwig", "Lechuza"));
    }
}
