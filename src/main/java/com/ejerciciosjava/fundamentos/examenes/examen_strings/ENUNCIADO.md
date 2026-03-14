# 1ºDAM - Programación
## CONTROL STRINGS Y MANIPULACIÓN DE TEXTO

### Descripción del Problema

Para practicar el manejo de strings y operaciones de texto en Java, vamos a implementar una clase `ProcesadorTexto` que proporciona diversas operaciones de análisis y transformación de cadenas de texto.

La clase contiene un atributo:
```java
private String texto;
```

### SE PIDE:

A la clase `ProcesadorTexto.java` se le deben completar los métodos siguientes:

### Métodos a Implementar

```java
public int contarPalabras()
// cuenta el número de palabras en el texto
// una palabra es una secuencia de caracteres separada por espacios
// ignora múltiples espacios consecutivos
// si el texto está vacío o solo tiene espacios, devuelve 0

public int contarVocales()
// cuenta el número total de vocales (a, e, i, o, u) en el texto
// cuenta tanto mayúsculas como minúsculas
// ignora acentos y caracteres especiales

public String invertirTexto()
// devuelve el texto invertido carácter por carácter
// si el texto es null, devuelve ""

public String textoMayusculas()
// devuelve el texto en mayúsculas
// si el texto es null, devuelve ""

public boolean esPalindromo()
// devuelve true si el texto es un palíndromo
// ignora mayúsculas/minúsculas, espacios y signos de puntuación
// solo considera letras y números

public String[] dividirPorVocales()
// divide el texto en partes usando las vocales como separadores
// devuelve un array con las partes resultantes
// si no hay vocales, devuelve array con el texto completo

public String reemplazarVocales(char caracter)
// reemplaza todas las vocales del texto por el carácter especificado
// mantiene las mayúsculas/minúsculas originales
// si el texto es null, devuelve ""

public String eliminarEspaciosExtra()
// elimina espacios múltiples consecutivos dejando solo uno
// también elimina espacios al inicio y final
// si el texto es null, devuelve ""

public int contarPalabrasLongitudPar()
// cuenta cuántas palabras tienen longitud par
// ignora signos de puntuación al final de las palabras

public String palabraMasLarga()
// devuelve la palabra más larga del texto
// si hay varias con la misma longitud, devuelve la primera
// si no hay palabras, devuelve ""
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen.

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Constructor y métodos básicos .............................................................................5 Puntos
- Método contarPalabras ...........................................................................................6 Puntos
- Método contarVocales ...........................................................................................6 Puntos
- Método invertirTexto .............................................................................................5 Puntos
- Método textoMayusculas ........................................................................................4 Puntos
- Método esPalindromo .............................................................................................12 Puntos
- Método dividirPorVocales ......................................................................................10 Puntos
- Método reemplazarVocales .....................................................................................8 Puntos
- Método eliminarEspaciosExtra ...............................................................................8 Puntos
- Método contarPalabrasLongitudPar ........................................................................10 Puntos
- Método palabraMasLarga .....................................................................................16 Puntos

## Ejemplo de ejecución:

```
=== PROCESADOR DE TEXTO - EXAMEN ===
Texto 1: "  Java es un lenguaje de programación orientado a objetos  "
Texto 2: "Anita lava la tina"
Texto 3: "Programación en Java es divertido y educativo"

=== Análisis del Texto 1 ===
1. Número de palabras: 9
2. Número de vocales: 22
3. Texto invertido: "  setobej a odetneiro nóicamargorp ed ojejgnal un se avaJ  "
4. Texto en mayúsculas: "  JAVA ES UN LENGUAJE DE PROGRAMACIÓN ORIENTADO A OBJETOS  "
5. ¿Es palíndromo?: false
6. Dividir por vocales: [" J", "v", " ", "s ", "n l", "ng", "j", " d", " pr", "gr", "m", "c", "ón ", "r", "", "nt", "d", " ", "bj", "t", "s  "]
7. Reemplazar vocales por '*': "  J*v* *s *n l*ng**j* d* pr*gr*m*c*ón *r**nt*d* * *bj*t*s  "
8. Eliminar espacios extra: "Java es un lenguaje de programación orientado a objetos"
9. Palabras de longitud par: 5
10. Palabra más larga: "programación"

=== Análisis del Texto 2 (Palíndromo) ===
¿Es palíndromo?: true
Texto invertido: "anit al avil atinA"

=== Análisis del Texto 3 ===
Palabra más larga: "programación"
Palabras de longitud par: 3
```

## Requisitos adicionales:

- No se permite usar Streams API ni expresiones regulares complejas
- Se deben manejar casos límite (null, strings vacíos, etc.)
- El código debe ser eficiente y legible
- Se deben considerar caracteres especiales y signos de puntuación
