# Examen de Programación - Gestión de Vuelos

## Estructura del Proyecto

Este directorio contiene las clases necesarias para realizar el examen de programación sobre gestión de vuelos.

## Clases Disponibles

### 1. Localidad.java
- Representa una ciudad/localidad
- Atributos: nombre (String), numeroHabitantes (int)
- Implementa Comparable<Localidad> para ordenación por nombre

### 2. Vuelo.java  
- Representa un vuelo entre localidades
- Atributos: destino (Localidad), lineaAerea (LineaAerea)
- Incluye equals() y hashCode()

### 3. LineaAerea.java
- Representa una línea aérea
- Atributos: nombre (String), cantidadAviones (int)
- Implementa Comparable<LineaAerea> para ordenación por nombre

### 4. Modelo.java
- Clase principal que gestiona el sistema de vuelos
- Atributos: conexiones (TreeMap<Localidad,HashSet<Vuelo>>), lineas (TreeSet<LineaAerea>)
- **Contiene los métodos a implementar (marcados con TODO)**

### 5. TestExamen.java
- Clase de prueba con datos de ejemplo
- **Descomentar las líneas cuando implementes los métodos**

## Métodos a Implementar (en Modelo.java)

1. `addLocalidad(Localidad localidad)` - 6 puntos
2. `añadirVueloALocalidad(Localidad localidad, Vuelo vuelo)` - 6 puntos  
3. `hayErrores()` - 10 puntos
4. `numVuelosALocsMillon(Localidad loc)` - 8 puntos
5. `lineasHasta(Localidad localidad)` - 12 puntos
6. `totalAvionesDesde(Localidad localidad)` - 14 puntos
7. `hayVuelosReciprocos()` - 14 puntos

## Instrucciones

1. Implementa los métodos marcados con `// TODO:` en la clase `Modelo.java`
2. Descomenta las líneas de prueba en `TestExamen.java` para verificar tu implementación
3. Asegúrate de que el programa compile y ejecute sin excepciones
4. Prueba con los datos de ejemplo proporcionados

## Compilación y Ejecución

```bash
# Compilar
javac -d . *.java

# Ejecutar
java com.ejerciciosjava.colecciones.examenes.examen_vuelos.TestExamen
```
