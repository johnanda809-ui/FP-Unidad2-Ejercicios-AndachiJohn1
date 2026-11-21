/*
 * Sesión: S11 - Ambito Variables
 * Ejercicio 03: Traza Contador Static
 * Enunciado: Haz la traza de un programa con un contador static llamado desde un for.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S11_Ejercicio3 {

    static int contador = 0;

    static void incrementar() {
        contador++;
        System.out.println("Contador = " + contador);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            incrementar();
        }
    }
}
    

