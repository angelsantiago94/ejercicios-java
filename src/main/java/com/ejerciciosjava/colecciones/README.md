# Colecciones en Java

Este paquete contiene ejercicios para aprender a usar las colecciones del Java Collections Framework.

## Ejercicios Incluidos

### 1. List (EjercicioList.java)

**List** es una colección ordenada que permite elementos duplicados y acceso por índice.

#### Implementaciones principales:
- **ArrayList:** Array redimensionable, acceso rápido O(1), inserción/eliminación lenta O(n)
- **LinkedList:** Lista doblemente enlazada, acceso lento O(n), inserción/eliminación rápida O(1)

#### Ejercicios:

**Ejercicio 1: Crear y manipular ArrayList**
- **Conceptos:** Creación, adición, modificación, eliminación
- **Métodos clave:** add(), add(index, element), set(), remove()
- **Consejos:** ArrayList crece automáticamente, usa generics para type safety

**Ejercicio 2: Recorrer una List**
- **Conceptos:** Iteración, diferentes formas de recorrido
- **Métodos:** for tradicional, for-each, Iterator
- **Consejos:** for-each es más simple, Iterator permite eliminación segura

**Ejercicio 3: Búsqueda en List**
- **Conceptos:** Búsqueda de elementos, verificación de existencia
- **Métodos:** contains(), indexOf(), get(), isEmpty()
- **Consejos:** contains() usa equals(), indexOf() devuelve -1 si no encuentra

**Ejercicio 4: Ordenamiento de List**
- **Conceptos:** Ordenación natural y personalizada
- **Métodos:** Collections.sort(), Collections.reverseOrder(), Comparator
- **Consejos:** Los objetos deben implementar Comparable para orden natural

**Ejercicio 5: ArrayList vs LinkedList**
- **Conceptos:** Comparación de rendimiento, casos de uso
- **Análisis:** ArrayList para acceso aleatorio, LinkedList para inserciones frecuentes
- **Consejos:** Mide rendimiento con System.nanoTime() para comparaciones

**Ejercicio 6: List de objetos personalizados**
- **Conceptos:** Colecciones de objetos, equals() y hashCode()
- **Requisitos:** Implementar equals() para búsquedas correctas
- **Consejos:** Usa @Override para equals() y hashCode()

**Ejercicio 7: Operaciones avanzadas**
- **Conceptos:** Sublistas, operaciones masivas
- **Métodos:** subList(), removeAll(), retainAll(), clear()
- **Consejos:** subList() crea una vista, no una copia

**Ejercicio 8: Conversión entre tipos**
- **Conceptos:** Interoperabilidad entre arrays y colecciones
- **Métodos:** toArray(), Arrays.asList(), constructor de colección
- **Consejos:** Arrays.asList() crea una lista de tamaño fijo

### 2. Set (EjercicioSet.java)

**Set** es una colección que no permite elementos duplicados.

#### Implementaciones principales:
- **HashSet:** Implementación basada en HashMap, rendimiento O(1), sin orden
- **LinkedHashSet:** Mantienen orden de inserción, rendimiento ligeramente menor
- **TreeSet:** Implementación basada en TreeMap, orden natural, rendimiento O(log n)

#### Ejercicios:

**Ejercicio 1: Crear y manipular HashSet**
- **Conceptos:** Creación, adición, eliminación, verificación
- **Métodos:** add(), remove(), contains(), size()
- **Consejos:** add() devuelve false si el elemento ya existe

**Ejercicio 2: Comparar implementaciones**
- **Conceptos:** Diferencias en orden y rendimiento
- **Observación:** HashSet sin orden, LinkedHashSet orden inserción, TreeSet orden natural
- **Consejos:** Elige según necesites orden o rendimiento

**Ejercicio 3: Eliminar duplicados**
- **Conceptos:** Uso de Set para eliminar duplicados de List
- **Técnica:** Convertir List -> Set -> List
- **Consejos:** HashSet es más rápido para esta operación

**Ejercicio 4: Operaciones de conjuntos**
- **Conceptos:** Unión, intersección, diferencia, diferencia simétrica
- **Métodos:** addAll(), retainAll(), removeAll()
- **Consejos:** Crea copias antes de operaciones destructivas

**Ejercicio 5: Set de objetos personalizados**
- **Conceptos:** equals() y hashCode() para objetos en Set
- **Requisitos:** Ambos métodos deben ser consistentes
- **Consejos:** Usa IDE para generar equals() y hashCode()

**Ejercicio 6: TreeSet con comparador**
- **Conceptos:** Ordenación personalizada en TreeSet
- **Técnica:** Comparator en constructor o Comparable en clase
- **Consejos:** El comparador debe ser consistente con equals()

**Ejercicio 7: Rangos en TreeSet**
- **Conceptos:** Métodos específicos de TreeSet
- **Métodos:** first(), last(), subSet(), headSet(), tailSet()
- **Consejos:** Útiles para consultas de rango eficientes

**Ejercicio 8: Rendimiento y casos de uso**
- **Conceptos:** Análisis de rendimiento, selección apropiada
- **Decisiones:** HashSet para velocidad, TreeSet para orden, LinkedHashSet para orden inserción
- **Consejos:** Considera el tamaño de datos y frecuencia de operaciones

### 3. Map (EjercicioMap.java)

**Map** es una colección de pares clave-valor, no permite claves duplicadas.

#### Implementaciones principales:
- **HashMap:** Implementación basada en tabla hash, rendimiento O(1), sin orden
- **LinkedHashMap:** Mantiene orden de inserción, rendimiento ligeramente menor
- **TreeMap:** Implementación basada en árbol rojo-negro, orden natural, O(log n)

#### Ejercicios:

**Ejercicio 1: Crear y manipular HashMap**
- **Conceptos:** Pares clave-valor, operaciones básicas
- **Métodos:** put(), get(), remove(), containsKey(), containsValue()
- **Consejos:** put() reemplaza valor si clave ya existe

**Ejercicio 2: Recorrer un Map**
- **Conceptos:** Diferentes formas de iteración
- **Métodos:** keySet(), values(), entrySet()
- **Consejos:** entrySet() es más eficiente si necesitas clave y valor

**Ejercicio 3: Comparar implementaciones**
- **Conceptos:** Diferencias en orden y rendimiento
- **Observación:** HashMap sin orden, LinkedHashMap orden inserción, TreeMap orden claves
- **Consejos:** Elige según necesites orden de claves

**Ejercicio 4: Contador de palabras**
- **Conceptos:** Uso práctico de Map para conteo
- **Técnica:** getOrDefault() o compute() para conteo eficiente
- **Consejos:** Usa split() y toLowerCase() para procesamiento de texto

**Ejercicio 5: Diccionario sinónimos**
- **Conceptos:** Map con valores complejos (List)
- **Estructura:** Map<String, List<String>>
- **Consejos:** Inicializa las listas cuando sea necesario

**Ejercicio 6: Map anidados**
- **Conceptos:** Estructuras jerárquicas con Map
- **Estructura:** Map<String, Map<String, Double>>
- **Consejos:** Útil para datos multidimensionales

**Ejercicio 7: Operaciones avanzadas**
- **Conceptos:** Métodos convenientes de Java 8+
- **Métodos:** putIfAbsent(), getOrDefault(), computeIfAbsent(), merge()
- **Consejos:** Estos métodos simplifican mucho el código

**Ejercicio 8: TreeMap con rangos**
- **Conceptos:** Consultas de rango eficientes
- **Métodos:** floorEntry(), ceilingEntry(), subMap()
- **Consejos:** floorEntry() encuentra la clave más grande <= clave buscada

## Cómo ejecutar los ejercicios

1. **Importa las clases necesarias:**
```java
import java.util.*;
import java.util.stream.*;
```

2. **Crea un método main:**
```java
public static void main(String[] args) {
    EjercicioList ejerciciosList = new EjercicioList();
    ejerciciosList.ejercicio1();
    
    EjercicioSet ejerciciosSet = new EjercicioSet();
    ejerciciosSet.ejercicio1();
    
    EjercicioMap ejerciciosMap = new EjercicioMap();
    ejerciciosMap.ejercicio1();
}
```

3. **Prueba gradualmente:**
   - Implementa un ejercicio a la vez
   - Verifica los resultados imprimiendo las colecciones
   - Experimenta con diferentes datos

## Buenas Prácticas

### Generics
- Usa siempre tipos genéricos: `List<String>` en lugar de `List`
- Evita tipos crudos para mayor seguridad en tiempo de compilación

### Inmutabilidad
- Considera usar `Collections.unmodifiableList()` para colecciones de solo lectura
- Usa `List.of()` (Java 9+) para crear listas inmutables

### Rendimiento
- Elige la implementación correcta según tus necesidades
- Considera el tamaño inicial para colecciones grandes
- Usa `ArrayList(capacidad)` si conoces el tamaño aproximado

### Java 8+
- Aprovecha los métodos default añadidos en Java 8
- Considera usar Streams para operaciones complejas
- Usa expresiones lambda para comparadores personalizados

## Consejos de Aprendizaje

1. **Visualiza las estructuras:** Dibuja cómo se organizan los datos
2. **Experimenta:** Prueba diferentes métodos y observa resultados
3. **Mide rendimiento:** Usa System.nanoTime() para comparar implementaciones
4. **Casos de uso:** Piensa en situaciones reales para cada tipo de colección
5. **API documentation:** Consulta JavaDoc para descubrir más métodos

## Resumen de Cuándo Usar Cada Colección

### Usa List cuando:
- Necesitas mantener orden de inserción
- Permites elementos duplicados
- Necesitas acceso por índice
- La posición de los elementos es importante

### Usa Set cuando:
- No quieres elementos duplicados
- La unicidad es importante
- Necesitas operaciones de conjunto (unión, intersección)
- El rendimiento de búsqueda es crítico

### Usa Map cuando:
- Necesitas asociaciones clave-valor
- Las claves deben ser únicas
- Necesitas búsqueda rápida por clave
- Quieres indexar datos por identificadores
