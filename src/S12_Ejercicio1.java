/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Distancia Puntos
 * Enunciado: Distancia entre dos puntos con Math.sqrt y Math.pow.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S12_Ejercicio1 { 

    static double distancia(double x1, double y1,
                            double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }

    public static void main(String[] args) {
        double d = distancia(9, 12, 4, 15);

        System.out.println("Distancia = " + d);
    }
}

    

