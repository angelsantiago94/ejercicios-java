package com.ejerciciosjava.fundamentos.examenes.examen_variables;

public class TestVariables {
    public static void main(String[] args) {
        // Crear gestores con diferentes datos
        GestorVariables gestor1 = new GestorVariables(25, 3.14159, "Hola Mundo", true, 'A');
        GestorVariables gestor2 = new GestorVariables(0, 0.0, "", false, '\0');
        GestorVariables gestor3 = new GestorVariables(-5, -2.5, "Test", true, 'Z');

        System.out.println("=== EXAMEN DE VARIABLES Y TIPOS DE DATOS ===");
        System.out.println();

        System.out.println("=== GESTORES CREADOS ===");
        System.out.println("Gestor 1: " + gestor1);
        System.out.println("Gestor 2: " + gestor2);
        System.out.println("Gestor 3: " + gestor3);
        System.out.println();

        // Pruebas (descomentar cuando implementes los métodos)
        /*
        System.out.println("=== PRUEBAS DE MÉTODOS ===");
        
        System.out.println("1. Análisis de tipos de datos:");
        System.out.println("   Gestor 1: " + gestor1.analizarTipoDato());
        System.out.println("   Gestor 2: " + gestor2.analizarTipoDato());
        System.out.println();
        
        System.out.println("2. Operaciones aritméticas:");
        System.out.println("   (10, 3.5): " + gestor1.realizarOperacionesAritmeticas(10, 3.5));
        System.out.println("   (5, 0): " + gestor1.realizarOperacionesAritmeticas(5, 0));
        System.out.println();
        
        System.out.println("3. Conversión de tipos:");
        System.out.println("   Gestor 1: " + gestor1.convertirTipos());
        System.out.println("   Gestor 2: " + gestor2.convertirTipos());
        System.out.println();
        
        System.out.println("4. Cálculo de área de círculo:");
        System.out.println("   Radio 5: " + gestor1.calcularAreaCirculo(5));
        System.out.println("   Radio -3: " + gestor1.calcularAreaCirculo(-3));
        System.out.println();
        
        System.out.println("5. Manipulación de cadenas:");
        System.out.println("   ('Hola', 'Mundo'): " + gestor1.manipularCadenas("Hola", "Mundo"));
        System.out.println("   ('Java', 'Programación'): " + gestor1.manipularCadenas("Java", "Programación"));
        System.out.println();
        
        System.out.println("6. Números pares:");
        System.out.println("   4 es par: " + gestor1.esPar(4));
        System.out.println("   7 es par: " + gestor1.esPar(7));
        System.out.println("   -2 es par: " + gestor1.esPar(-2));
        System.out.println();
        
        System.out.println("7. Evaluación de edades:");
        System.out.println("   Edad 15: " + gestor1.evaluarEdad(15));
        System.out.println("   Edad 25: " + gestor1.evaluarEdad(25));
        System.out.println("   Edad 70: " + gestor1.evaluarEdad(70));
        System.out.println("   Edad -5: " + gestor1.evaluarEdad(-5));
        System.out.println();
        
        System.out.println("8. Cálculo de promedios:");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {};
        int[] array3 = null;
        System.out.println("   [1,2,3,4,5]: " + gestor1.calcularPromedio(array1));
        System.out.println("   []: " + gestor1.calcularPromedio(array2));
        System.out.println("   null: " + gestor1.calcularPromedio(array3));
        System.out.println();
        
        System.out.println("9. Formateo de números:");
        System.out.println("   1234.567: " + gestor1.formatearNumero(1234.567));
        System.out.println("   1000: " + gestor1.formatearNumero(1000));
        System.out.println("   987654.321: " + gestor1.formatearNumero(987654.321));
        */
    }
}
