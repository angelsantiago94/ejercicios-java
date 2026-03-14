# 1ºDAM - Programación
## CONTROL TERCERA EVALUACIÓN

### Descripción del Problema

Para gestionar los vuelos que se hacen desde distintas ciudades hasta otras mediante ciertas líneas aéreas, usamos un programa en Java. Mediante el mismo mantenemos en el Modelo los atributos:

```java
private TreeMap<Localidad,HashSet<Vuelo>> conexiones;
private TreeSet<LineaAerea> lineas;
```

Las clases `Localidad`, `Vuelo` y `LineaAerea` se proporcionan al alumno. 

- En el mapa (TreeMap) `conexiones` se mantienen los datos de las localidades origen de los distintos vuelos, y asociado a cada localidad tenemos el conjunto (HashSet) de vuelos que parten de esa localidad.
- Dentro de cada objeto de la clase `Vuelo` tenemos la ciudad destino del vuelo y la línea aérea que hace el vuelo.
- En la clase `Localidad` tenemos el nombre, y número de habitantes.
- En la clase `LineaAerea` tenemos el nombre y la cantidad de aviones que tiene en su flota.
- En el atributo (TreeSet) `líneas` tenemos los datos de todas las líneas aéreas que manejaremos.

## SE PIDE:

Se deben añadir a las clases `Localidad.java`, `LineaAerea.java` y `Vuelo.java` todo lo necesario para que el sistema funcione. A la clase `Modelo.java` se le deben completar los métodos siguientes:

### Métodos a Implementar

```java
public void addLocalidad(Localidad localidad)
// añade al mapa de conexiones una nueva pareja con la localidad
// pasada como parámetro y un nuevo conjunto de vuelos vacío.

public void añadirVueloALocalidad(Localidad localidad, Vuelo vuelo)
// añade el vuelo pasado como parámetro al conjunto de vuelos asociado a
// la localidad pasada como parámetro.

public boolean hayErrores()
// devuelve un boolean indicando si hay errores en los datos, es decir,
// si hay algún vuelo con la misma localidad de origen que de destino.

public int numVuelosALocsMillon(Localidad loc)
// devuelve un entero con el número de vuelos que parten de la localidad
// pasada como parámetro y llegan a localidades con más de 1.000.000 habs.

public TreeSet<LineaAerea> lineasHasta(Localidad localidad)
// devuelve un TreeSet con todas las líneas aéreas que tienen vuelos hacia
// la localidad pasada como parámetro.

public int totalAvionesDesde(Localidad localidad)
// devuelve un entero con la suma de todos los aviones que tienen las líneas
// que hacen vuelos desde la localidad pasada como parámetro.

public boolean hayVuelosReciprocos()
// devuelve un boolean indicando si existen dos ciudades entre las que hay
// vuelos en los dos sentidos.
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen que será obtenida según lo siguiente:

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Extends, implements, métodos etc. en Localidad, LineaAerea, Vuelo ..................12 Puntos
- Método addLocalidad ..........................................................................................................6 Puntos
- Método addVueloALocalidad ...........................................................................................6 Puntos
- Método hayErrores .............................................................................................................10 Puntos
- Método numVuelosALocsMillon ......................................................................................8 Puntos
- Método lineasHasta...........................................................................................................12 Puntos
- Método totalAvionesDesde ............................................................................................14 Puntos
- Método hayVuelosReciprocos .......................................................................................14 Puntos

## Ejemplo de ejecución:

```
¿Hay errores (vuelo de ciudad a sí misma)? (debe salir false): false
¿Hay errores (vuelo de ciudad a sí misma)? (debe salir true): true
La localidad Washington D. C. tiene 1 vuelos a localidades de más de 1.000.000 habs.
La localidad Miami tiene 3 vuelos a localidades de más de 1.000.000 habs.
A la localidad Berlín vuelan las líneas aéreas :[American Airlines, Emirates, Lufthansa, Ryanair, United Airlines]
Suma de todos los aviones de todas las líneas que vuelan desde Frankfurt: 2208
¿Existen al menos dos ciudades que tengan vuelos en los dos sentidos? true
```
