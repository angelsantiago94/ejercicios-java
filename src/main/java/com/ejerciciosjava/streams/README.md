# Streams y Programación Funcional

Este paquete contiene ejercicios para aprender a usar Streams y programación funcional en Java 8+, características que revolucionaron la forma de procesar colecciones en Java.

## Conceptos Fundamentales

### ¿Qué es un Stream?
Un Stream es una secuencia de elementos que puede ser procesada en paralelo o secuencialmente. Los streams permiten realizar operaciones complejas sobre colecciones de forma declarativa y concisa.

### Características clave:
- **Inmutabilidad:** No modifican la fuente de datos
- **Lazy evaluation:** Las operaciones se ejecutan solo cuando se necesitan
- **Pipelining:** Se pueden encadenar múltiples operaciones
- **Paralelización:** Fácilmente convertibles a paralelos

### Pipeline de Stream:
```
Fuente → Operaciones Intermedias → Operación Terminal
```

## Ejercicios Detallados

### Ejercicio 1: Creación de Streams básicos
**Objetivo:** Aprender las diferentes formas de crear streams.

**Fuentes de streams:**
- `Collection.stream()`: Desde colecciones
- `Arrays.stream()`: Desde arrays
- `Stream.of()`: Desde valores individuales
- `Stream.empty()`: Stream vacío
- `Stream.generate()`: Stream infinito

**Conceptos clave:**
- Los streams son una sola vez (no se pueden reutilizar)
- Operaciones lazy vs eager
- Tipos de streams: objeto, primitivos

**Consejos:**
- Usa `try-with-resources` para streams autocloseables
- Los streams infinitos necesitan operaciones limitadoras
- Considera usar `Stream.builder()` para construcción compleja

### Ejercicio 2: Operaciones intermedias básicas
**Objetivo:** Dominar las operaciones que transforman streams.

**Operaciones principales:**
- `filter(Predicate)`: Filtra elementos
- `map(Function)`: Transforma elementos
- `distinct()`: Elimina duplicados
- `sorted()`: Ordena elementos
- `limit(n)`: Limita número de elementos
- `skip(n)`: Salta elementos iniciales

**Consejos:**
- Las operaciones intermedias son lazy
- El orden importa para rendimiento
- `sorted()` necesita comparador para objetos complejos

### Ejercicio 3: Operaciones terminales básicas
**Objetivo:** Aprender a consumir streams y obtener resultados.

**Operaciones principales:**
- `forEach(Consumer)`: Itera elementos
- `collect(Collector)`: Recolecta resultados
- `count()`: Cuenta elementos
- `min/max(Comparator)`: Encuentra extremos
- `findFirst()/findAny()`: Encuentra elementos
- `any/all/noneMatch(Predicate)`: Verifica condiciones

**Concejos:**
- Solo puede haber una operación terminal por pipeline
- `findFirst()` es determinista, `findAny()` no
- Usa `Optional` para manejar resultados opcionales

### Ejercicio 4: Colecciones con Collectors
**Objetivo:** Dominar el recolector de resultados.

**Collectors útiles:**
- `Collectors.toList()`: A lista
- `Collectors.toSet()`: A conjunto
- `Collectors.toMap()`: A mapa
- `Collectors.groupingBy()`: Agrupación
- `Collectors.partitioningBy()`: Partición booleana
- `Collectors.joining()`: Concatenación de strings
- `Collectors.summarizingInt()`: Estadísticas

**Consejos:**
- `groupingBy()` puede tener colector downstream
- Usa `toMap()` con función de merge para claves duplicadas
- `joining()` es eficiente para concatenar strings

### Ejercicio 5: Streams de objetos
**Objetivo:** Trabajar con objetos complejos mediante streams.

**Operaciones comunes:**
- Filtrado por atributos
- Proyección (extraer campos específicos)
- Agrupación por criterios complejos
- Ordenamiento por múltiples criterios
- Cálculos agregados

**Consejos:**
- Usa referencias a métodos (`Person::getName`)
- Considera inmutabilidad de objetos
- Cuidado con `NullPointerException` en atributos

### Ejercicio 6: Operaciones con primitivas
**Objetivo:** Usar streams especializados para mejor rendimiento.

**Streams de primitivas:**
- `IntStream`: Para `int`
- `LongStream`: Para `long`
- `DoubleStream`: Para `double`

**Operaciones especiales:**
- `range(start, end)`: Rango exclusivo
- `rangeClosed(start, end)`: Rango inclusivo
- `summaryStatistics()`: Estadísticas completas
- `average()`, `sum()`, `min()`, `max()`

**Consejos:**
- Mejor rendimiento que boxing/unboxing
- Conversión con `mapToInt()`, `mapToObj()`
- Útiles para operaciones numéricas intensivas

### Ejercicio 7: Streams paralelos
**Objetivo:** Entender cuándo y cómo usar paralelismo.

**Consideraciones:**
- `parallel()`: Convierte a stream paralelo
- `sequential()`: Vuelve a secuencial
- ForkJoinPool framework subyacente
- Overhead vs beneficio

**Cuándo usar paralelos:**
- Grandes cantidades de datos
- Operaciones computacionalmente intensivas
- Fuentes de datos fácilmente divisible
- Sin estado compartido mutable

**Consejos:**
- Mide rendimiento antes de optimizar
- Evita operaciones con estado
- Considera el orden de procesamiento

### Ejercicio 8: Optional y manejo de nulos
**Objetivo:** Usar Optional para evitar NullPointerException.

**Métodos clave:**
- `ofNullable()`: Crear desde valor posiblemente nulo
- `orElse()`: Valor por defecto
- `orElseGet()`: Proveedor de valor por defecto
- `orElseThrow()`: Lanzar excepción si vacío
- `map()`, `flatMap()`: Transformación segura
- `filter()`: Filtrado condicional

**Consejos:**
- No devuelvas null, devuelve Optional
- No uses Optional como parámetro de método
- Prefiere `orElseGet()` sobre `orElse()` para operaciones costosas

### Ejercicio 9: Streams anidados y complejos
**Objetivo:** Manejar estructuras de datos complejas.

**Técnicas avanzadas:**
- `flatMap()`: Aplanar estructuras anidadas
- Streams de valores de Map
- `takeWhile()`/`dropWhile()` (Java 9+)
- `iterate()` mejorado (Java 9+)

**Consejos:**
- `flatMap()` es clave para trabajar con estructuras anidadas
- Considera el rendimiento de operaciones anidadas
- Usa métodos específicos de Java 9+ cuando estén disponibles

### Ejercicio 10: Programación funcional pura
**Objetivo:** Aplicar principios de programación funcional.

**Patrones funcionales:**
- Map-Reduce: Transformar y reducir
- Funciones de orden superior
- Inmutabilidad y pureza
- Composición de funciones
- Closures y captura de variables

**Consejos:**
- Evita side effects en operaciones stream
- Usa funciones puras cuando sea posible
- Considera la legibilidad vs complejidad
- Aprovecha las expresiones lambda

## Buenas Prácticas

### Rendimiento
- Mide antes de optimizar
- Considera el tamaño de datos
- Usa streams paralelos con cuidado
- Evita boxing innecesario

### Legibilidad
- Nombra variables descriptivamente
- Divide pipelines complejos
- Usa referencias a métodos cuando sea apropiado
- Comenta operaciones complejas

### Errores comunes
- No reutilizar streams
- Cuidado con side effects
- No abuses de streams paralelos
- Evita operaciones con estado

## Cómo ejecutar los ejercicios

1. **Configura tu entorno:**
```java
import java.util.*;
import java.util.stream.*;
```

2. **Implementa gradualmente:**
```java
public static void main(String[] args) {
    EjercicioStreams ejercicios = new EjercicioStreams();
    
    ejercicios.ejercicio1();
    ejercicios.ejercicio2();
    // Continúa con los demás ejercicios
}
```

3. **Experimenta:**
   - Prueba diferentes datos de entrada
   - Compara enfoques funcionales vs imperativos
   - Mide rendimiento de diferentes soluciones

## Casos de Uso Prácticos

### Procesamiento de datos
- Filtrado y transformación de colecciones
- Agrupación y agregación de datos
- Búsqueda y clasificación
- Estadísticas y resúmenes

### Operaciones numéricas
- Cálculos estadísticos
- Procesamiento de series numéricas
- Generación de secuencias
- Reducciones complejas

### Manipulación de texto
- Procesamiento de palabras
- Filtrado y transformación de strings
- Análisis de texto
- Formateo y unión

## Recursos Adicionales

### Documentación oficial
- [Java Streams Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [Collectors Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)

### Tutoriales recomendados
- Oracle Java Tutorials on Streams
- Baeldung Java 8 Streams Guide
- Java 8 in Action (libro recomendado)

## Resumen

Los Streams y programación funcional en Java proporcionan:
- **Código más expresivo:** Menos código, más claro
- **Mejor rendimiento:** Paralelización fácil
- **Menos errores:** Inmutabilidad y manejo seguro de nulos
- **Mayor flexibilidad:** Operaciones componibles

Dominar los streams te hará un programador Java más eficiente y moderno. ¡Practica estos ejercicios y experimenta con tus propios casos de uso!
