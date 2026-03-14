# Examen: Estación Meteorológica

## Descripción

La Estación Meteorológica desea hacer un estudio sobre el cambio climático. Realiza un programa en Java que permita la introducción de datos y posteriormente muestre unos resultados.

## Especificaciones del Programa

### Entrada de Datos

El programa debe solicitar datos de la siguiente forma:

1. **Nombre del mes**: Se pedirá el nombre del mes del que van a introducirse datos
   - No tienen por qué introducirse datos de todos los meses
   - Se sabe que ya no van a introducirse más datos cuando el usuario introduce "ya"

2. **Para cada mes**:
   - **Número de días**: Se pregunta de cuántos días van a introducirse datos
   - **Para cada día**:
     - Número del día del mes (1-31)
     - Temperatura media de ese día (puede llevar decimales)
     - Humedad (valor entero, porcentaje)
     - Velocidad del viento (valor entero, km/h)
     - Estado del cielo (soleado/nublado/lluvioso)

**Notas importantes:**
- Los días no tienen por qué ir ordenados
- No se repite el número de día para un mismo mes
- La temperatura puede llevar decimales, los demás datos son enteros

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### a) Estado del cielo del día en el que hubo más humedad
*(1,5 puntos)*
- De entre todos los días de todos los meses

#### b) Nombre del mes en el que ha habido menor proporción de días nublados
*(1,5 puntos)*
- Si se insertaron 3 días y uno está nublado, la proporción es 1/3

#### c) Cuántos meses han tenido al menos un día con ciclogénesis
*(2 puntos)*
- **Criterios de ciclogénesis**:
  - Velocidad del viento > 40 km/h
  - O temperatura < 0°C
- Si se cumple alguno de los dos criterios, ese día tuvo ciclogénesis

#### d) Día y mes de los dos días más calurosos del año
*(1,5 puntos)*
- Formato: "Día X de MES: YY.Y°C"

#### e) Análisis de días lluviosos en meses con más de 10 días
*(2 puntos)*
- De los meses con más de 10 días registrados
- Mostrar si alguno tuvo menos de 3 días lluviosos
- Formato: "Hubo meses con más de 10 días y menos de 3 días lluviosos: true/false"

## Restricciones Importantes

- **No se pueden usar arrays o tablas** para el almacenamiento principal
- **Se puede asumir que no se introducen datos incorrectos**
- **Los datos se introducen en el orden indicado**, sin diálogos extra
- **No se repiten números de día para un mismo mes**

## Ejemplo de Ejecución

```
=== ESTACIÓN METEOROLÓGICA ===
Estudio sobre el cambio climático

Nombre del mes (o 'ya' para terminar): Enero
¿Cuántos días de Enero?: 3

Día 1 de Enero:
Número del día: 15
Temperatura media (°C): 25.5
Humedad (%): 65
Velocidad del viento (km/h): 20
Estado del cielo (soleado/nublado/lluvioso): soleado

Día 2 de Enero:
Número del día: 16
Temperatura media (°C): -2.0
Humedad (%): 80
Velocidad del viento (km/h): 45
Estado del cielo (soleado/nublado/lluvioso): nublado

Día 3 de Enero:
Número del día: 17
Temperatura media (°C): 18.0
Humedad (%): 70
Velocidad del viento (km/h): 15
Estado del cielo (soleado/nublado/lluvioso): lluvioso

Nombre del mes (o 'ya' para terminar): Febrero
¿Cuántos días de Febrero?: 2

Día 1 de Febrero:
Número del día: 5
Temperatura media (°C): 22.0
Humedad (%): 55
Velocidad del viento (km/h): 25
Estado del cielo (soleado/nublado/lluvioso): soleado

Día 2 de Febrero:
Número del día: 6
Temperatura media (°C): 20.0
Humedad (%): 85
Velocidad del viento (km/h): 35
Estado del cielo (soleado/nublado/lluvioso): nublado

Nombre del mes (o 'ya' para terminar): ya

=== RESULTADOS DEL ANÁLISIS CLIMATOLÓGICO ===
a) Estado del cielo día con más humedad: nublado
b) Mes con menor proporción de días nublados: Febrero
c) Meses con al menos un día de ciclogénesis: 1
d) Dos días más calurosos: Día 15 de Enero: 25.5°C, Día 5 de Febrero: 22.0°C
e) Hubo meses con más de 10 días y menos de 3 días lluviosos: false
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
- Maneja casos límite (meses sin días, etc.)
- Sigue las convenciones de nomenclatura de Java
- Prueba tu código con diferentes datos de entrada

## Ayudas Adicionales

### Para calcular proporción de días nublados
```java
// Proporción = (número de días nublados) / (número total de días)
// Manejar caso de división por cero (mes sin días)
```

### Para encontrar los dos días más calurosos
```java
// Puedes usar variables para guardar:
// - El día más caluroso encontrado hasta ahora
// - El segundo día más caluroso encontrado hasta ahora
// Y actualizarlos mientras recorres todos los días
```

### Para verificar ciclogénesis
```java
// Un día tiene ciclogénesis si:
// (velocidadViento > 40) || (temperatura < 0)
// Usa el operador OR lógico (||)
```

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio-Alto  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
