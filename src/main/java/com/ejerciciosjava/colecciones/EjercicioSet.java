package com.ejerciciosjava.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejercicios para aprender a usar Set en Java
 * 
 * Set es una interfaz que representa una colección que no permite elementos duplicados.
 * Las implementaciones principales son HashSet, LinkedHashSet y TreeSet.
 */
public class EjercicioSet {
    
    /**
     * Ejercicio 1: Crear y manipular HashSet
     * 
     * Crea un HashSet<String> para almacenar nombres de colores.
     * Realiza las siguientes operaciones:
     * - Agrega 6 colores diferentes
     * - Intenta agregar un color duplicado
     * - Elimina un color
     * - Verifica si contiene un color específico
     * - Imprime el conjunto después de cada operación
     */
    public void ejercicio1() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Comparar HashSet, LinkedHashSet y TreeSet
     * 
     * Crea tres conjuntos con los mismos elementos:
     * - HashSet: no mantiene orden, rendimiento O(1)
     * - LinkedHashSet: mantiene orden de inserción
     * - TreeSet: mantiene orden natural
     * 
     * Agrega los mismos elementos a cada uno y observa el orden.
     */
    public void ejercicio2() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 3: Eliminar duplicados de una lista
     * 
     * Crea una ArrayList<Integer> con elementos duplicados.
     * Usa un Set para eliminar los duplicados:
     * - Convierte la lista a un Set
     * - Convierte el Set de vuelta a una List
     * - Compara los tamaños antes y después
     */
    public void ejercicio3() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 4: Operaciones de conjuntos
     * 
     * Crea dos conjuntos de números:
     * - Conjunto A: {1, 2, 3, 4, 5}
     * - Conjunto B: {4, 5, 6, 7, 8}
     * 
     * Realiza las siguientes operaciones:
     * - Unión: todos los elementos de ambos conjuntos
     * - Intersección: elementos comunes
     * - Diferencia: elementos en A que no están en B
     * - Diferencia simétrica: elementos en uno u otro pero no en ambos
     */
    public void ejercicio4() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 5: Set de objetos personalizados
     * 
     * Crea una clase Persona con nombre y edad.
     * Implementa correctamente equals() y hashCode().
     * Crea un HashSet<Persona> y:
     * - Agrega varias personas
     * - Intenta agregar una persona duplicada (mismo nombre y edad)
     * - Verifica que no se permitan duplicados
     */
    public void ejercicio5() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 6: TreeSet con comparador personalizado
     * 
     * Crea una clase Producto con nombre y precio.
     * Crea un TreeSet<Producto> que ordene por:
     * - Precio ascendente
     * - Si tienen mismo precio, por nombre alfabéticamente
     * 
     * Agrega varios productos y verifica el orden.
     */
    public void ejercicio6() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 7: Rangos en TreeSet
     * 
     * Crea un TreeSet<Integer> con números del 1 al 100.
     * Usa los métodos específicos de TreeSet:
     * - first(): obtener el primer elemento
     * - last(): obtener el último elemento
     * - subSet(): obtener un rango
     * - headSet(): elementos menores que uno dado
     * - tailSet(): elementos mayores o iguales que uno dado
     */
    public void ejercicio7() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 8: Rendimiento y casos de uso
     * 
     * Compara el rendimiento de las tres implementaciones de Set:
     * - Agregar 100,000 elementos
     * - Buscar elementos existentes
     * - Buscar elementos no existentes
     * 
     * Explica cuándo usar cada tipo de Set.
     */
    public void ejercicio8() {
        // Tu código aquí
        
    }
}
