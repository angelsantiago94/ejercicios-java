# Fundamentos de Java

Este paquete contiene ejercicios para aprender los conceptos básicos de programación en Java.

## Ejercicios Incluidos

### 1. Variables y Tipos de Datos (EjercicioVariables.java)

#### Ejercicio 1: Declaración e inicialización de variables
**Objetivo:** Aprender a declarar y usar diferentes tipos de variables primitivos y objetos.

**Conceptos clave:**
- Tipos primitivos: int, double, boolean
- Tipo objeto: String
- Declaración e inicialización de variables
- Impresión por consola con System.out.println()

**Consejos:**
- Recuerda que en Java las variables deben tener un tipo específico
- Los nombres de variables siguen la convención camelCase
- String es una clase, no un tipo primitivo

#### Ejercicio 2: Operaciones aritméticas básicas
**Objetivo:** Practicar los operadores aritméticos de Java.

**Conceptos clave:**
- Operadores: +, -, *, /, %
- Precedencia de operadores
- División entera vs división decimal

**Consejos:**
- Cuidado con la división entre enteros, el resultado será entero
- El operador % devuelve el resto de la división
- Puedes usar paréntesis para cambiar la precedencia

#### Ejercicio 3: Conversión de tipos (casting)
**Objetivo:** Entender cómo funciona la conversión entre tipos de datos.

**Conceptos clave:**
- Casting implícito (widening)
- Casting explícito (narrowing)
- Pérdida de precisión

**Consejos:**
- Al convertir de double a int, se pierden los decimales (se truncan)
- De double a int es casting explícito (puede perder datos)
- De int a double es casting implícito (no pierde datos)

#### Ejercicio 4: Constantes
**Objetivo:** Aprender a declarar y usar constantes en Java.

**Conceptos clave:**
- Palabra clave final
- Convención de nombres: MAYUSCULAS_CON_GUIONES_BAJOS
- Ventajas de usar constantes

**Consejos:**
- Las constantes no pueden cambiar su valor una vez asignadas
- Es una buena práctica declararlas como static en clases reales
- Usar constantes hace el código más legible y mantenible

### 2. Control de Flujo (EjercicioControlFlujo.java)

#### Ejercicio 1: Condicionales if-else
**Objetivo:** Aprender a tomar decisiones en el código usando condicionales.

**Conceptos clave:**
- Estructura if-else if-else
- Operadores de comparación: ==, !=, <, >, <=, >=
- Operadores lógicos: &&, ||, !

**Consejos:**
- Siempre usa llaves {} aunque sea una sola instrucción
- Verifica el orden de las condiciones cuando hay rangos solapados
- El else final es opcional pero recomendado para manejar casos por defecto

#### Ejercicio 2: Switch-case
**Objetivo:** Usar switch para múltiples condiciones basadas en un valor.

**Conceptos clave:**
- Estructura switch-case
- break para evitar caída (fall-through)
- default para casos no manejados

**Consejos:**
- No olvides los break al final de cada case
- switch funciona con tipos primitivos, String y enum
- El orden de los casos no importa, pero default suele ir al final

#### Ejercicio 3: Bucle for
**Objetivo:** Repetir código un número determinado de veces.

**Conceptos clave:**
- Estructura for (inicialización; condición; incremento)
- Bucles anidados
- Operador módulo para verificar pares/impares

**Consejos:**
- Puedes declarar la variable del bucle dentro del for
- El bucle se ejecuta mientras la condición sea true
- Cuidado con los bucles infinitos

#### Ejercicio 4: Bucle while
**Objetivo:** Repetir código mientras se cumpla una condición.

**Conceptos clave:**
- Estructura while
- Condición antes de ejecutar
- Bucles controlados por contador

**Consejos:**
- El bucle puede no ejecutarse nunca si la condición es false inicialmente
- Asegúrate de modificar la variable de control dentro del bucle
- Útil cuando no sabes cuántas iteraciones necesitas

#### Ejercicio 5: Bucle do-while
**Objetivo:** Ejecutar código al menos una vez y repetir mientras se cumpla una condición.

**Conceptos clave:**
- Estructura do-while
- Condición después de ejecutar
- Garantía de ejecución mínima

**Consejos:**
- El bloque se ejecuta siempre al menos una vez
- Útil para validación de entrada
- No olvides el punto y coma después del while

#### Ejercicio 6: Break y continue
**Objetivo:** Controlar el flujo de los bucles de forma avanzada.

**Conceptos clave:**
- break: salir del bucle completamente
- continue: saltar a la siguiente iteración
- Etiquetas (labels) para bucles anidados

**Consejos:**
- break es útil en bucles de búsqueda
- continue es útil para filtrar elementos
- Úsalos con moderación para mantener el código legible

### 3. Ejercicios Adicionales de Fundamentos (EjercicioNuevosFundamentos.java)

#### Ejercicio 1: Gestión de inventario de tienda
**Objetivo:** Aplicar conceptos de arrays, bucles y condicionales en un contexto real.

**Conceptos clave:**
- Arrays paralelos para almacenar datos relacionados
- Bucles for para recorrer y procesar datos
- Condicionales if para tomar decisiones
- Cálculos de estadísticas básicas
- Formateo de salida

**Consejos:**
- Usa arrays paralelos para mantener datos relacionados
- Recorre los arrays con bucles for tradicionales
- Acumula valores para calcular totales y medias
- Usa String.format() para formatear números decimales

#### Ejercicio 2: Análisis de temperaturas
**Objetivo:** Practicar manejo de datos numéricos y procesamiento de información meteorológica.

**Conceptos clave:**
- Arrays para almacenar datos temporales
- Cálculo de diferencias y medias
- Comparación de valores numéricos
- Búsqueda de máximos y mínimos
- Manejo de cadenas de texto

**Consejos:**
- Almacena datos por día para facilitar el procesamiento
- Calcula diferencias entre valores relacionados
- Usa variables para acumular resultados
- Compara valores para encontrar máximos y mínimos

#### Ejercicio 3: Gestión de notas de estudiantes
**Objetivo:** Aplicar conceptos de arrays, bucles y cálculos estadísticos en contexto educativo.

**Conceptos clave:**
- Arrays para almacenar datos de estudiantes
- Cálculo de notas medias
- Conteo de condiciones específicas
- Porcentajes y estadísticas
- Validación de datos

**Consejos:**
- Calcula notas medias usando operaciones aritméticas básicas
- Usa contadores para registrar condiciones específicas
- Calcula porcentajes dividiendo y multiplicando por 100
- Valida los datos antes de procesarlos

### 4. Ejercicios Adicionales de Control de Flujo (EjercicioNuevosControlFlujo.java)

#### Ejercicio 1: Sistema de gestión de biblioteca
**Objetivo:** Practicar bucles while, switch-case y procesamiento de datos dinámicos.

**Conceptos clave:**
- Bucle while con condición de salida
- Switch-case para clasificar datos
- Contadores por categoría
- Procesamiento dinámico de entrada
- Cálculos de porcentajes

**Consejos:**
- Usa while cuando no sabes cuántos datos se introducirán
- Switch-case es ideal para clasificar por categorías fijas
- Acumula contadores para cada categoría
- Calcula porcentajes al final del procesamiento

#### Ejercicio 2: Análisis de ventas de tienda
**Objetivo:** Aplicar bucles for, arrays y cálculos de ratios y estadísticas.

**Conceptos clave:**
- Arrays para datos semanales
- Bucles for para procesar datos fijos
- Cálculo de ratios y estadísticas
- Búsqueda de mejores valores
- Manejo de división por cero

**Consejos:**
- Usa for cuando sabes exactamente cuántas iteraciones necesitas
- Cuidado con la división por cero al calcular ratios
- Almacena valores máximos mientras procesas
- Usa condicionales para manejar casos especiales

#### Ejercicio 3: Control de acceso a evento
**Objetivo:** Combinar bucles while, arrays y procesamiento de datos temporales.

**Conceptos clave:**
- Bucle while con condición de salida compleja
- Arrays para datos por hora
- Parseo de cadenas a números
- Conteo por categorías
- Cálculos de medias y máximos

**Consejos:**
- Usa condiciones complejas en while para controlar la entrada
- Parsea cadenas cuando necesitas extraer datos numéricos
- Usa arrays indexados para datos temporales
- Valida los datos antes de usarlos como índices

## Cómo ejecutar los ejercicios

1. Abre el archivo Java correspondiente
2. Completa el código donde indica "// Tu código aquí"
3. Crea un método main para probar tus soluciones:
```java
public static void main(String[] args) {
    EjercicioVariables ejercicios = new EjercicioVariables();
    ejercicios.ejercicio1();
    // Llama a otros ejercicios según necesites
}

// Para los nuevos ejercicios:
EjercicioNuevosFundamentos nuevosFundamentos = new EjercicioNuevosFundamentos();
nuevosFundamentos.ejercicio1(); // o ejercicio2(), ejercicio3()

EjercicioNuevosControlFlujo nuevosControl = new EjercicioNuevosControlFlujo();
nuevosControl.ejercicio1(); // o ejercicio2(), ejercicio3()
```

## Buenas prácticas

- Usa nombres descriptivos para variables
- Comenta tu código cuando sea necesario
- Indenta correctamente el código
- Prueba cada ejercicio con diferentes valores de entrada
- No te frustres si algo no funciona a la primera, ¡programar es un proceso de aprendizaje!
