/*
 * Sesión: S10 - Argumentos Parametros
 * Ejercicio 01: Intercambiar Primitivos
 * Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */


import java.util.Arrays;

public class S10Ejercicio1 {
    // Método que intenta intercambiar los valores
    static void intercambiar(int a, int b) {
        int variable = a;
        a = b;
        b = a;

        System.out.println("Dentro de intercambiar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Antes de intercambiar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        intercambiar(x, y);

        System.out.println("Después de llamar a intercambiar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
