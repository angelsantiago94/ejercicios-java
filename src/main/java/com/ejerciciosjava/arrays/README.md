# Arrays en Java

Este paquete contiene ejercicios para aprender a trabajar con arrays unidimensionales y bidimensionales en Java.

## Ejercicios Incluidos

### 1. Arrays Unidimensionales (EjercicioArraysUnidimensionales.java)

#### Ejercicio 1: Declaración y inicialización de arrays
**Objetivo:** Aprender a crear y asignar valores a arrays.

**Conceptos clave:**
- Declaración de arrays: tipo[] nombre = new tipo[tamaño]
- Inicialización con llaves: {valor1, valor2, ...}
- Acceso a elementos: array[indice]
- Propiedad length para obtener el tamaño

**Consejos:**
- Los índices en Java empiezan en 0
- El último índice válido es array.length - 1
- Cuidado con ArrayIndexOutOfBoundsException

#### Ejercicio 2: Recorrer un array con bucle for
**Objetivo:** Practicar el recorrido de arrays usando bucles.

**Conceptos clave:**
- Bucle for tradicional: for(int i = 0; i < array.length; i++)
- Bucle for-each: for(tipo elemento : array)
- Acceso secuencial a elementos

**Consejos:**
- El bucle for-each es más simple pero no te da el índice
- El bucle tradicional te permite modificar elementos
- Usa for-each cuando solo necesitas leer valores

#### Ejercicio 3: Calcular suma y promedio
**Objetivo:** Realizar operaciones matemáticas sobre arrays.

**Conceptos clave:**
- Acumuladores para sumas
- Cálculo de promedio: suma / cantidad
- Uso de double para divisiones con decimales

**Consejos:**
- Inicializa siempre los acumuladores en 0
- Cuidado con la división entre enteros
- Considera el caso de arrays vacíos

#### Ejercicio 4: Encontrar el máximo y mínimo
**Objetivo:** Implementar algoritmos de búsqueda en arrays.

**Conceptos clave:**
- Algoritmo de búsqueda lineal
- Variables para guardar máximos y mínimos
- Inicialización con el primer elemento

**Consejos:**
- Inicializa max con el valor más pequeño posible o el primer elemento
- Inicializa min con el valor más grande posible o el primer elemento
- Considera el caso de arrays vacíos

#### Ejercicio 5: Buscar un elemento
**Objetivo:** Implementar búsqueda de elementos específicos.

**Conceptos clave:**
- Búsqueda lineal
- Comparación de elementos
- Retorno de índices o valores especiales (-1 para no encontrado)

**Consejos:**
- Puedes detener la búsqueda cuando encuentres el elemento
- Considera si puede haber múltiples ocurrencias
- Usa break para salir del bucle cuando encuentres el elemento

#### Ejercicio 6: Contar elementos pares
**Objetivo:** Filtrar y contar elementos que cumplen una condición.

**Conceptos clave:**
- Operador módulo (%) para verificar paridad
- Contadores
- Generación de números aleatorios: Math.random()

**Consejos:**
- Math.random() genera un double entre 0.0 y 1.0
- Multiplica y castea para obtener enteros en un rango
- Un número es par si numero % 2 == 0

#### Ejercicio 7: Invertir un array
**Objetivo:** Manipular el orden de los elementos de un array.

**Conceptos clave:**
- Creación de arrays nuevos
- Recorrido en orden inverso
- Copia de elementos

**Consejos:**
- El nuevo array debe tener el mismo tamaño
- Puedes usar dos índices: uno creciente, uno decreciente
- También puedes hacerlo intercambiando elementos en el mismo array

#### Ejercicio 8: Eliminar duplicados
**Objetivo:** Implementar algoritmos de eliminación de duplicados.

**Conceptos clave:**
- Arrays temporales
- Verificación de existencia previa
- Manejo de tamaño dinámico

**Consejos:**
- Necesitarás un array auxiliar o un ArrayList
- Verifica si un elemento ya existe antes de agregarlo
- Considera el uso de HashSet para una solución más eficiente

#### Ejercicio 9: Copia de arrays
**Objetivo:** Aprender diferentes formas de copiar arrays en Java.

**Conceptos clave:**
- System.arraycopy(): método nativo eficiente
- Arrays.copyOf(): método conveniente
- clone(): método de Object
- Copia superficial vs profunda

**Consejos:**
- System.arraycopy() es el más rápido para copias grandes
- Arrays.copyOf() permite cambiar el tamaño durante la copia
- clone() crea una copia superficial (referencias compartidas para objetos)
- La copia manual con bucle es más flexible pero menos eficiente

#### Ejercicio 10: Aumentar tamaño de array dinámicamente
**Objetivo:** Simular arrays dinámicos en Java.

**Conceptos clave:**
- Redimensionamiento manual
- Patrones de crecimiento (doble de capacidad)
- Preservación de datos existentes
- Simulación de ArrayList

**Consejos:**
- Los arrays en Java tienen tamaño fijo, necesitas crear uno nuevo
- El patrón de duplicar capacidad es eficiente para muchas inserciones
- Considera el patrón "capacity = size * 2" para crecimiento exponencial
- Este es el principio básico detrás de ArrayList

#### Ejercicio 11: Mantener array sin elementos nulos
**Objetivo:** Aprender a manejar arrays con elementos nulos.

**Conceptos clave:**
- Detección de elementos nulos (== null)
- Conteo de elementos válidos
- Compactación de arrays
- Reemplazo de valores nulos

**Consejos:**
- Usa == null para verificar si un elemento es nulo
- Para arrays de objetos primitivos no hay nulos (usar wrapper classes)
- La compactación mueve elementos no nulos al principio del array
- Reemplazar nulos con valores por defecto previene NullPointerException

#### Ejercicio 12: Redimensionado compacto
**Objetivo:** Implementar redimensionado eficiente eliminando espacios vacíos.

**Conceptos clave:**
- Conteo preciso de elementos válidos
- Creación de arrays con tamaño exacto
- Patrones de compactación
- Optimización de memoria

**Consejos:**
- Primero cuenta los elementos no nulos antes de crear el nuevo array
- Este patrón es útil para implementar estructuras de datos dinámicas
- Considera el rendimiento para arrays grandes (O(n) para conteo + O(n) para copia)
- Es la base para implementar tu propia colección dinámica

### 2. Arrays Bidimensionales (EjercicioArraysBidimensionales.java)

#### Ejercicio 1: Crear y recorrer una matriz 2x3
**Objetivo:** Aprender la sintaxis básica de matrices.

**Conceptos clave:**
- Declaración: tipo[][] nombre = new tipo[filas][columnas]
- Bucles anidados para recorrido
- Acceso: matriz[fila][columna]

**Consejos:**
- El primer índice es siempre la fila
- El segundo índice es siempre la columna
- Usa matriz.length para el número de filas
- Usa matriz[0].length para el número de columnas

#### Ejercicio 2: Matriz identidad
**Objetivo:** Trabajar con matrices cuadradas y diagonales.

**Conceptos clave:**
- Matriz cuadrada: mismo número de filas y columnas
- Diagonal principal: fila == columna
- Condicionales dentro de bucles

**Consejos:**
- En la diagonal principal, los índices son iguales
- Fuera de la diagonal principal, los índices son diferentes
- Puedes usar el operador ternario para asignación condicional

#### Ejercicio 3: Sumar filas y columnas
**Objetivo:** Realizar operaciones por filas y por columnas.

**Conceptos clave:**
- Arrays para guardar resultados parciales
- Recorrido por filas vs recorrido por columnas
- Acumuladores anidados

**Consejos:**
- Para sumar filas, el bucle externo recorre filas
- Para sumar columnas, el bucle externo recorre columnas
- Necesitarás reiniciar los acumuladores apropiadamente

#### Ejercicio 4: Encontrar el máximo en una matriz
**Objetivo:** Búsqueda en estructuras bidimensionales.

**Conceptos clave:**
- Búsqueda bidimensional
- Guardado de coordenadas
- Inicialización apropiada

**Consejos:**
- Guarda tanto el valor como las coordenadas del máximo
- Inicializa con el primer elemento de la matriz
- Actualiza cuando encuentres un valor mayor

#### Ejercicio 5: Matriz transpuesta
**Objetivo:** Entender la operación de transposición.

**Conceptos clave:**
- Transposición: intercambiar filas por columnas
- Matriz resultante: columnas x filas
- Copia con índices intercambiados

**Consejos:**
- La matriz transpuesta tiene dimensiones invertidas
- El elemento [i][j] de la original va a [j][i] de la transpuesta
- Solo las matrices cuadradas son iguales a su transpuesta

#### Ejercicio 6: Diagonal principal y secundaria
**Objetivo:** Trabajar con ambas diagonales de una matriz cuadrada.

**Conceptos clave:**
- Diagonal principal: fila == columna
- Diagonal secundaria: fila + columna == n - 1
- Matrices cuadradas

**Consejos:**
- En una matriz n x n, la diagonal secundaria cumple: fila + columna = n-1
- Puedes recorrer toda la matriz y verificar las condiciones
- O puedes recorrer solo las diagonales directamente

#### Ejercicio 7: Matriz simétrica
**Objetivo:** Verificar propiedades de matrices.

**Conceptos clave:**
- Matriz simétrica: matriz == transpuesta
- Comparación elemento por elemento
- Optimización: solo necesitas comparar mitad de la matriz

**Concejos:**
- Una matriz es simétrica si matriz[i][j] == matriz[j][i] para todo i, j
- Solo necesitas verificar la triangular superior
- La diagonal principal no necesita verificación

#### Ejercicio 8: Multiplicar matrices
**Objetivo:** Implementar el algoritmo de multiplicación de matrices.

**Conceptos clave:**
- Condición: columnas de A == filas de B
- Resultado: filas de A x columnas de B
- Fórmula: C[i][j] = Σ(A[i][k] * B[k][j])

**Consejos:**
- Necesitas tres bucles anidados
- El bucle más interno calcula un elemento del resultado
- Verifica que las dimensiones sean compatibles antes de multiplicar

## Cómo ejecutar los ejercicios

1. Abre el archivo Java correspondiente
2. Completa el código donde indica "// Tu código aquí"
3. Crea un método main para probar:
```java
public static void main(String[] args) {
    EjercicioArraysUnidimensionales ejercicios = new EjercicioArraysUnidimensionales();
    ejercicios.ejercicio1();
    // Llama a otros ejercicios según necesites
}
```

## Buenas prácticas

- Siempre verifica los límites de los arrays para evitar excepciones
- Usa nombres descriptivos para tus variables
- Imprime resultados intermedios para depurar tu código
- Considera casos edge (arrays vacíos, un solo elemento, etc.)
- Documenta tus algoritmos complejos con comentarios
