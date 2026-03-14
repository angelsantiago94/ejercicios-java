# 1ºDAM - Programación
## CONTROL HERENCIA Y POLIMORFISMO

### Descripción del Problema

Para practicar los conceptos de herencia y polimorfismo en Java, vamos a implementar un sistema de gestión de vehículos con una jerarquía de clases que demuestre el uso adecuado de clases abstractas, herencia, métodos abstractos y polimorfismo.

El sistema consta de las siguientes clases:

**Vehiculo** (clase abstracta):
- Atributos protegidos: marca, modelo, año, velocidadActual
- Métodos abstractos: acelerar(), frenar(), calcularConsumo()
- Métodos concretos: detener(), getInfo(), toString()

**Coche** (hereda de Vehiculo):
- Atributos: numeroPuertas, tipoCombustible, capacidadDeposito, combustibleActual
- Métodos adicionales: puedeRecorrer(), repostar()

**Motocicleta** (hereda de Vehiculo):
- Atributos: cilindrada, tipo, tieneCasco
- Métodos adicionales: ponerCasco(), quitarCasco(), esSegura()

### SE PIDE:

Completar la implementación de las clases `Coche.java` y `Motocicleta.java` con los métodos indicados, aplicando correctamente los conceptos de herencia y polimorfismo.

### Métodos a Implementar

#### En la clase Coche:

```java
@Override
public void acelerar(double cantidad)
// aumenta la velocidad según la cantidad especificada
// la velocidad máxima es 200 km/h
// cada aceleración consume combustible: 0.1 litros por cada km/h aumentado
// no puede acelerar si no hay suficiente combustible

@Override
public void frenar(double cantidad)
// reduce la velocidad según la cantidad especificada
// la velocidad no puede ser negativa
// el frenado no consume combustible

@Override
public double calcularConsumo(double distancia)
// calcula el consumo de combustible para una distancia
// consumo base: 0.08 litros por km
// si el tipo de combustible es "Diesel", reduce un 20% el consumo
// si la velocidad media es > 100 km/h, aumenta un 15% el consumo
// devuelve los litros consumidos

public boolean puedeRecorrer(double distancia)
// devuelve true si el coche tiene suficiente combustible para recorrer la distancia
// usa el método calcularConsumo() para determinar el consumo necesario

public void repostar(double litros)
// añade combustible al depósito
// no puede superar la capacidad máxima del depósito
// si intenta repostar más de lo que cabe, solo añade lo que cabe
```

#### En la clase Motocicleta:

```java
@Override
public void acelerar(double cantidad)
// aumenta la velocidad según la cantidad especificada
// la velocidad máxima depende de la cilindrada:
// - < 500cc: máximo 120 km/h
// - 500-1000cc: máximo 180 km/h
// - > 1000cc: máximo 220 km/h
// si no tiene casco, solo puede acelerar hasta 80 km/h como máximo

@Override
public void frenar(double cantidad)
// reduce la velocidad según la cantidad especificada
// la velocidad no puede ser negativa
// las motocicletas frenan más rápido que los coches (1.5x la cantidad)

@Override
public double calcularConsumo(double distancia)
// calcula el consumo para una distancia
// consumo base: 0.04 litros por km
// si la cilindrada > 1000cc, aumenta 50% el consumo
// si el tipo es "Deportiva", aumenta 25% el consumo
// devuelve los litros consumidos

public void ponerCasco()
// pone el casco a la motocicleta

public void quitarCasco()
// quita el casco de la motocicleta

public boolean esSegura()
// devuelve true si la motocicleta es segura para conducir
// es segura si tiene casco Y la velocidad actual es <= 80 km/h
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen.

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Clase Vehiculo abstracta completa ........................................................................10 Puntos
- Clase Coche - constructores y atributos ...............................................................8 Puntos
- Método acelerar (Coche) .....................................................................................12 Puntos
- Método frenar (Coche) ........................................................................................6 Puntos
- Método calcularConsumo (Coche) ........................................................................10 Puntos
- Método puedeRecorrer (Coche) .............................................................................6 Puntos
- Método repostar (Coche) .....................................................................................8 Puntos
- Clase Motocicleta - constructores y atributos ....................................................8 Puntos
- Método acelerar (Motocicleta) .............................................................................12 Puntos
- Método frenar (Motocicleta) ................................................................................6 Puntos
- Método calcularConsumo (Motocicleta) ...............................................................8 Puntos
- Métodos casco y seguridad (Motocicleta) ...........................................................6 Puntos

## Ejemplo de ejecución:

```
=== HERENCIA Y POLIMORFISMO - EXAMEN ===

=== VEHÍCULOS CREADOS ===
Coche 1: Toyota Corolla (2022) - Velocidad: 0.0 km/h [4 puertas, Gasolina, 25.0/50.0L]
Coche 2: BMW Serie 3 (2021) - Velocidad: 0.0 km/h [2 puertas, Diesel, 30.0/60.0L]
Moto 1: Honda CBR (2023) - Velocidad: 0.0 km/h [600cc, Deportiva, Casco: No]
Moto 2: Yamaha MT-07 (2022) - Velocidad: 0.0 km/h [689cc, Naked, Casco: No]

=== PRUEBAS DE MOVIMIENTO ===
--- Coche 1 ---
Tras acelerar 50 km/h: Toyota Corolla (2022) - Velocidad: 50.0 km/h [4 puertas, Gasolina, 20.0/50.0L]
Tras acelerar 100 km/h: Toyota Corolla (2022) - Velocidad: 150.0 km/h [4 puertas, Gasolina, 5.0/50.0L]
Tras intentar superar máximo: Toyota Corolla (2022) - Velocidad: 200.0 km/h [4 puertas, Gasolina, 0.0/50.0L]
Tras frenar 30 km/h: Toyota Corolla (2022) - Velocidad: 170.0 km/h [4 puertas, Gasolina, 0.0/50.0L]
Tras detener: Toyota Corolla (2022) - Velocidad: 0.0 km/h [4 puertas, Gasolina, 0.0/50.0L]

--- Moto 1 ---
Casco puesto: Honda CBR (2023) - Velocidad: 0.0 km/h [600cc, Deportiva, Casco: Sí]
Tras acelerar 60 km/h: Honda CBR (2023) - Velocidad: 60.0 km/h [600cc, Deportiva, Casco: Sí]
Tras acelerar 100 km/h: Honda CBR (2023) - Velocidad: 160.0 km/h [600cc, Deportiva, Casco: Sí]
Casco quitado: Honda CBR (2023) - Velocidad: 160.0 km/h [600cc, Deportiva, Casco: No]
Acelerar sin casco: Honda CBR (2023) - Velocidad: 80.0 km/h [600cc, Deportiva, Casco: No]
¿Es segura?: true

=== PRUEBAS DE CONSUMO ===
Distancia a recorrer: 100.0 km
Consumo coche 1 (Gasolina): 8.00 L
Consumo coche 2 (Diesel): 6.40 L
Consumo moto 1 (Deportiva): 5.00 L
Consumo moto 2 (Naked): 4.00 L

=== POLIMORFISMO ===
Tipo: Coche
Tras acelerar 50: Toyota Corolla (2022) - Velocidad: 50.0 km/h [4 puertas, Gasolina, 20.0/50.0L]
Consumo para 50 km: 4.00 L
Tras detener: Toyota Corolla (2022) - Velocidad: 0.0 km/h [4 puertas, Gasolina, 20.0/50.0L]
---
```

## Requisitos adicionales:

- Se debe aplicar correctamente la herencia y el polimorfismo
- Se deben usar @Override para sobreescribir métodos
- Se debe acceder a los atributos protegidos de la clase padre
- El código debe ser robusto y manejar casos límite
- Se deben validar los parámetros de entrada
- Se debe demostrar el uso de polimorfismo en las pruebas
