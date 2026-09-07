package com.colegiomagico.reto8;

/**
 * Filtra la lista de ingredientes devolviendo solo aquellos que empiezan con 'A'.
 */
public class InventarioPociones {

    public static java.util.List<String> filtrar(java.util.List<String> ingredientes) {
        
      java.util.List<String> ingredientesConA = new java.util.ArrayList<String>();

      for (String ingrediente : ingredientes) {
        if (ingrediente.startsWith("A")) {
            ingredientesConA.add(ingrediente);
        }
      }

      return ingredientesConA;
        // TODO: Cambia esto
    }

    public static void main(String[] args) {
        java.util.List<String> lista = java.util.Arrays.asList("Ajenjo", "Miel");
        System.out.println("Filtrados: " + filtrar(lista));
    }
}
