package com.ejerciciosjava.arrays.examenes.examen_arrays;

public class TestArrays {
    public static void main(String[] args) {
        // Crear datos de prueba
        int[] numeros = {5, 2, 8, 3, 9, 2, 5, 1};
        int[][] matriz = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        String[] palabras = {"Java", "Python", "JavaScript", "C++", "Ruby", "Go"};

        GestorArrays gestor = new GestorArrays(numeros, matriz, palabras);

        System.out.println("=== GESTOR DE ARRAYS - EXAMEN ===");
        System.out.println("Array de números: " + java.util.Arrays.toString(numeros));
        System.out.println("Matriz: ");
        imprimirMatriz(matriz);
        System.out.println("Array de palabras: " + java.util.Arrays.toString(palabras));
        System.out.println();

        // Pruebas (descomentar cuando implementes los métodos)
        /*
        System.out.println("1. Suma de elementos: " + gestor.sumaElementos());
        System.out.println("2. Valor máximo: " + gestor.encontrarMaximo());
        System.out.println("3. Array invertido: " + java.util.Arrays.toString(gestor.invertirArray()));
        System.out.println("4. ¿Es simétrica la matriz?: " + gestor.esSimetrica());
        System.out.println("5. Suma diagonal principal: " + gestor.sumaDiagonalPrincipal());
        System.out.println("6. Palabras de longitud 4: " + gestor.contarPalabrasLongitud(4));
        System.out.println("7. Palabras con letra 'a': " + java.util.Arrays.toString(gestor.palabrasConLetra('a')));
        System.out.println("8. Media de elementos: " + gestor.mediaElementos());
        System.out.println("9. Sin duplicados: " + java.util.Arrays.toString(gestor.eliminarDuplicados()));
        */
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
