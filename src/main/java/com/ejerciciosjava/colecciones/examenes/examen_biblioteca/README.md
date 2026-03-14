# Examen de Programación - Gestión de Biblioteca

## Estructura del Proyecto

Este directorio contiene las clases necesarias para realizar el examen de programación sobre gestión de una biblioteca municipal.

## Clases Disponibles

### 1. Libro.java
- Representa un libro de la biblioteca
- Atributos: isbn, titulo, autor, añoPublicacion, numeroEjemplares
- Implementa Comparable<Libro> para ordenación por título
- equals() y hashCode() basados en ISBN

### 2. Socio.java  
- Representa un socio de la biblioteca
- Atributos: numeroSocio, nombre, direccion, telefono, librosPrestados
- Implementa Comparable<Socio> para ordenación por número de socio
- Inicializa librosPrestados a 0

### 3. Prestamo.java
- Representa un préstamo de libro a socio
- Atributos: libro, socio, fechaPrestamo, fechaDevolucion, devuelto
- Usa LocalDate para manejo de fechas
- Inicializa devuelto a false

### 4. Biblioteca.java
- Clase principal que gestiona el sistema de biblioteca
- Atributos: catalogo (TreeMap), socios (TreeMap), prestamos (ArrayList), librosPorAutor (HashMap)
- **Contiene los métodos a implementar (marcados con TODO)**

### 5. TestBiblioteca.java
- Clase de prueba con datos de ejemplo
- **Descomentar las líneas cuando implementes los métodos**

## Métodos a Implementar (en Biblioteca.java)

1. `añadirLibro(Libro libro)` - 8 puntos
2. `añadirSocio(Socio socio)` - 6 puntos  
3. `prestarLibro(String isbn, String numeroSocio)` - 12 puntos
4. `devolverLibro(String isbn, String numeroSocio)` - 10 puntos
5. `librosDisponibles()` - 8 puntos
6. `librosPorAutor(String autor)` - 8 puntos
7. `prestamosVencidos()` - 12 puntos
8. `socioMasLibros()` - 10 puntos
9. `totalLibrosPorGenero(String genero)` - 18 puntos

## Características del Examen

- **Gestión de múltiples tipos de colecciones**: TreeMap, ArrayList, HashMap, TreeSet
- **Manejo de fechas** con LocalDate
- **Búsquedas y filtrados** complejos
- **Gestión de estado** (préstamos activos/devueltos)
- **Validaciones** y control de disponibilidad
- **Estadísticas** y consultas avanzadas

## Instrucciones

1. Implementa los métodos marcados con `// TODO:` en la clase `Biblioteca.java`
2. Presta atención a la gestión de fechas con `LocalDate.now()`
3. Considera los casos límite (libros no existentes, socios no encontrados, etc.)
4. Descomenta las líneas de prueba en `TestBiblioteca.java` para verificar tu implementación
5. Asegúrate de que el programa compile y ejecute sin excepciones

## Compilación y Ejecución

```bash
# Compilar
javac -d . *.java

# Ejecutar
java com.ejerciciosjava.colecciones.examenes.examen_biblioteca.TestBiblioteca
```

## Consideraciones Adicionales

- Usa `LocalDate.now()` para la fecha actual
- Usa `LocalDate.now().plusDays(15)` para fecha de devolución
- La búsqueda por género debe ser case-insensitive
- Considera el número de ejemplares vs préstamos activos
- Mantén actualizado el contador de libros prestados por socio
