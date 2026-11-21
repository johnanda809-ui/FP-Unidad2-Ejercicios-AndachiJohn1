/*
 * Sesión: S11 - Ambito Variables
 * Ejercicio 04: Reescribir SinStatic
 * Enunciado: Reescribe un programa que usa 3 atributos static para que use parámetros y return.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S11_Ejercicio4 {


    static int a = 67;
    static int b = 8;
    static int c = 16;

    static int suma() {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(suma());
    }
}
    

