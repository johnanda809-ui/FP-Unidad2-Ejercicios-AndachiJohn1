/*
 * Sesión: S10 - Argumentos Parametros
 * Ejercicio 03: Aplicar Descuento
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */



public class S10_Ejercicio3 {
    
      static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * (1 - pct / 100);
        }
    }

    public static void main(String[] args) {
        double[] precios = {10.0, 250.0, 80.0};

        System.out.println("Antes del descuento:");
        for (double p : precios) {
            System.out.print(p + " ");
        }

        aplicarDescuento(precios, 20);

        System.out.println("\nDespués del descuento:");
        for (double p : precios) {
            System.out.print(p + " ");
        }
    }
}
    

