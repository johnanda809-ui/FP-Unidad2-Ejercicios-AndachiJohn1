/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Generar Codigo
 * Enunciado: Generar un código de 6 caracteres: 3 letras aleatorias + 3 dígitos.
 * Autor: Andachi John
 * Fecha: dd/mm/aaaa
 */

import java.util.Random;

public class S12_Ejercicio5 {
    
    public static void main(String[] args) {
        Random r = new Random();

        char a = (char) ('A' + r.nextInt(26));
        char b = (char) ('A' + r.nextInt(26));
        char c = (char) ('A' + r.nextInt(26));

        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);
        int n3 = r.nextInt(10);

        System.out.println("" + a + b + c + n1 + n2 + n3);
    }
}
    

