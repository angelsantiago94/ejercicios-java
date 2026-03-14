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
```

## Buenas prácticas

- Usa nombres descriptivos para variables
- Comenta tu código cuando sea necesario
- Indenta correctamente el código
- Prueba cada ejercicio con diferentes valores de entrada
- No te frustres si algo no funciona a la primera, ¡programar es un proceso de aprendizaje!
