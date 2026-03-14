# Examen: La Orden de los Sabios de Arkham (OSA)

## Descripción

La Orden de los Sabios de Arkham (OSA) ha encargado la creación de un programa en Java que permita gestionar y analizar los datos obtenidos por diferentes investigadores y expediciones en diversos lugares relacionados con el culto de Cthulhu.

El objetivo del programa es permitir la introducción de los datos recolectados y generar estadísticas sobre las investigaciones realizadas.

## Especificaciones del Programa

### Entrada de Datos

El programa deberá:

1. **Solicitar la cantidad total de investigadores** que han enviado informes.

2. **Para cada investigador, solicitar:**
   - Nombre del investigador
   - Lugar que ha explorado (ej: R'lyeh, Innsmouth, Dunwich, Arkham, Kingsport...)

3. **Determinar la procedencia del investigador** según su nombre:
   - Si el nombre empieza por la letra "M" → Universidad Miskatonic
   - Si el nombre empieza por "C" → Culto de Cthulhu  
   - Si el nombre empieza por "E" → Erudito independiente
   - En cualquier otro caso → Desconocido

4. **Solicitar códigos de expedición** hasta que se introduzca -1.

5. **Para cada expedición:**
   - Código de expedición (numérico)
   - Seleccionar investigador responsable
   - Número de noches de registro (observaciones)
   - Para cada noche registrada:
     - Nivel de cordura restante del investigador (0–100)
     - Índice de actividad cultista (escala 0 a 10)
     - Nivel de energía cósmica percibida (unidades Lovecraft)

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### A. Número promedio de noches que dura una expedición
*(1,7 puntos)*

#### B. Indica si han participado investigadores de las tres procedencias
*(1,7 puntos)*
- Miskatonic, Culto, Independientes

#### C. El nivel máximo de energía cósmica registrado
*(1,7 puntos)*
- Mostrar: nivel máximo, código de expedición y nombre del investigador

#### D. Los dos valores más bajos de actividad cultista registrados
*(1,7 puntos)*
- En cualquier noche de cualquier expedición

#### E. Porcentaje de expediciones que duraron más de 3 noches
*(1,7 puntos)*

## Ayudas

### Método charAt()
```java
char variable = cadena.charAt(posicion);
```
Devuelve el carácter que se encuentra en una posición específica de la cadena.

### Ignorar mayúsculas/minúsculas
```java
char primeraLetra = Character.toUpperCase(nombre.charAt(0));
```

## Ejemplo de Ejecución

```
=== ORDEN DE LOS SABIOS DE ARKHAM (OSA) ===
Sistema de Gestión de Investigaciones

Cantidad total de investigadores que han enviado informes: 2

Investigador 1:
Nombre: MiskarThompson
Lugar que ha explorado: R'lyeh

Investigador 2:
Nombre: CthulhuFan
Lugar que ha explorado: Innsmouth

=== REGISTRO DE EXPEDICIONES ===
Código de expedición (-1 para finalizar): 111
Investigadores disponibles:
1. MiskarThompson (Miskatonic) - R'lyeh
2. CthulhuFan (Culto) - Innsmouth
Seleccione investigador (1-2): 1
Número de noches de registro: 2

Noche 1:
Nivel de cordura restante (0-100): 90
Índice de actividad cultista (0-10): 3
Nivel de energía cósmica: 15.5

Noche 2:
Nivel de cordura restante (0-100): 85
Índice de actividad cultista (0-10): 5
Nivel de energía cósmica: 22.3

Código de expedición (-1 para finalizar): -1

=== RESULTADOS DEL ANÁLISIS ===
A. Número promedio de noches por expedición: 2.0
B. Participaron investigadores de las tres procedencias: false
C. Nivel máximo de energía cósmica: 22.3 (Expedición 111 - MiskarThompson)
D. Dos valores más bajos de actividad cultista: 3, 5
E. Porcentaje de expediciones > 3 noches: 0.0%
```

## Criterios de Evaluación

- **Compilación**: El programa debe compilar sin errores (máximo 4/10 si no compila)
- **Excepciones**: -1 punto por cada tipo de excepción no controlada
- **Funcionalidad**: Puntuación detallada por cada requisito implementado
- **Código**: Se valorará código correcto, indentado, comentado y eficiente

## Restricciones

- **No se pueden usar arrays o tablas** para el almacenamiento principal
- **Se puede asumir que no se introducen datos incorrectos**
- **Los datos se introducen en el orden indicado**, sin diálogos extra

## Buenas Prácticas

- Usa nombres descriptivos para variables
- Comenta el código cuando sea necesario
- Maneja casos límite (no hay expediciones, etc.)
- Sigue las convenciones de nomenclatura de Java

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio-Alto  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
