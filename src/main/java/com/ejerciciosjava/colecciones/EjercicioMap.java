package com.ejerciciosjava.colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Ejercicios para aprender a usar Map en Java
 * 
 * Map es una interfaz que representa una colección de pares clave-valor.
 * No permite claves duplicadas pero sí valores duplicados.
 */
public class EjercicioMap {
    
    /**
     * Ejercicio 1: Crear y manipular HashMap
     * 
     * Crea un HashMap<String, Integer> para almacenar nombres y edades.
     * Realiza las siguientes operaciones:
     * - Agrega 5 personas con sus edades
     * - Modifica la edad de una persona existente
     * - Elimina una persona
     * - Verifica si existe una persona específica
     * - Imprime el mapa después de cada operación
     */
    public void ejercicio1() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Recorrer un Map
     * 
     * Crea un HashMap<String, String> para almacenar códigos postales y ciudades.
     * Recorre el mapa de tres formas diferentes:
     * 1. Solo claves (keySet)
     * 2. Solo valores (values)
     * 3. Pares clave-valor (entrySet)
     */
    public void ejercicio2() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 3: Comparar HashMap, LinkedHashMap y TreeMap
     * 
     * Crea tres mapas con los mismos elementos:
     * - HashMap: no mantiene orden
     * - LinkedHashMap: mantiene orden de inserción
     * - TreeMap: mantiene orden natural de las claves
     * 
     * Agrega los mismos elementos y observa el orden.
     */
    public void ejercicio3() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 4: Contador de palabras
     * 
     * Crea un método que reciba un texto y cuente la frecuencia de cada palabra.
     * Usa un Map<String, Integer> donde:
     * - Clave: la palabra
     * - Valor: número de veces que aparece
     * 
     * Ignora mayúsculas/minúsculas y caracteres de puntuación.
     */
    public void ejercicio4(String texto) {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 5: Diccionario sinónimos
     * 
     * Crea un Map<String, List<String>> para almacenar sinónimos:
     * - Clave: una palabra
     * - Valor: lista de sinónimos
     * 
     * Agrega varias palabras con sus sinónimos y permite buscar sinónimos.
     */
    public void ejercicio5() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 6: Map anidados
     * 
     * Crea una estructura para almacenar información de estudiantes por curso:
     * Map<String, Map<String, Double>>
     * - Clave externa: nombre del curso
     * - Clave interna: nombre del estudiante
     * - Valor: nota del estudiante
     * 
     * Agrega datos y calcula estadísticas por curso.
     */
    public void ejercicio6() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 7: Operaciones avanzadas
     * 
     * Realiza las siguientes operaciones sobre un HashMap:
     * - putIfAbsent(): agregar solo si la clave no existe
     * - getOrDefault(): obtener valor con valor por defecto
     * - replace(): reemplazar valor de una clave existente
     * - computeIfAbsent(): calcular valor si la clave no existe
     * - merge(): combinar valores existentes con nuevos
     */
    public void ejercicio7() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 8: TreeMap con rangos
     * 
     * Crea un TreeMap<Integer, String> para almacenar rangos de notas:
     * - 90-100: "Sobresaliente"
     * - 80-89: "Notable"
     * - 70-79: "Bien"
     * - 60-69: "Suficiente"
     * - 0-59: "Insuficiente"
     * 
     * Usa floorEntry() para encontrar la calificación correcta.
     */
    public void ejercicio8() {
        // Tu código aquí
        
    }
}
