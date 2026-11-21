/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar Vocales
 * Enunciado: Contar vocales de una frase (String + Character).
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S12_Ejercicio4 {

    public static void main(String[] args) {
        String frase = "Hola";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Vocales: " + contador);
    }
}
    

