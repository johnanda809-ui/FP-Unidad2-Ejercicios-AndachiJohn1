/*
 * Sesión: S10 - Argumentos Parametros
 * Ejercicio 04: Sobrecarga Perimetro
 * Enunciado:Sobrecarga perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S10_Ejercicio4 {
    

    // Perímetro de un cuadrado
    static double perimetro(double lado) {
        return 4 * lado;
    }

    // Perímetro de un rectángulo
    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Perímetro del cuadrado: " + perimetro(5));
        System.out.println("Perímetro del rectángulo: " + perimetro(5, 3));
    }
}

