package com.ejerciciosjava.fundamentos;

import java.util.Scanner;

/**
 * Ejercicios adicionales de fundamentos de Java
 * Basados en el estilo de los PDFs de exámenes
 * 
 * ESTUDIANTE: Completa el código donde se indica con // TODO:
 */
public class EjercicioNuevosFundamentos {

    /**
     * Ejercicio 1: Gestión de inventario de tienda
     * Una tienda tiene 5 tipos de productos: A, B, C, D, E
     * Para cada producto se registra: nombre, precio unitario, stock actual, stock mínimo
     * El programa debe:
     * - Pedir datos de los 5 productos
     * - Mostrar producto con mayor precio
     * - Productos con stock por debajo del mínimo
     * - Valor total del inventario
     * - Si algún producto vale más de 100€, mostrar "Producto premium"
     */
    public void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para almacenar datos
        String[] nombres = new String[5];
        double[] precios = new double[5];
        int[] stockActual = new int[5];
        int[] stockMinimo = new int[5];
        
        // TODO: Pedir datos de los 5 productos usando un bucle for
        // Para cada producto pedir: nombre, precio unitario, stock actual, stock mínimo
        
        // TODO: Encontrar producto con mayor precio
        // Recorrer el array de precios para encontrar el máximo y su nombre
        
        // TODO: Calcular valor total del inventario
        // Sumar (precio * stockActual) para todos los productos
        
        // TODO: Contar productos con stock por debajo del mínimo
        // Recorrer y contar cuando stockActual[i] < stockMinimo[i]
        
        // TODO: Verificar si hay algún producto premium (precio > 100€)
        
        // TODO: Mostrar todos los resultados
        
        scanner.close();
    }

    /**
     * Ejercicio 2: Análisis de temperaturas
     * Un laboratorio meteorológico registra temperaturas diarias durante una semana
     * Para cada día se registra: temperatura máxima, mínima y estado del cielo (Soleado, Nublado, Lluvioso)
     * El programa debe:
     * - Pedir datos de 7 días
     * - Mostrar temperatura media de la semana
     * - Día con mayor diferencia térmica
     * - Días soleados
     * - Si algún día la temperatura máxima supera 35°C, mostrar "Ola de calor"
     */
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double[] tempMax = new double[7];
        double[] tempMin = new double[7];
        String[] estadoCielo = new String[7];
        
        // TODO: Pedir datos de los 7 días usando un bucle for
        // Para cada día pedir: temperatura máxima, mínima, estado del cielo
        
        // TODO: Calcular temperatura media de la semana
        // Sumar todas las temperaturas (máximas y mínimas) y dividir por 14
        
        // TODO: Encontrar día con mayor diferencia térmica
        // Calcular (tempMax[i] - tempMin[i]) para cada día y encontrar el máximo
        
        // TODO: Contar días soleados
        // Contar cuando estadoCielo[i] es "Soleado" (ignorar mayúsculas/minúsculas)
        
        // TODO: Verificar si hay ola de calor (alguna tempMax > 35°C)
        
        // TODO: Mostrar todos los resultados
        
        scanner.close();
    }

    /**
     * Ejercicio 3: Gestión de notas de estudiantes
     * Un profesor registra notas de 10 estudiantes
     * Para cada estudiante: nombre, nota primer parcial, nota segundo parcial, asistencia (%)
     * El programa debe:
     * - Pedir datos de 10 estudiantes
     * - Mostrar estudiante con mayor nota media
     * - Estudiantes con nota media suspensa (<5)
     * - Porcentaje de asistencia media
     * - Si algún estudiante tiene asistencia < 50%, mostrar "Asistencia crítica"
     */
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        
        String[] nombres = new String[10];
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] asistencia = new double[10];
        
        // TODO: Pedir datos de 10 estudiantes usando un bucle for
        // Para cada estudiante pedir: nombre, nota primer parcial, nota segundo parcial, asistencia
        
        // TODO: Calcular notas medias para cada estudiante
        // Crear array notasMedias y calcular (nota1[i] + nota2[i]) / 2
        
        // TODO: Encontrar estudiante con mayor nota media
        // Recorrer notasMedias para encontrar el máximo y su nombre
        
        // TODO: Contar estudiantes con nota media suspensa
        // Contar cuando notasMedias[i] < 5
        
        // TODO: Calcular porcentaje de asistencia media
        // Sumar todas asistencias y dividir entre 10
        
        // TODO: Verificar si hay asistencia crítica (alguna asistencia < 50%)
        
        // TODO: Mostrar todos los resultados
        
        scanner.close();
    }

    public static void main(String[] args) {
        EjercicioNuevosFundamentos ejercicios = new EjercicioNuevosFundamentos();
        
        System.out.println("=== EJERCICIOS ADICIONALES DE FUNDAMENTOS ===");
        System.out.println("1. Gestión de inventario de tienda");
        System.out.println("2. Análisis de temperaturas");
        System.out.println("3. Gestión de notas de estudiantes");
        
        // TODO: Descomenta el ejercicio que quieres probar:
        // ejercicios.ejercicio1();
        // ejercicios.ejercicio2();
        // ejercicios.ejercicio3();
    }
}
