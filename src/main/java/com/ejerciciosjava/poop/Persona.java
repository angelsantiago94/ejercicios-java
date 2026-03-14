package com.ejerciciosjava.poop;

/**
 * Clase Persona para ejercicios de Programación Orientada a Objetos
 * 
 * Esta clase servirá como base para aprender conceptos de POO como:
 * - Atributos y métodos
 * - Constructores
 * - Encapsulamiento
 * - Getters y setters
 */
public class Persona {
    
    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private String dni;
    private double altura;
    private double peso;
    
    /**
     * Ejercicio 1: Constructor vacío
     * 
     * Crea un constructor que no reciba parámetros.
     * Debe inicializar los atributos con valores por defecto:
     * - nombre: "Sin nombre"
     * - edad: 0
     * - dni: "00000000A"
     * - altura: 0.0
     * - peso: 0.0
     */
    public Persona() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Constructor con parámetros
     * 
     * Crea un constructor que reciba nombre, edad y dni.
     * Los demás atributos deben inicializarse con valores por defecto.
     */
    public Persona(String nombre, int edad, String dni) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 3: Constructor completo
     * 
     * Crea un constructor que reciba todos los atributos como parámetros.
     */
    public Persona(String nombre, int edad, String dni, double altura, double peso) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 4: Getters y setters
     * 
     * Crea métodos getter y setter para cada atributo.
     * Los getter deben devolver el valor del atributo.
     * Los setter deben validar los datos antes de asignarlos:
     * - edad: debe ser mayor o igual a 0
     * - altura: debe ser mayor a 0
     * - peso: debe ser mayor a 0
     * - dni: debe tener 9 caracteres (8 números + 1 letra)
     */
    
    // Getter y setter para nombre
    public String getNombre() {
        // Tu código aquí
        return "";
    }
    
    public void setNombre(String nombre) {
        // Tu código aquí
    }
    
    // Getter y setter para edad
    public int getEdad() {
        // Tu código aquí
        return 0;
    }
    
    public void setEdad(int edad) {
        // Tu código aquí
    }
    
    // Getter y setter para dni
    public String getDni() {
        // Tu código aquí
        return "";
    }
    
    public void setDni(String dni) {
        // Tu código aquí
    }
    
    // Getter y setter para altura
    public double getAltura() {
        // Tu código aquí
        return 0.0;
    }
    
    public void setAltura(double altura) {
        // Tu código aquí
    }
    
    // Getter y setter para peso
    public double getPeso() {
        // Tu código aquí
        return 0.0;
    }
    
    public void setPeso(double peso) {
        // Tu código aquí
    }
    
    /**
     * Ejercicio 5: Métodos de comportamiento
     * 
     * Crea los siguientes métodos:
     * 
     * 1. calcularIMC(): calcula el Índice de Masa Corporal
     *    Fórmula: peso / (altura * altura)
     * 
     * 2. esMayorDeEdad(): devuelve true si la persona es mayor de edad (18+)
     * 
     * 3. cumpleaños(): aumenta la edad en 1 año
     * 
     * 4. toString(): devuelve una representación en texto de la persona
     *    Formato: "Persona{nombre='...', edad=..., dni='...'}"
     */
    
    public double calcularIMC() {
        // Tu código aquí
        return 0.0;
    }
    
    public boolean esMayorDeEdad() {
        // Tu código aquí
        return false;
    }
    
    public void cumpleaños() {
        // Tu código aquí
    }
    
    @Override
    public String toString() {
        // Tu código aquí
        return "";
    }
    
    /**
     * Ejercicio 6: Métodos estáticos
     * 
     * Crea los siguientes métodos estáticos:
     * 
     * 1. esMayorDeEdad(int edad): devuelve true si la edad es mayor o igual a 18
     * 
     * 2. validarDNI(String dni): devuelve true si el DNI tiene formato válido
     *    (8 números seguidos de 1 letra)
     */
    
    public static boolean esMayorDeEdad(int edad) {
        // Tu código aquí
        return false;
    }
    
    public static boolean validarDNI(String dni) {
        // Tu código aquí
        return false;
    }
}
