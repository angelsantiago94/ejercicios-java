package com.ejerciciosjava.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ejercicios para aprender a usar Streams y programación funcional en Java 8+
 * 
 * Los Streams permiten procesar colecciones de datos de forma declarativa
 * y funcional, haciendo el código más conciso y expresivo.
 */
public class EjercicioStreams {
    
    /**
     * Ejercicio 1: Creación de Streams básicos
     * 
     * Crea streams de diferentes fuentes:
     * - A partir de una colección (List)
     * - A partir de un array
     * - A partir de valores individuales (Stream.of)
     * - Stream vacío (Stream.empty)
     * - Stream infinito (Stream.generate)
     */
    public void ejercicio1() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 2: Operaciones intermedias básicas
     * 
     * Usa las siguientes operaciones intermedias sobre una lista de números:
     * - filter(): filtrar elementos pares
     * - map(): transformar cada número al cuadrado
     * - distinct(): eliminar duplicados
     * - sorted(): ordenar los elementos
     * - limit(): limitar a los primeros N elementos
     * - skip(): saltar los primeros N elementos
     */
    public void ejercicio2() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 3: Operaciones terminales básicas
     * 
     * Usa las siguientes operaciones terminales:
     * - forEach(): iterar sobre elementos
     * - collect(): recolectar resultados en una lista
     * - count(): contar elementos
     * - min() y max(): encontrar mínimo y máximo
     * - findFirst() y findAny(): encontrar elementos
     * - anyMatch(), allMatch(), noneMatch(): verificar condiciones
     */
    public void ejercicio3() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 4: Colecciones con Collectors
     * 
     * Usa Collectors para:
     * - toList(): recolectar en List
     * - toSet(): recolectar en Set
     * - toMap(): recolectar en Map
     * - groupingBy(): agrupar por criterio
     * - partitioningBy(): particionar por predicado
     * - joining(): unir strings
     * - summarizingInt(): obtener estadísticas
     */
    public void ejercicio4() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 5: Streams de objetos
     * 
     * Crea una clase Persona con nombre, edad, ciudad.
     * Realiza operaciones sobre una lista de personas:
     * - Filtrar por edad
     * - Agrupar por ciudad
     * - Encontrar la persona más joven
     * - Obtener lista de nombres
     * - Calcular edad promedio
     */
    public void ejercicio5() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 6: Operaciones con primitivas
     * 
     * Usa streams especializados para primitivas:
     * - IntStream: para enteros
     * - LongStream: para long
     * - DoubleStream: para doubles
     * 
     * Realiza operaciones como:
     * - range(): generar rangos numéricos
     * - sum(), average(), summaryStatistics()
     * - mapToObj(), mapToInt(), etc.
     */
    public void ejercicio6() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 7: Streams paralelos
     * 
     * Compara rendimiento entre streams secuenciales y paralelos:
     * - Usa parallel() para crear stream paralelo
     * - Mide tiempo de ejecución para operaciones pesadas
     * - Verifica cuándo es beneficioso usar paralelos
     * - Considera el orden de procesamiento
     */
    public void ejercicio7() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 8: Optional y manejo de nulos
     * 
     * Usa Optional para manejar valores que pueden ser nulos:
     * - ofNullable(): crear Optional de valor posiblemente nulo
     * - orElse(): valor por defecto
     * - orElseGet(): proveedor de valor por defecto
     * - orElseThrow(): lanzar excepción si vacío
     * - map() y flatMap(): transformar valores
     * - filter(): filtrar valores presentes
     */
    public void ejercicio8() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 9: Streams anidados y complejos
     * 
     * Trabaja con estructuras complejas:
     * - List<List<Integer>>: aplanar con flatMap
     * - Map<String, List<Persona>>: procesar valores anidados
     * - Streams infinitos con takeWhile/dropWhile (Java 9+)
     * - Iteración con iterate() (Java 9+)
     */
    public void ejercicio9() {
        // Tu código aquí
        
    }
    
    /**
     * Ejercicio 10: Programación funcional pura
     * 
     * Implementa patrones funcionales:
     * - Map-Reduce: transformar y reducir
     * - Pipeline complejo con múltiples etapas
     * - Funciones de orden superior
     * - Closures y captura de variables
     * - Inmutabilidad y side effects
     */
    public void ejercicio10() {
        // Tu código aquí
        
    }
}
