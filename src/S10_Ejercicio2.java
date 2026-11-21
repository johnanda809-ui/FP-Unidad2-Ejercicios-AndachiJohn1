/*
 * Sesión: S10 - Argumentos Parametros
 * Ejercicio 02: Intercambiar Arreglo
 * Enunciado: Escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S10_Ejercicio2 {
   
    static void intercambiar(int[] v, int i, int j) {
        int variable = v[i];
        v[i] = v[j];
        v[j] = variable;
    }

    public static void main(String[] args) {
        int[] datos = {1, 77, 15};

        System.out.println("Antes:");
        System.out.println(datos[0] + " " + datos[1] + " " + datos[2] + " ");

        intercambiar(datos, 1, 2);

        System.out.println("Después:");
        System.out.println(datos[0] + " " + datos[1] + " " + datos[2] + " ");
    }
}
    

