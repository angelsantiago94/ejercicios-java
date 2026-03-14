package com.ejerciciosjava.fundamentos;

import java.util.Scanner;

/**
 * Ejercicios adicionales de estructuras de control
 * Basados en el estilo de los PDFs de exámenes
 * 
 * ESTUDIANTE: Completa el código donde se indica con // TODO:
 */
public class EjercicioNuevosControlFlujo {

    /**
     * Ejercicio 1: Sistema de gestión de biblioteca
     * Una biblioteca registra préstamos de libros durante un mes
     * Para cada préstamo se registra: título del libro, género, días de préstamo, estado (Nuevo/Usado)
     * El programa debe:
     * - Pedir préstamos hasta que se introduzca "FIN" como título
     * - Mostrar género más solicitado
     * - Libro con más días de préstamo
     * - Porcentaje de libros nuevos
     * - Si algún préstamo supera 30 días, mostrar "Préstamo prolongado"
     */
    public void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Declarar variables necesarias:
        // - Contadores para cada género (Ficción, Ciencia, Historia, Otros)
        // - Contador total de libros y libros nuevos
        // - Variables para máximo de días y título correspondiente
        // - Bandera para préstamos largos
        
        // TODO: Crear bucle while que pida préstamos hasta introducir "FIN"
        // Dentro del bucle:
        // - Pedir título, género, días de préstamo, estado
        // - Usar switch-case para contar por género
        // - Contar libros nuevos
        // - Verificar préstamos largos (>30 días)
        // - Actualizar máximo de días si es necesario
        
        // TODO: Si se introdujeron libros:
        // - Determinar género más solicitado comparando contadores
        // - Calcular porcentaje de libros nuevos
        // - Mostrar todos los resultados
        
        // TODO: Si no se introdujeron libros, mostrar mensaje adecuado
        
        scanner.close();
    }

    /**
     * Ejercicio 2: Análisis de ventas de tienda
     * Una tienda registra ventas diarias durante una semana
     * Para cada día se registra: día de semana, número de ventas, total facturado, número de devoluciones
     * El programa debe:
     * - Pedir datos de 7 días
     * - Mostrar día con mayor facturación
     * - Ventas totales de la semana
     * - Día con mayor ratio ventas/devoluciones
     * - Si algún día supera 1000€ en facturación, mostrar "Día excelente"
     */
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int[] numVentas = new int[7];
        double[] totalFacturado = new double[7];
        int[] numDevoluciones = new int[7];
        
        // TODO: Pedir datos de 7 días usando bucle for
        // Para cada día pedir: número de ventas, total facturado, número de devoluciones
        
        // TODO: Encontrar día con mayor facturación
        // Recorrer array totalFacturado para encontrar máximo y día correspondiente
        
        // TODO: Calcular ventas totales de la semana
        // Sumar todos los numVentas y totalFacturado
        
        // TODO: Encontrar día con mejor ratio ventas/devoluciones
        // Para cada día calcular ratio = numVentas[i] / numDevoluciones[i]
        // Cuidado con división entre cero
        // Guardar día con mejor ratio
        
        // TODO: Verificar si hubo algún día excelente (facturación > 1000€)
        
        // TODO: Mostrar todos los resultados
        
        scanner.close();
    }

    /**
     * Ejercicio 3: Control de acceso a evento
     * Un evento registra entradas de asistentes
     * Para cada asistente se registra: tipo de entrada (VIP/Regular/Estudiante), edad, hora de llegada
     * El programa debe:
     * - Pedir datos hasta que se introduzca hora 99:99
     * - Mostrar tipo de entrada más vendida
     * - Edad media de los asistentes
     * - Hora con mayor afluencia
     * - Si hay más de 10 estudiantes, mostrar "Evento educativo"
     */
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Declarar variables necesarias:
        // - Contadores para cada tipo de entrada
        // - Contador total de asistentes y suma de edades
        // - Array para contador por hora (0-23)
        // - Bandera para evento educativo
        
        // TODO: Crear bucle while que pida datos hasta hora "99:99"
        // Dentro del bucle:
        // - Pedir tipo de entrada, edad, hora de llegada
        // - Parsear la hora para obtener solo el número de hora (0-23)
        // - Usar switch-case para contar por tipo de entrada
        // - Acumular edad y contador por hora
        // - Verificar si hay más de 10 estudiantes
        
        // TODO: Si se introdujeron asistentes:
        // - Determinar tipo de entrada más vendido
        // - Calcular edad media
        // - Encontrar hora con mayor afluencia (máximo en array por hora)
        // - Mostrar todos los resultados
        
        // TODO: Si no se introdujeron asistentes, mostrar mensaje adecuado
        
        scanner.close();
    }

    public static void main(String[] args) {
        EjercicioNuevosControlFlujo ejercicios = new EjercicioNuevosControlFlujo();
        
        System.out.println("=== EJERCICIOS ADICIONALES DE ESTRUCTURAS DE CONTROL ===");
        System.out.println("1. Sistema de gestión de biblioteca");
        System.out.println("2. Análisis de ventas de tienda");
        System.out.println("3. Control de acceso a evento");
        
        // TODO: Descomenta el ejercicio que quieres probar:
        // ejercicios.ejercicio1();
        // ejercicios.ejercicio2();
        // ejercicios.ejercicio3();
    }
}
