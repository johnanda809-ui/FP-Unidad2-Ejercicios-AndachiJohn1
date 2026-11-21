/*
 * Sesión: S11 - Ambito Variables
 * Ejercicio 02: Marcar Ambito
 * Enunciado:Marca con colores el ámbito de cada variable de un programa impreso de 25 líneas.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S11_Ejercicio1 {
   
    static int contador = 0; // Azul

    public static void main(String[] args) {
        int x = 10; // Verde

        if (x > 5) {
            int y = 20; // Rojo
            System.out.println(x + y);
        }

        for (int i = 0; i < 3; i++) { // Amarillo
            System.out.println(i);
        }
    }
}
    

