/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados Suma7
 * Enunciado: Lanzar dos dados 1000 veces y contar cuántas veces suman 7 (Random).
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class S12_Ejercicio2 {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int contador = 0;

        for (int i = 0; i < 1000; i++) {
            int dado1 = rnd.nextInt(6) + 1; // 1 a 6
            int dado2 = rnd.nextInt(6) + 1; // 1 a 6

            if (dado1 + dado2 == 7) {
                contador++;
            }
        }

        System.out.println("Veces que la suma fue 7: " + contador);
    }
}
    

