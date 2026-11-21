/*
 * Sesión: S11 - Ambito Variables
 * Ejercicio 02: Lineas No Compilan
 * Enunciado: Indica qué líneas no compilan y por qué.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S11_Ejercicio2 {

    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println(x); // OK
            System.out.println(y); // OK
        }

        System.out.println(x); // OK
        System.out.println(y); // ERROR
    }
}
 // Una variable local solo puede utilizarse dentro del bloque { } donde fue declarada
 //  Intentar acceder a ella fuera de su ámbito provoca un error de compilación
    

