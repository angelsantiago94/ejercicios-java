package com.ejerciciosjava.poop;

/**
 * Clase Estudiante que hereda de Persona
 * 
 * Esta clase servirá para aprender conceptos de herencia y polimorfismo:
 * - Herencia de atributos y métodos
 * - @Override para sobreescribir métodos
 * - super() para llamar constructores de la clase padre
 * - Palabra clave super para acceder a métodos de la clase padre
 */
public class Estudiante extends Persona {
    
    // Atributos específicos de Estudiante
    private String centroEstudios;
    private int curso;
    private double[] notas;
    
    /**
     * Ejercicio 1: Constructores de la clase hija
     * 
     * Crea los siguientes constructores:
     * 
     * 1. Constructor vacío que llame al constructor vacío de Persona
     *    e inicialice los atributos propios con valores por defecto:
     *    - centroEstudios: "Sin centro"
     *    - curso: 1
     *    - notas: array de 5 elementos inicializados en 0.0
     */
    public Estudiante() {
        // Tu código aquí
        
    }
    
    /**
     * 2. Constructor que reciba nombre, edad, dni y centroEstudios
     *    Debe llamar al constructor de Persona con los datos correspondientes
     *    e inicializar curso en 1 y notas en array de 5 ceros.
     */
    public Estudiante(String nombre, int edad, String dni, String centroEstudios) {
        // Tu código aquí
        
    }
    
    /**
     * 3. Constructor completo que reciba todos los parámetros
     *    Debe llamar al constructor completo de Persona
     *    y recibir también centroEstudios, curso y array de notas.
     */
    public Estudiante(String nombre, int edad, String dni, double altura, double peso, 
                      String centroEstudios, int curso, double[] notas) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Getters y setters para atributos propios
     * 
     * Crea getters y setters para:
     * - centroEstudios
     * - curso (validar que sea mayor que 0)
     * - notas (validar que no sea null y tenga entre 1 y 10 elementos)
     */
    
    public String getCentroEstudios() {
        // Tu código aquí
        return "";
    }
    
    public void setCentroEstudios(String centroEstudios) {
        // Tu código aquí
    }
    
    public int getCurso() {
        // Tu código aquí
        return 0;
    }
    
    public void setCurso(int curso) {
        // Tu código aquí
    }
    
    public double[] getNotas() {
        // Tu código aquí
        return null;
    }
    
    public void setNotas(double[] notas) {
        // Tu código aquí
    }
    
    /**
     * Ejercicio 3: Sobreescribir métodos de la clase padre
     * 
     * 1. Sobreescribe el método toString() para incluir información del estudiante
     *    Formato: "Estudiante{nombre='...', edad=..., centroEstudios='...', curso=...}"
     * 
     * 2. Sobreescribe el método cumpleaños() para que además de aumentar la edad,
     *    muestre un mensaje especial si el estudiante cumple 18 años.
     */
    
    @Override
    public String toString() {
        // Tu código aquí
        return "";
    }
    
    @Override
    public void cumpleaños() {
        // Tu código aquí
    }
    
    /**
     * Ejercicio 4: Métodos específicos de Estudiante
     * 
     * Crea los siguientes métodos:
     * 
     * 1. agregarNota(double nota): agrega una nota al array de notas
     *    (si hay espacio, sino muestra un mensaje)
     * 
     * 2. calcularMediaNotas(): calcula el promedio de las notas
     * 
     * 3. getNotaMaxima(): devuelve la nota más alta
     * 
     * 4. getNotaMinima(): devuelve la nota más baja
     * 
     * 5. estaAprobado(): devuelve true si la media es >= 5.0
     * 
     * 6. estudiar(): muestra un mensaje de estudio
     * 
     * 7. hacerExamen(): simula hacer un examen y devuelve una nota aleatoria
     */
    
    public void agregarNota(double nota) {
        // Tu código aquí
    }
    
    public double calcularMediaNotas() {
        // Tu código aquí
        return 0.0;
    }
    
    public double getNotaMaxima() {
        // Tu código aquí
        return 0.0;
    }
    
    public double getNotaMinima() {
        // Tu código aquí
        return 0.0;
    }
    
    public boolean estaAprobado() {
        // Tu código aquí
        return false;
    }
    
    public void estudiar() {
        // Tu código aquí
    }
    
    public double hacerExamen() {
        // Tu código aquí
        return 0.0;
    }
    
    /**
     * Ejercicio 5: Polimorfismo
     * 
     * Crea un método que demuestre polimorfismo:
     * 
     * presentarse(): debe mostrar información diferente según el tipo
     * - Si es una Persona: "Hola, soy [nombre] y tengo [edad] años"
     * - Si es un Estudiante: "Hola, soy [nombre], estudiante de [centro] en [curso]º"
     */
    
    public void presentarse() {
        // Tu código aquí
    }
}
