# Examen: Centro Educativo - Gestión de Unidades

## Descripción

En un centro educativo se desea realizar un estudio de determinados aspectos de las unidades de que dispone. Las unidades pueden ser Clases o Departamentos. Todas las unidades tienen un código formado por una letra y tres dígitos. El código de los departamentos empieza por "D" (D765, D324, D076,...) y el de las clases por "C" (C222, C659, C001,...).

Realiza un programa en Java que permita introducir los datos y generar estadísticas sobre el centro.

## Especificaciones del Programa

### Entrada de Datos

El programa debe:

1. **No sabemos cuántas unidades se van a introducir**. Para cada unidad, se va a introducir como primer dato el código. Los datos acabarán cuando el código introducido sea "fin".

2. **Si el código introducido es de un departamento** (empieza por "D"):
   - Nombre del departamento
   - Número de profesores que tiene
   - Para cada profesor: nombre y años que lleva en el centro

3. **Si el código es de una clase** (empieza por "C"):
   - Una letra: E, P, B o F (ESO, PCPI, Bachillerato o FP)
   
   **Según el tipo de clase:**
   - **Si es ESO (E)**: Nombres de cada alumno y nota media del alumno, hasta que el nombre sea "fin"
   - **Si es PCPI (P)**: Nombre de la especialidad
   - **Si es Bachillerato (B)**: Número de asignaturas que tiene
   - **Si es FP (F)**: Nombre del título y horas totales de duración del ciclo

### Restricciones Importantes

- Siempre habrá al menos un profesor en cada departamento
- Puede no haber ninguna clase de PCPI
- Habrá al menos una clase de Bachillerato
- Los ciclos de F.P. no duran más de 2.500 horas
- Los años de permanencia de un profesor no van a pasar de 40

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### a) Nombre del departamento con más profesores
*(0,5 puntos)*

#### b) Nombre del alumno de ESO con mayor nota media, de los grupos de menos de 20 alumnos
*(1,25 puntos)*

#### c) Nombre de las dos últimas especialidades de PCPI introducidas
*(1 punto)*
- Si hay menos de dos en total, deberá indicarse

#### d) Media del número de asignaturas en las clases de Bachillerato
*(1 punto)*

#### e) Número de ciclos de F.P. con más de 1.500 horas
*(0,5 puntos)*

#### f) Nombre del ciclo de F.P. de menor duración
*(0,5 puntos)*

#### g) Nombre del departamento con menor media de años de permanencia en el centro de sus profesores
*(1,25 puntos)*

## Ejemplo de Ejecución

```
=== CENTRO EDUCATIVO - GESTIÓN DE UNIDADES ===

Código de unidad (o 'fin' para terminar): D123
Nombre del departamento: Informática
Número de profesores: 2

Profesor 1:
Nombre: Ana García
Años en el centro: 15

Profesor 2:
Nombre: Luis Martínez
Años en el centro: 8

Código de unidad (o 'fin' para terminar): C456
Tipo de clase (E/P/B/F): E
Número de alumnos: 25

Alumno 1:
Nombre: Juan Pérez
Nota media: 7.5

Alumno 2:
Nombre: María López
Nota media: 8.2

... (continúa hasta nombre "fin")

Código de unidad (o 'fin' para terminar): C789
Tipo de clase (E/P/B/F): P
Nombre de la especialidad: Informática Básica

Código de unidad (o 'fin' para terminar): C012
Tipo de clase (E/P/B/F): B
Número de asignaturas: 6

Código de unidad (o 'fin' para terminar): C345
Tipo de clase (E/P/B/F): F
Nombre del título: Técnico en Sistemas Informáticos
Horas totales: 2000

Código de unidad (o 'fin' para terminar): fin

=== RESULTADOS DEL ANÁLISIS ===
a) Departamento con más profesores: Informática
b) Alumno ESO con mayor nota media (grupos <20): María López (8.2)
c) Dos últimas especialidades PCPI: Informática Básica, [N/A]
d) Media asignaturas Bachillerato: 6.0
e) Ciclos FP >1500 horas: 1
f) Ciclo FP menor duración: Técnico en Sistemas Informáticos (2000h)
g) Departamento con menor media años permanencia: Informática (11.5 años)
```

## Criterios de Evaluación

- **Compilación**: El programa debe compilar sin errores (máximo 4/10 si no compila)
- **Excepciones**: -1 punto por cada tipo de excepción no controlada
- **Funcionalidad**: Puntuación detallada por cada requisito implementado
- **Código**: Se valorará código correcto, indentado, comentado y eficiente

## Buenas Prácticas

- Usa nombres descriptivos para variables
- Comenta el código cuando sea necesario
- Maneja casos límite (no hay clases de cierto tipo, etc.)
- Sigue las convenciones de nomenclatura de Java
- Prueba tu código con diferentes datos de entrada

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio-Alto  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
