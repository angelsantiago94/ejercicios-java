package com.ejerciciosjava.arrays.examenes.examen_arrays;

public class GestorArrays {
    private int[] numeros;
    private int[][] matriz;
    private String[] palabras;

    public GestorArrays() {
        this.numeros = new int[0];
        this.matriz = new int[0][0];
        this.palabras = new String[0];
    }

    public GestorArrays(int[] numeros, int[][] matriz, String[] palabras) {
        this.numeros = numeros;
        this.matriz = matriz;
        this.palabras = palabras;
    }

    // Getters y Setters
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public int sumaElementos() {
        // devuelve la suma de todos los elementos del array numeros
        // si el array está vacío, devuelve 0
        // TODO: Implementar este método
        return 0;
    }

    public int encontrarMaximo() {
        // devuelve el valor máximo del array numeros
        // si el array está vacío, lanza IllegalArgumentException
        // TODO: Implementar este método
        return 0;
    }

    public int[] invertirArray() {
        // devuelve un nuevo array con los elementos de numeros en orden inverso
        // no debe modificar el array original
        // TODO: Implementar este método
        return new int[0];
    }

    public boolean esSimetrica() {
        // devuelve true si la matriz es simétrica (matriz[i][j] == matriz[j][i])
        // solo considera matrices cuadradas
        // TODO: Implementar este método
        return false;
    }

    public int sumaDiagonalPrincipal() {
        // devuelve la suma de la diagonal principal de la matriz
        // si no es matriz cuadrada, lanza IllegalArgumentException
        // TODO: Implementar este método
        return 0;
    }

    public int contarPalabrasLongitud(int longitud) {
        // cuenta cuántas palabras del array palabras tienen exactamente la longitud especificada
        // ignora palabras null o vacías
        // TODO: Implementar este método
        return 0;
    }

    public String[] palabrasConLetra(char letra) {
        // devuelve un array con todas las palabras que contienen la letra especificada
        // búsqueda case-insensitive
        // si no hay palabras que cumplan, devuelve array vacío
        // TODO: Implementar este método
        return new String[0];
    }

    public double mediaElementos() {
        // devuelve la media aritmética de los elementos del array numeros
        // si el array está vacío, lanza IllegalArgumentException
        // TODO: Implementar este método
        return 0.0;
    }

    public int[] eliminarDuplicados() {
        // devuelve un nuevo array con los elementos de numeros sin duplicados
        // mantiene el orden de aparición original
        // TODO: Implementar este método
        return new int[0];
    }
}
