# Examen: Biblioteca Pública - Gestión de Préstamos

## Descripción

La Biblioteca Pública Municipal desea realizar un estudio sobre los préstamos de libros y el comportamiento de los usuarios. La biblioteca tiene diferentes tipos de libros (Novelas, Ciencia, Historia, Infantiles) y diferentes categorías de usuarios (Estudiantes, Adultos, Jubilados, Niños).

Realiza un programa en Java que permita introducir los datos de préstamos y generar estadísticas sobre el uso de la biblioteca.

## Especificaciones del Programa

### Entrada de Datos

El programa debe:

1. **Solicitar el número de usuarios** registrados en la biblioteca.

2. **Para cada usuario, solicitar:**
   - Nombre completo del usuario
   - Edad
   - Categoría: Estudiante, Adulto, Jubilado, Niño
   - Número de carné (único por usuario)

3. **Solicitar datos de préstamos** hasta que se introduzca "fin" como título del libro:
   - Título del libro prestado
   - Tipo de libro: Novela, Ciencia, Historia, Infantil
   - Número de páginas
   - Fecha de préstamo (día, mes, año)
   - Número de carné del usuario que realiza el préstamo
   - Duración del préstamo en días

### Restricciones Importantes

- Todos los usuarios que realizan préstamos deben existir en la lista de usuarios
- Los números de carné son únicos
- Las edades están entre 3 y 95 años
- Los libros tienen entre 50 y 2000 páginas
- La duración máxima del préstamo es de 30 días
- La fecha de préstamo debe ser válida (día 1-31, mes 1-12, año 2020-2024)

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### a) Nombre del usuario más joven de la biblioteca
*(1 punto)*

#### b) Categoría con más usuarios registrados
*(1 punto)*

#### c) Título del libro con más páginas prestado
*(1,5 puntos)*

#### d) Media de edad de los usuarios de categoría Estudiante
*(1,5 puntos)*

#### e) Número de préstamos de libros Infantiles realizados por usuarios Niños
*(1 punto)*

#### f) Usuario que ha realizado más préstamos
*(1,5 puntos)*

#### g) Tipo de libro más prestado en el mes de marzo
*(1 punto)*

#### h) Si existe algún préstamo con duración superior a 20 días de un libro de más de 500 páginas
*(1 punto)*
- Mostrar mensaje: "Existe préstamo largo de libro extenso: true/false"

#### i) Nombre del libro de Ciencia con menor número de páginas
*(1 punto)*

## Ejemplo de Ejecución

```
=== BIBLIOTECA PÚBLICA MUNICIPAL - GESTIÓN DE PRÉSTAMOS ===

Número de usuarios registrados: 3

Usuario 1:
Nombre completo: Ana García
Edad: 25
Categoría (Estudiante/Adulto/Jubilado/Niño): Estudiante
Número de carné: 1001

Usuario 2:
Nombre completo: Luis Martínez
Edad: 65
Categoría (Estudiante/Adulto/Jubilado/Niño): Jubilado
Número de carné: 1002

Usuario 3:
Nombre completo: María López
Edad: 8
Categoría (Estudiante/Adulto/Jubilado/Niño): Niño
Número de carné: 1003

=== REGISTRO DE PRÉSTAMOS ===
Título del libro (o 'fin' para terminar): El Quijote
Tipo de libro (Novela/Ciencia/Historia/Infantil): Novela
Número de páginas: 1050
Fecha de préstamo:
Día (1-31): 15
Mes (1-12): 3
Año (2020-2024): 2024
Número de carné del usuario: 1001
Duración del préstamo (días): 15

Título del libro (o 'fin' para terminar): Breve Historia del Tiempo
Tipo de libro (Novela/Ciencia/Historia/Infantil): Ciencia
Número de páginas: 250
Fecha de préstamo:
Día (1-31): 20
Mes (1-12): 3
Año (2020-2024): 2024
Número de carné del usuario: 1002
Duración del préstamo (días): 25

Título del libro (o 'fin' para terminar): fin

=== RESULTADOS DEL ANÁLISIS ===
a) Usuario más joven: María López (8 años)
b) Categoría con más usuarios: Estudiante (1), Jubilado (1), Niño (1) [Empate]
c) Libro con más páginas: El Quijote (1050 páginas)
d) Media edad Estudiantes: 25.0 años
e) Préstamos Infantiles por Niños: 0
f) Usuario con más préstamos: Ana García (1), Luis Martínez (1) [Empate]
g) Tipo de libro más prestado en marzo: Novela (1), Ciencia (1) [Empate]
h) Existe préstamo largo de libro extenso: false
i) Libro de Ciencia con menos páginas: Breve Historia del Tiempo (250 páginas)
```

## Criterios de Evaluación

- **Compilación**: El programa debe compilar sin errores (máximo 4/10 si no compila)
- **Excepciones**: -1 punto por cada tipo de excepción no controlada
- **Funcionalidad**: Puntuación detallada por cada requisito implementado
- **Código**: Se valorará código correcto, indentado, comentado y eficiente

## Buenas Prácticas

- Usa nombres descriptivos para variables
- Comenta el código cuando sea necesario
- Maneja casos límite (no hay préstamos de cierto tipo, etc.)
- Sigue las convenciones de nomenclatura de Java
- Prueba tu código con diferentes datos de entrada

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio-Alto  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
