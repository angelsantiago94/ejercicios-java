# 1ºDAM - Programación
## CONTROL DE FLUJO

### Descripción del Problema

Para practicar las estructuras de control de flujo en Java, vamos a implementar una clase `ControladorFlujo` que proporciona diversas operaciones utilizando condicionales, bucles y sentencias de control.

### SE PIDE:

A la clase `ControladorFlujo.java` se le deben completar los métodos siguientes:

### Métodos a Implementar

```java
public String clasificarEdad(int edad)
// clasifica a una persona según su edad:
// "Menor de edad" (< 18)
// "Adulto" (18-64)
// "Adulto mayor" (65+)
// Si la edad es negativa, devuelve "Edad inválida"

public String obtenerDiaSemana(int numeroDia)
// devuelve el nombre del día de la semana según el número:
// 1: "Lunes", 2: "Martes", ..., 7: "Domingo"
// Si el número no está en el rango 1-7, devuelve "Día inválido"
// Usa switch-case

public String generarSecuenciaNumeros()
// genera una secuencia de números usando bucles:
// 1. Números del 1 al 10 (cada uno en nueva línea)
// 2. Números pares del 2 al 20 (separados por espacios)
// Devuelve un String con ambas secuencias

public String cuentaRegresiva(int inicio)
// simula una cuenta regresiva desde el número inicio hasta 0
// Cada número en una línea
// Cuando llega a 0, imprime "¡Despegue!"
// Si inicio es negativo, devuelve "Inicio inválido"
// Usa bucle while

public String simularAdivinanza(int[] intentos, int numeroSecreto)
// simula un juego de adivinar número entre 1 y 10
// Recibe un array con los intentos del jugador
// Para cada intento, muestra "Intento X: Y - Mayor/Menor/Correcto"
// Cuando acierte, muestra "¡Adivinaste en X intentos!"
// Si no acierta en todos los intentos, muestra "No adivinaste. El número era: X"
// Usa bucle do-while o for

public String filtrarNumeros(int[] numeros)
// procesa un array de números del 1 al 20:
// - Salta los múltiplos de 3 (usando continue)
// - Detén el procesamiento cuando llegues a 15 (usando break)
// Devuelve un String con los números procesados separados por espacios

public String tablaMultiplicar(int numero, int limite)
// genera la tabla de multiplicar de un número hasta el límite
// Formato: "5 x 1 = 5", "5 x 2 = 10", etc.
// Cada resultado en una línea
// Si el límite es menor que 1, usa 10 por defecto

public String calcularFactorial(int n)
// calcula el factorial de un número usando bucle
// Formato: "Factorial de 5 = 1 x 2 x 3 x 4 x 5 = 120"
// Si n es negativo, devuelve "Factorial no definido para números negativos"
// Si n es 0, devuelve "Factorial de 0 = 1"

public String numerosPrimos(int limite)
// genera todos los números primos hasta el límite
// Usa bucles anidados para verificar primalidad
// Devuelve los primos separados por comas
// Si no hay primos, devuelve "No hay números primos en este rango"

public String patronTriangular(int altura)
// genera un patrón triangular con asteriscos
// Ejemplo altura=4:
// *
// **
// ***
// ****
// Si la altura es menor que 1, devuelve "Altura inválida"

public String validarPassword(String password)
// valida una contraseña según estos criterios:
// - Al menos 8 caracteres
// - Contiene al menos una letra mayúscula
// - Contiene al menos una letra minúscula
// - Contiene al menos un número
// Devuelve "Válida" si cumple todos, sino "Inválida: [razones]"
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen.

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Método clasificarEdad ........................................................................................5 Puntos
- Método obtenerDiaSemana ..................................................................................6 Puntos
- Método generarSecuenciaNumeros ...................................................................8 Puntos
- Método cuentaRegresiva .....................................................................................6 Puntos
- Método simularAdivinanza .................................................................................10 Puntos
- Método filtrarNumeros .....................................................................................8 Puntos
- Método tablaMultiplicar ..................................................................................6 Puntos
- Método calcularFactorial .................................................................................8 Puntos
- Método numerosPrimos ...................................................................................12 Puntos
- Método patronTriangular ..................................................................................8 Puntos
- Método validarPassword ..................................................................................13 Puntos

## Ejemplo de ejecución:

```
=== EXAMEN DE CONTROL DE FLUJO ===

=== PRUEBAS DE MÉTODOS ===
1. Clasificación por edad:
   Edad 15: Menor de edad
   Edad 25: Adulto
   Edad 70: Adulto mayor
   Edad -5: Edad inválida

2. Día de la semana:
   Día 1: Lunes
   Día 5: Viernes
   Día 7: Domingo
   Día 8: Día inválido

3. Secuencia de números:
1
2
3
4
5
6
7
8
9
10
2 4 6 8 10 12 14 16 18 20

4. Cuenta regresiva:
5
4
3
2
1
0
¡Despegue!

5. Simulación de adivinanza:
Intento 1: 3 - Menor
Intento 2: 7 - Mayor
Intento 3: 2 - Menor
¡Adivinaste en 3 intentos!
Intento 1: 1 - Menor
Intento 2: 2 - Menor
Intento 3: 3 - Menor
No adivinaste. El número era: 7

6. Filtrar números:
1 2 4 5 7 8 10 11 13 14

7. Tabla de multiplicar:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25

8. Cálculo factorial:
Factorial de 5 = 1 x 2 x 3 x 4 x 5 = 120
Factorial de 0 = 1
Factorial no definido para números negativos

9. Números primos:
2, 3, 5, 7, 11, 13, 17, 19

10. Patrón triangular:
*
**
***
****

11. Validación de password:
   'Password123': Válida
   'pass': Inválida: [Longitud mínima 8, Mayúscula requerida, Número requerido]
   'PASSWORD': Inválida: [Minúscula requerida]
   'password': Inválida: [Mayúscula requerida, Número requerido]
   'Pass12': Inválida: [Longitud mínima 8]
```

## Requisitos adicionales:

- Se deben usar correctamente las estructuras de control (if-else, switch, for, while, do-while)
- Se deben utilizar break y continue donde corresponda
- Se deben manejar casos límite y validaciones
- Se debe controlar la entrada de datos inválidos
- El código debe ser eficiente y legible
- Se deben usar bucles anidados donde sea necesario
