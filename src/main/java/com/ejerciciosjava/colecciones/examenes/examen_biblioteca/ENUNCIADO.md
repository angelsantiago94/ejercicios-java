# 1ºDAM - Programación
## CONTROL TERCERA EVALUACIÓN - GESTIÓN DE BIBLIOTECA

### Descripción del Problema

Para gestionar una biblioteca municipal, necesitamos un programa en Java que mantenga el control de libros, socios y préstamos. Mediante el mismo mantenemos en el Modelo los atributos:

```java
private TreeMap<String, Libro> catalogo; // ISBN -> Libro
private TreeMap<String, Socio> socios; // Número socio -> Socio
private ArrayList<Prestamo> prestamos;
private HashMap<String, TreeSet<Libro>> librosPorAutor; // Autor -> TreeSet<Libro>
```

Las clases `Libro`, `Socio` y `Prestamo` se proporcionan al alumno. 

- En el TreeMap `catalogo` se mantienen los datos de todos los libros usando el ISBN como clave.
- En el TreeMap `socios` se mantienen los datos de todos los socios usando el número de socio como clave.
- En el ArrayList `prestamos` se guardan todos los préstamos realizados.
- En el HashMap `librosPorAutor` se mantiene un índice por autor para facilitar búsquedas.

### Clases proporcionadas:

**Libro**: Contiene ISBN, título, autor, año de publicación y número de ejemplares.
**Socio**: Contiene número de socio, nombre, dirección, teléfono y contador de libros prestados.
**Prestamo**: Contiene libro, socio, fecha de préstamo, fecha de devolución y estado de devolución.

## SE PIDE:

A la clase `Biblioteca.java` se le deben completar los métodos siguientes:

### Métodos a Implementar

```java
public void añadirLibro(Libro libro)
// añade el libro al catálogo y también lo añade al mapa de libros por autor
// si el autor no existe, crea un nuevo TreeSet para ese autor

public void añadirSocio(Socio socio)
// añade el socio al mapa de socios usando su número de socio como clave

public boolean prestarLibro(String isbn, String numeroSocio)
// presta un libro si está disponible y el socio existe
// debe crear un préstamo con fecha actual y fecha de devolución en 15 días
// actualiza el contador de libros prestados del socio
// devuelve true si se pudo prestar, false en caso contrario

public boolean devolverLibro(String isbn, String numeroSocio)
// devuelve un libro prestado, marcando el préstamo como devuelto
// actualiza el contador de libros prestados del socio
// devuelve true si se pudo devolver, false si no encuentra el préstamo

public ArrayList<Libro> librosDisponibles()
// devuelve un ArrayList con todos los libros que tienen ejemplares disponibles
// es decir, número de ejemplares > número de préstamos activos

public TreeSet<Libro> librosPorAutor(String autor)
// devuelve el TreeSet de libros del autor solicitado
// si el autor no existe, devuelve un TreeSet vacío

public ArrayList<Prestamo> prestamosVencidos()
// devuelve un ArrayList con todos los préstamos que no han sido devueltos
// y cuya fecha de devolución es anterior a la fecha actual

public Socio socioMasLibros()
// devuelve el socio que tiene más libros prestados actualmente
// si no hay socios con préstamos, devuelve null

public int totalLibrosPorGenero(String genero)
// devuelve el número total de libros que contienen el género especificado
// en su título (asumiendo que el género puede estar en el título)
// búsqueda case-insensitive
```

## PUNTUACIÓN:

Un programa que **NO COMPILE** tendrá una nota desde 0 (si no hay código) a 4 como máximo.

Por cada situación distinta que provoque **UNA EXCEPCIÓN**, se restará **UN PUNTO** de la nota final del examen que será obtenida según lo siguiente:

### Puntuación ponderada (el máximo corresponde a una nota de 10):

- Extends, implements, métodos etc. en las clases proporcionadas ..................8 Puntos
- Método añadirLibro ..........................................................................................................8 Puntos
- Método añadirSocio ..........................................................................................................6 Puntos
- Método prestarLibro .....................................................................................................12 Puntos
- Método devolverLibro ...................................................................................................10 Puntos
- Método librosDisponibles ...........................................................................................8 Puntos
- Método librosPorAutor ..................................................................................................8 Puntos
- Método prestamosVencidos ......................................................................................12 Puntos
- Método socioMasLibros .............................................................................................10 Puntos
- Método totalLibrosPorGenero ...................................................................................18 Puntos

## Ejemplo de ejecución:

```
Biblioteca creada. Implementa los métodos para probar el examen.

Préstamo de El Quijote a Ana: true
Préstamo de 1984 a Juan: true
Préstamo de Cien años de soledad a María: true

Libros disponibles:
- 1984 (George Orwell, 1949)
- Cien años de soledad (Gabriel García Márquez, 1967)
- La sombra del viento (Carlos Ruiz Zafón, 2001)
- Romeo y Julieta (William Shakespeare, 1597)

Libros de Miguel de Cervantes:
- El Quijote (Miguel de Cervantes, 1605)

Devolución de El Quijote: true
Socio con más libros prestados: María López (S003)
Total de libros que contienen 'año' en el título: 1

Préstamos vencidos:
- Préstamo: 1984 a Juan Pérez (2024-03-01 - 2024-03-16)
```

## Requisitos adicionales:

- Se debe usar la API de Java 8+ (LocalDate para fechas)
- Las colecciones deben mantenerse ordenadas según corresponda
- No se permite usar Streams API (sino bucles tradicionales)
- El código debe ser robusto y manejar casos límite
