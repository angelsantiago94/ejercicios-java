# 1ºDAM - Programación
## CONTROL ARRAYS Y MATRICES

### Descripción del Problema

Para practicar el manejo de arrays y matrices en Java, vamos a implementar una clase `GestorArrays` que proporciona diversas operaciones sobre arrays unidimensionales y bidimensionales.

La clase contiene tres atributos:
```java
private int[] numeros;
private int[][] matriz;
private String[] palabras;
```

### SE PIDE:

A la clase `GestorArrays.java` se le deben completar los métodos siguientes:

### Métodos a Implementar

```java
public int sumaElementos()
// devuelve la suma de todos los elementos del array numeros
// si el array está vacío, devuelve 0

public int encontrarMaximo()
// devuelve el valor máximo del array numeros
// si el array está vacío, lanza IllegalArgumentException

public int[] invertirArray()
// devuelve un nuevo array con los elementos de numeros en orden inverso
// no debe modificar el array original

public boolean esSimetrica()
// devuelve true si la matriz es simétrica (matriz[i][j] == matriz[j][i])
// solo considera matrices cuadradas

public int sumaDiagonalPrincipal()
// devuelve la suma de la diagonal principal de la matriz
// si no es matriz cuadrada, lanza IllegalArgumentException

public int contarPalabrasLongitud(int longitud)
// cuenta cuántas palabras del array palabras tienen exactamente la longitud especificada
// ignora palabras null o vacías

public String[] palabrasConLetra(char letra)
// devuelve un array con todas las palabras que contienen la letra especificada
// búsqueda case-insensitive
// si no hay palabras que cumplan, devuelve array vacío

public double mediaElementos()
// devuelve la media aritmética de los elementos del array numeros
// si el array está vacío, lanza IllegalArgumentException

public int[] eliminarDuplicados()
// devuelve un nuevo array con los elementos de numeros sin duplicados
// mantiene el orden de aparición original
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen.

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Constructor y métodos básicos .............................................................................5 Puntos
- Método sumaElementos ...........................................................................................5 Puntos
- Método encontrarMaximo ........................................................................................6 Puntos
- Método invertirArray .............................................................................................8 Puntos
- Método esSimetrica ...............................................................................................10 Puntos
- Método sumaDiagonalPrincipal ...............................................................................8 Puntos
- Método contarPalabrasLongitud ..............................................................................8 Puntos
- Método palabrasConLetra .....................................................................................12 Puntos
- Método mediaElementos ........................................................................................6 Puntos
- Método eliminarDuplicados .....................................................................................12 Puntos

## Ejemplo de ejecución:

```
=== GESTOR DE ARRAYS - EXAMEN ===
Array de números: [5, 2, 8, 3, 9, 2, 5, 1]
Matriz: 
  [1, 2, 3]
  [2, 4, 5]
  [3, 5, 6]
Array de palabras: [Java, Python, JavaScript, C++, Ruby, Go]

1. Suma de elementos: 35
2. Valor máximo: 9
3. Array invertido: [1, 5, 2, 9, 3, 8, 2, 5]
4. ¿Es simétrica la matriz?: true
5. Suma diagonal principal: 11
6. Palabras de longitud 4: 3
7. Palabras con letra 'a': [Java, JavaScript, Ruby]
8. Media de elementos: 4.375
9. Sin duplicados: [5, 2, 8, 3, 9, 1]
```

## Requisitos adicionales:

- No se permite usar Streams API
- Se deben manejar casos límite (arrays vacíos, null, etc.)
- El código debe ser eficiente y legible
- Se deben validar los parámetros de entrada
