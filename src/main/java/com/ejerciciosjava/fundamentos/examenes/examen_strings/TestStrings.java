package com.ejerciciosjava.fundamentos.examenes.examen_strings;

public class TestStrings {
    public static void main(String[] args) {
        // Crear textos de prueba
        String texto1 = "  Java es un lenguaje de programación orientado a objetos  ";
        String texto2 = "Anita lava la tina";
        String texto3 = "Programación en Java es divertido y educativo";

        ProcesadorTexto procesador1 = new ProcesadorTexto(texto1);
        ProcesadorTexto procesador2 = new ProcesadorTexto(texto2);
        ProcesadorTexto procesador3 = new ProcesadorTexto(texto3);

        System.out.println("=== PROCESADOR DE TEXTO - EXAMEN ===");
        System.out.println("Texto 1: \"" + texto1 + "\"");
        System.out.println("Texto 2: \"" + texto2 + "\"");
        System.out.println("Texto 3: \"" + texto3 + "\"");
        System.out.println();

        // Pruebas con texto1 (descomentar cuando implementes los métodos)
        /*
        System.out.println("=== Análisis del Texto 1 ===");
        System.out.println("1. Número de palabras: " + procesador1.contarPalabras());
        System.out.println("2. Número de vocales: " + procesador1.contarVocales());
        System.out.println("3. Texto invertido: \"" + procesador1.invertirTexto() + "\"");
        System.out.println("4. Texto en mayúsculas: \"" + procesador1.textoMayusculas() + "\"");
        System.out.println("5. ¿Es palíndromo?: " + procesador1.esPalindromo());
        System.out.println("6. Dividir por vocales: " + java.util.Arrays.toString(procesador1.dividirPorVocales()));
        System.out.println("7. Reemplazar vocales por '*': \"" + procesador1.reemplazarVocales('*') + "\"");
        System.out.println("8. Eliminar espacios extra: \"" + procesador1.eliminarEspaciosExtra() + "\"");
        System.out.println("9. Palabras de longitud par: " + procesador1.contarPalabrasLongitudPar());
        System.out.println("10. Palabra más larga: \"" + procesador1.palabraMasLarga() + "\"");
        System.out.println();

        System.out.println("=== Análisis del Texto 2 (Palíndromo) ===");
        System.out.println("¿Es palíndromo?: " + procesador2.esPalindromo());
        System.out.println("Texto invertido: \"" + procesador2.invertirTexto() + "\"");
        System.out.println();

        System.out.println("=== Análisis del Texto 3 ===");
        System.out.println("Palabra más larga: \"" + procesador3.palabraMasLarga() + "\"");
        System.out.println("Palabras de longitud par: " + procesador3.contarPalabrasLongitudPar());
        */
    }
}
