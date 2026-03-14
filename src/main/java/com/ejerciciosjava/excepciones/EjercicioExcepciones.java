package com.ejerciciosjava.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ejercicios para aprender a manejar excepciones en Java
 * 
 * Las excepciones permiten manejar errores y situaciones excepcionales
 * de manera controlada sin que el programa se detenga abruptamente.
 */
public class EjercicioExcepciones {
    
    /**
     * Ejercicio 1: Excepciones básicas try-catch
     * 
     * Crea un método que realice las siguientes operaciones y maneje las excepciones:
     * - División entre dos números (maneja ArithmeticException)
     * - Acceso a un array (maneja ArrayIndexOutOfBoundsException)
     * - Conversión de String a int (maneja NumberFormatException)
     */
    public void ejercicio1() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Múltiples catch y finally
     * 
     * Crea un método que abra un archivo y lea su contenido.
     * Maneja múltiples excepciones:
     * - FileNotFoundException
     * - SecurityException
     * - Cualquier otra excepción
     * 
     * Usa finally para asegurar que los recursos se cierren.
     */
    public void ejercicio2(String nombreArchivo) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 3: Lanzar excepciones propias
     * 
     * Crea un método que valide una edad:
     * - Si la edad es negativa, lanza IllegalArgumentException
     * - Si la edad es mayor de 120, lanza IllegalArgumentException
     * - Si la edad está entre 18 y 35, lanza una excepción personalizada JovenException
     * - Si la edad es válida, devuelve true
     */
    public boolean ejercicio3(int edad) throws JovenException {
        // Tu código aquí
        return false;
    }
    
    /**
     * Ejercicio 4: Crear excepciones personalizadas
     * 
     * Crea las siguientes clases de excepción:
     * - JovenException: excepción checked
     * - EdadInvalidaException: excepción unchecked
     * 
     * Ambas deben tener constructores que acepten String message.
     */
    
    /**
     * Ejercicio 5: Propagación de excepciones
     * 
     * Crea una cadena de llamadas a métodos:
     * metodoA() -> metodoB() -> metodoC()
     * 
     * metodoC() lanza una excepción
     * metodoB() la captura y lanza una diferente
     * metodoA() captura y maneja ambas
     */
    public void ejercicio5() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 6: Excepciones y recursos (try-with-resources)
     * 
     * Usa try-with-resources para manejar automáticamente el cierre de recursos:
     * - Scanner para leer un archivo
     * - BufferedReader para leer líneas
     * 
     * Demuestra cómo los recursos se cierran automáticamente.
     */
    public void ejercicio6(String nombreArchivo) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 7: Jerarquía de excepciones
     * 
     * Crea una jerarquía de excepciones para una aplicación bancaria:
     * - BancoException (clase base)
     *   - SaldoInsuficienteException
     *   - CuentaNoExistenteException
     *   - LimiteTransferenciaSuperadoException
     * 
     * Crea métodos que lancen estas excepciones apropiadamente.
     */
    public void ejercicio7() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 8: Logging de excepciones
     * 
     * Crea un sistema de logging para excepciones:
     * - Loguea excepciones con diferentes niveles (ERROR, WARN, INFO)
     * - Incluye timestamp y stack trace
     * - Guarda logs en un archivo
     * - Muestra diferentes formatos de logging
     */
    public void ejercicio8() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 9: Excepciones en colecciones
     * 
     * Maneja excepciones comunes al trabajar con colecciones:
     * - NullPointerException en Map
     * - ClassCastException en downcasting
     * - UnsupportedOperationException en colecciones inmutables
     * - ConcurrentModificationException al modificar mientras iteras
     */
    public void ejercicio9() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 10: Patrones de manejo de excepciones
     * 
     * Implementa diferentes patrones de manejo:
     * - Retry pattern: reintentar operación N veces
     * - Circuit breaker: detener reintentos después de fallos consecutivos
     * - Fallback: proporcionar valor por defecto ante fallos
     * - Exception chaining: preservar causa original
     */
    public void ejercicio10() {
        // Tu código aquí
        
    }
}
