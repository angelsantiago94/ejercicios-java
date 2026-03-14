package com.ejerciciosjava.fundamentos.examenes.examen_variables;

public class GestorVariables {
    private int entero;
    private double decimal;
    private String cadena;
    private boolean logico;
    private char caracter;

    public GestorVariables() {
        this.entero = 0;
        this.decimal = 0.0;
        this.cadena = "";
        this.logico = false;
        this.caracter = '\0';
    }

    public GestorVariables(int entero, double decimal, String cadena, boolean logico, char caracter) {
        this.entero = entero;
        this.decimal = decimal;
        this.cadena = cadena;
        this.logico = logico;
        this.caracter = caracter;
    }

    // Getters y Setters
    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public boolean isLogico() {
        return logico;
    }

    public void setLogico(boolean logico) {
        this.logico = logico;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public String analizarTipoDato() {
        // devuelve un String con el análisis de los tipos de datos actuales:
        // Formato: "Entero: X, Decimal: Y.Y, Cadena: 'TEXTO', Lógico: true/false, Carácter: 'C'"
        // Si cadena está vacía, mostrar 'VACÍA'
        // Si carácter es '\0', mostrar 'NULO'
        // TODO: Implementar este método
        return "";
    }

    public double realizarOperacionesAritmeticas(int a, double b) {
        // realiza las siguientes operaciones con los parámetros:
        // 1. Suma: a + b
        // 2. Multiplicación: a * b
        // 3. División: a / b (controlar división por cero)
        // 4. Módulo: a % (int)b
        // Devuelve el resultado de la suma de todas las operaciones
        // Si hay división por cero, devuelve Double.NaN
        // TODO: Implementar este método
        return 0.0;
    }

    public String convertirTipos() {
        // convierte los tipos de datos de la siguiente manera:
        // - entero a double
        // - decimal a int (truncando)
        // - logico a String ("true"/"false")
        // - caracter a int (código ASCII)
        // Devuelve un String con todos los resultados formateados
        // TODO: Implementar este método
        return "";
    }

    public double calcularAreaCirculo(double radio) {
        // calcula el área de un círculo usando la fórmula: PI * radio^2
        // Usa la constante Math.PI
        // Si el radio es negativo, devuelve -1
        // Redondea el resultado a 2 decimales
        // TODO: Implementar este método
        return 0.0;
    }

    public String manipularCadenas(String texto1, String texto2) {
        // realiza operaciones de manipulación de cadenas:
        // 1. Concatenar texto1 + " " + texto2
        // 2. Longitud total de la concatenación
        // 3. Carácter en la posición media (si la longitud es par, el izquierdo)
        // 4. Convertir todo a mayúsculas
        // Devuelve un String con todos los resultados
        // TODO: Implementar este método
        return "";
    }

    public boolean esPar(int numero) {
        // devuelve true si el número es par
        // false si es impar
        // Maneja números negativos correctamente
        // TODO: Implementar este método
        return false;
    }

    public String evaluarEdad(int edad) {
        // evalúa la edad y devuelve una clasificación:
        // "Niño" (0-12), "Adolescente" (13-17), "Adulto" (18-64), "Adulto Mayor" (65+)
        // Si la edad es negativa, devuelve "Edad inválida"
        // TODO: Implementar este método
        return "";
    }

    public double calcularPromedio(int[] numeros) {
        // calcula el promedio de un array de enteros
        // Si el array está vacío, devuelve 0.0
        // Si el array es null, devuelve -1.0
        // TODO: Implementar este método
        return 0.0;
    }

    public String formatearNumero(double numero) {
        // formatea un número decimal:
        // - Si es entero, mostrar sin decimales
        // - Si tiene decimales, mostrar con 2 decimales
        // - Agregar separadores de miles (ej: 1,234.56)
        // Devuelve el número formateado como String
        // TODO: Implementar este método
        return "";
    }

    @Override
    public String toString() {
        return "GestorVariables{" +
                "entero=" + entero +
                ", decimal=" + decimal +
                ", cadena='" + cadena + '\'' +
                ", logico=" + logico +
                ", caracter=" + caracter +
                '}';
    }
}
