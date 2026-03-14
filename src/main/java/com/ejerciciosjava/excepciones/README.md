# Excepciones y Manejo de Errores

Este paquete contiene ejercicios para aprender a manejar excepciones en Java, un concepto fundamental para crear aplicaciones robustas y confiables.

## Conceptos Fundamentales

### ¿Qué son las excepciones?
Las excepciones son eventos que ocurren durante la ejecución de un programa que interrumpen el flujo normal de instrucciones. Java proporciona un mecanismo robusto para manejar estas situaciones excepcionales.

### Jerarquía de Excepciones
```
Throwable
├── Error (problemas graves, no deberías manejarlos)
└── Exception
    ├── RuntimeException (unchecked, no requieren declaración)
    │   ├── NullPointerException
    │   ├── IllegalArgumentException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── ...
    └── IOException (checked, requieren declaración)
        ├── FileNotFoundException
        ├── EOFException
        └── ...
```

### Checked vs Unchecked
- **Checked:** Deben ser declaradas con `throws` o capturadas con `try-catch`
- **Unchecked:** No requieren declaración, pero pueden ser capturadas

## Ejercicios Detallados

### Ejercicio 1: Excepciones básicas try-catch
**Objetivo:** Aprender el manejo básico de excepciones comunes.

**Excepciones a manejar:**
- `ArithmeticException`: División por cero
- `ArrayIndexOutOfBoundsException`: Acceso fuera de límites
- `NumberFormatException`: Conversión inválida

**Conceptos clave:**
- Bloque `try`: Código que puede lanzar excepciones
- Bloque `catch`: Maneja excepciones específicas
- Múltiples `catch`: Para diferentes tipos de excepciones

**Consejos:**
- Captura las excepciones más específicas primero
- Usa `printStackTrace()` para depuración
- Proporciona mensajes útiles al usuario

### Ejercicio 2: Múltiples catch y finally
**Objetivo:** Entender el bloque `finally` y el manejo de recursos.

**Conceptos clave:**
- `finally`: Se ejecuta siempre, haya o no excepción
- Manejo de múltiples excepciones
- Liberación de recursos

**Consejos:**
- Usa `finally` para cerrar archivos, conexiones, etc.
- El bloque `finally` se ejecuta incluso si hay `return`
- Evita lanzar nuevas excepciones en `finally`

### Ejercicio 3: Lanzar excepciones propias
**Objetivo:** Aprender a lanzar excepciones usando `throw`.

**Conceptos clave:**
- Palabra clave `throw`: Lanza una excepción
- Validación de parámetros
- Excepciones personalizadas

**Consejos:**
- Lanza excepciones con mensajes descriptivos
- Usa `IllegalArgumentException` para parámetros inválidos
- Considera crear excepciones personalizadas para dominio específico

### Ejercicio 4: Crear excepciones personalizadas
**Objetivo:** Diseñar excepciones específicas para tu aplicación.

**Tipos de excepciones:**
- **Checked:** Para condiciones recuperables
- **Unchecked:** Para errores de programación

**Buenas prácticas:**
- Hereda de `Exception` para checked
- Hereda de `RuntimeException` para unchecked
- Proporciona constructores estándar

### Ejercicio 5: Propagación de excepciones
**Objetivo:** Entender cómo las excepciones se propagan en la pila de llamadas.

**Conceptos clave:**
- Propagación automática hacia arriba
- Captura y relanzamiento con `throw`
- Encadenamiento de excepciones

**Consejos:**
- Captura excepciones solo donde puedas manejarlas significativamente
- Usa `throw new Exception("mensaje", originalException)` para encadenar
- No captures excepciones solo para relanzarlas sin añadir valor

### Ejercicio 6: Excepciones y recursos (try-with-resources)
**Objetivo:** Aprender el manejo automático de recursos (Java 7+).

**Conceptos clave:**
- `try-with-resources`: Cierra recursos automáticamente
- Interfaz `AutoCloseable`
- Sintaxis simplificada

**Consejos:**
- Cualquier recurso que implemente `AutoCloseable` puede usarse
- Múltiples recursos separados por punto y coma
- Más seguro y legible que `finally` manual

### Ejercicio 7: Jerarquía de excepciones
**Objetivo:** Diseñar jerarquías de excepciones coherentes.

**Conceptos clave:**
- Herencia de excepciones
- Agrupación por dominio
- Captura por niveles

**Consejos:**
- Crea excepciones base para cada dominio
- Usa excepciones específicas para diferentes condiciones
- Captura excepciones base para manejo genérico

### Ejercicio 8: Logging de excepciones
**Objetivo:** Implementar registro sistemático de excepciones.

**Conceptos clave:**
- Niveles de logging (ERROR, WARN, INFO, DEBUG)
- Stack traces
- Timestamps y contexto

**Consejos:**
- Usa frameworks de logging (Log4j, SLF4J)
- Incluye contexto suficiente para depuración
- Evita logging en producción de información sensible

### Ejercicio 9: Excepciones en colecciones
**Objetivo:** Manejar excepciones comunes con colecciones.

**Excepciones comunes:**
- `NullPointerException`: Claves nulas en HashMap
- `ClassCastException`: Downcasting incorrecto
- `UnsupportedOperationException`: Colecciones inmutables
- `ConcurrentModificationException`: Modificación durante iteración

**Consejos:**
- Usa `Objects.requireNonNull()` para validación
- Verifica tipos antes de casting
- Usa `Collections.unmodifiable...()` para inmutabilidad explícita

### Ejercicio 10: Patrones de manejo de excepciones
**Objetivo:** Implementar patrones avanzados de manejo.

**Patrones implementados:**
- **Retry Pattern:** Reintentar operaciones fallidas
- **Circuit Breaker:** Detener reintentos tras fallos consecutivos
- **Fallback:** Proporcionar alternativas ante fallos
- **Exception Chaining:** Preservar causa raíz

**Consejos:**
- Limita el número de reintentos para evitar bucles infinitos
- Implementa backoff exponencial para reintentos
- Proporciona valores por defecto razonables

## Buenas Prácticas Generales

### Cuándo lanzar excepciones
- Para condiciones excepcionales, no para flujo normal
- Cuando no puedas recuperar del error localmente
- Para validar parámetros de métodos públicos

### Cuándo capturar excepciones
- Cuando puedas manejar la condición significativamente
- Para traducir excepciones de bajo nivel a de dominio
- Para recursos cleanup o logging

### Qué NO hacer
- No captures `Exception` genéricamente sin buen motivo
- No ignores excepciones (catch vacío)
- No uses excepciones para control de flujo normal
- No captures excepciones solo para relanzarlas sin añadir valor

### Mensajes de excepción
- Sé específico sobre qué falló
- Incluye valores relevantes
- Proporciona contexto para depuración
- Evita información sensible en producción

## Cómo ejecutar los ejercicios

1. **Implementa las clases de excepción:**
```java
// Completa JovenException.java y EdadInvalidaException.java
// Ambas ya tienen la estructura básica
```

2. **Implementa los ejercicios gradualmente:**
```java
public static void main(String[] args) {
    EjercicioExcepciones ejercicios = new EjercicioExcepciones();
    
    try {
        ejercicios.ejercicio1();
        ejercicios.ejercicio2("archivo.txt");
        ejercicios.ejercicio3(25); // Esto lanzará JovenException
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

3. **Prueba diferentes escenarios:**
   - Casos normales y excepcionales
   - Diferentes tipos de entrada
   - Condiciones límite

## Consejos de Aprendizaje

1. **Experimenta activamente:** Modifica los ejercicios para ver qué pasa
2. **Lee stack traces:** Aprende a interpretarlos para depurar
3. **Usa el debugger:** Paso a través del flujo de excepciones
4. **Crea tus propios ejemplos:** Aplica conceptos a problemas reales
5. **Consulta JavaDoc:** Revisa las excepciones que lanzan los métodos

## Herramientas Útiles

### Debugging
- IDE debugger con breakpoints en excepciones
- `Thread.dumpStack()` para stack traces manuales
- `e.printStackTrace()` para salida estándar

### Logging
- `java.util.logging` (incluido en Java)
- Log4j 2 (popular y configurable)
- SLF4J con Logback (moderno y flexible)

### Testing
- JUnit para probar casos excepcionales
- `assertThrows()` para verificar excepciones esperadas
- Mock frameworks para simular condiciones de error

## Resumen

El manejo adecuado de excepciones es crucial para crear aplicaciones Java robustas:
- **Previenen crashes:** La aplicación continúa ejecutándose
- **Facilitan depuración:** Información clara sobre errores
- **Mejoran experiencia:** Mensajes útiles para usuarios
- **Simplifican mantenimiento:** Código más organizado y predecible

Domina estos conceptos y estarás en camino de convertirte en un programador Java más competente y confiable.
