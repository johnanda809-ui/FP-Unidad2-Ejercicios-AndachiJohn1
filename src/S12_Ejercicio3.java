/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: mínimo 8 caracteres, al menos una mayúscula y un dígito.
 * Autor: Andachi John
 * Fecha: 20/11/2026
 */

public class S12_Ejercicio3 {

    static boolean validar(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        String clave = "Java2024";

        if (validar(clave)) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }
    }
}
    

