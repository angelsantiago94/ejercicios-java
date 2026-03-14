# Examen: BASA - Brothers Aeronautics and Space Administration

## Descripción

La BASA (Brothers Aeronautics and Space Administration) desea hacer un estudio sobre las estrellas, planetas, satélites y agujeros negros de la Vía Láctea. Realiza un programa en Java que permita la introducción de datos y posteriormente muestre unos resultados.

## Especificaciones del Programa

### Entrada de Datos

El programa debe solicitar datos de la siguiente forma:

1. **Tipo de cuerpo celeste**: estrella, planeta o agujero
   - Se debe dejar de pedir datos cuando se introduzca la palabra "fin"

2. **Para cada cuerpo celeste**:
   - Nombre del cuerpo celeste
   - Distancia al Sol (en kilómetros)
   - Diámetro (en kilómetros)

3. **Si es estrella o planeta**, solicitar adicionalmente:
   - Cuántos satélites tiene
   - Para cada satélite:
     - Nombre del satélite
     - Diámetro del satélite
     - Si tiene rotación síncrona respecto del cuerpo que orbita (true/false)

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### a) Porcentaje de planetas que tienen algún satélite
*(1,5 puntos)*

#### b) Nombre del cuerpo celeste más cercano al Sol
*(1,5 puntos)*

#### c) Diámetro medio de todos los cuerpos celestes (incluyendo satélites)
*(1,5 puntos)*

#### d) Nombres de los dos cuerpos celestes que más satélites tienen
*(1,5 puntos)*

#### e) Diámetro del cuerpo más grande de entre los que están a menos de 230.000.000 km de distancia del Sol
*(1,5 puntos)*

#### f) Para cada cuerpo celeste con satélites, mostrar si tiene algún satélite con rotación síncrona
*(1,5 puntos)*
- Formato: "NOMBRE_CUERPO tiene satélites con rotación síncrona: true/false"

## Restricciones Importantes

- **No se pueden usar arrays o tablas** para el almacenamiento principal
- **Se puede asumir que no se introducen datos incorrectos**
- **Los datos se introducen en el orden indicado**, sin diálogos extra
- **No se repiten nombres de cuerpo celeste**

## Ejemplo de Ejecución

```
=== BASA - Brothers Aeronautics and Space Administration ===
Estudio sobre cuerpos celestes de la Vía Láctea

Tipo de cuerpo celeste (estrella/planeta/agujero, o 'fin' para terminar): estrella
Nombre: Sol
Distancia al Sol (km): 0
Diámetro (km): 1392700
Cuántos satélites tiene: 8

Satélite 1:
Nombre: Mercurio
Diámetro (km): 4879
Rotación síncrona (true/false): false

Satélite 2:
Nombre: Venus
Diámetro (km): 12104
Rotación síncrona (true/false): false

... (continúa con otros satélites)

Tipo de cuerpo celeste (estrella/planeta/agujero, o 'fin' para terminar): planeta
Nombre: Tierra
Distancia al Sol (km): 149600000
Diámetro (km): 12742
Cuántos satélites tiene: 1

Satélite 1:
Nombre: Luna
Diámetro (km): 3474
Rotación síncrona (true/false): true

Tipo de cuerpo celeste (estrella/planeta/agujero, o 'fin' para terminar): fin

=== RESULTADOS DEL ANÁLISIS ===
a) Porcentaje de planetas con satélites: 100.0%
b) Cuerpo celeste más cercano al sol: Sol
c) Diámetro medio total: 15423.5 km
d) Dos cuerpos con más satélites: Sol, Tierra
e) Diámetro máximo cuerpo cercano (<230000000 km): 12742 km
f) Sol tiene satélites con rotación síncrona: false
f) Tierra tiene satélites con rotación síncrona: true
```

## Criterios de Evaluación

- **Compilación**: El programa debe compilar sin errores (máximo 4/10 si no compila)
- **Excepciones**: -1 punto por cada tipo de excepción no controlada
- **Funcionalidad**: Puntuación detallada por cada requisito implementado
- **Código**: Se valorará código correcto, indentado, comentado y eficiente
- **Sin arrays**: No se deben usar arrays para almacenamiento principal

## Buenas Prácticas

- Usa nombres descriptivos para variables y métodos
- Comenta el código cuando sea necesario
- Maneja casos límite (cuerpos sin satélites, etc.)
- Sigue las convenciones de nomenclatura de Java
- Prueba tu código con diferentes datos de entrada

## Ayudas Adicionales

### Para el cálculo de diámetro medio
```java
// Debes sumar los diámetros de:
// - Todos los cuerpos celestes
// - Todos los satélites de todos los cuerpos
// Y dividir por el número total de elementos
```

### Para encontrar los dos cuerpos con más satélites
```java
// Puedes usar variables para guardar:
// - El cuerpo con más satélites
// - El cuerpo con segundo más satélites
// Y actualizarlos mientras recorres la lista
```

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
