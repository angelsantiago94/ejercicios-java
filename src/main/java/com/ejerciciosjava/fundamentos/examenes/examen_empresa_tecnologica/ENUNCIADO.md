# Examen: Empresa Tecnológica - Gestión de Proyectos

## Descripción

Una empresa tecnológica llamada "TechSolutions" desea realizar un estudio sobre los proyectos que ha desarrollado y los empleados que trabajan en ellos. La empresa tiene diferentes tipos de proyectos: Desarrollo Web, Aplicaciones Móviles, Inteligencia Artificial y Ciberseguridad.

Realiza un programa en Java que permita introducir los datos de proyectos y empleados, y generar estadísticas sobre la productividad de la empresa.

## Especificaciones del Programa

### Entrada de Datos

El programa debe:

1. **Solicitar el número total de empleados** que trabajan en la empresa.

2. **Para cada empleado, solicitar:**
   - Nombre completo del empleado
   - Años de experiencia en la empresa
   - Especialidad: Frontend, Backend, FullStack, DataScience, Security
   - Salario anual (en euros)

3. **Solicitar datos de proyectos** hasta que se introduzca "fin" como nombre del proyecto:
   - Nombre del proyecto
   - Tipo de proyecto: Web, Movil, IA, Seguridad
   - Duración estimada en meses
   - Presupuesto total (en euros)
   - Número de empleados asignados

4. **Para cada empleado asignado al proyecto:**
   - Nombre del empleado (debe existir en la lista de empleados)
   - Horas semanales dedicadas al proyecto
   - Rol en el proyecto: Líder, Desarrollador, Analista, Tester

### Restricciones Importantes

- Todos los empleados asignados a proyectos deben existir en la lista de empleados
- Cada proyecto debe tener al menos 1 empleado asignado
- Los salarios están entre 20.000€ y 100.000€
- Los años de experiencia no superan los 30 años
- Las horas semanales por proyecto no exceden 40 horas
- Los presupuestos de proyectos no superan 500.000€

### Salida de Datos (Resultados)

El programa debe calcular y mostrar:

#### a) Nombre del empleado con mayor salario
*(1 punto)*

#### b) Especialidad con más empleados en la empresa
*(1 punto)*

#### c) Nombre del proyecto con mayor presupuesto por empleado
*(1,5 puntos)*
- Fórmula: presupuesto total / número de empleados asignados

#### d) Media de años de experiencia de los empleados especializados en DataScience
*(1,5 puntos)*

#### e) Número de proyectos de Inteligencia Artificial con duración superior a 6 meses
*(1 punto)*

#### f) Nombre del empleado que trabaja en más proyectos
*(1,5 puntos)*

#### g) Total de horas semanales dedicadas a proyectos de tipo Web por todos los empleados
*(1 punto)*

#### h) Si existe algún proyecto con presupuesto superior a 300.000€ y menos de 3 empleados
*(1 punto)*
- Mostrar mensaje: "Existe proyecto de alto presupuesto con equipo reducido: true/false"

## Ejemplo de Ejecución

```
=== EMPRESA TECNOLÓGICA - GESTIÓN DE PROYECTOS ===

Número total de empleados: 3

Empleado 1:
Nombre completo: Ana García
Años de experiencia: 5
Especialidad (Frontend/Backend/FullStack/DataScience/Security): FullStack
Salario anual (€): 45000

Empleado 2:
Nombre completo: Luis Martínez
Años de experiencia: 8
Especialidad (Frontend/Backend/FullStack/DataScience/Security): DataScience
Salario anual (€): 55000

Empleado 3:
Nombre completo: María López
Años de experiencia: 3
Especialidad (Frontend/Backend/FullStack/DataScience/Security): Frontend
Salario anual (€): 35000

=== REGISTRO DE PROYECTOS ===
Nombre del proyecto (o 'fin' para terminar): E-commerce Redesign
Tipo de proyecto (Web/Movil/IA/Seguridad): Web
Duración estimada (meses): 4
Presupuesto total (€): 120000
Número de empleados asignados: 2

Empleado 1:
Nombre del empleado: Ana García
Horas semanales: 20
Rol (Líder/Desarrollador/Analista/Tester): Líder

Empleado 2:
Nombre del empleado: María López
Horas semanales: 25
Rol (Líder/Desarrollador/Analista/Tester): Desarrollador

Nombre del proyecto (o 'fin' para terminar): fin

=== RESULTADOS DEL ANÁLISIS ===
a) Empleado con mayor salario: Luis Martínez (55000€)
b) Especialidad con más empleados: FullStack (1), Frontend (1), DataScience (1) [Empate]
c) Proyecto con mayor presupuesto por empleado: E-commerce Redesign (60000€/empleado)
d) Media años experiencia DataScience: 8.0 años
e) Proyectos IA > 6 meses: 0
f) Empleado que trabaja en más proyectos: Ana García (1 proyecto), María López (1 proyecto) [Empate]
g) Total horas semanales proyectos Web: 45 horas
h) Existe proyecto de alto presupuesto con equipo reducido: false
```

## Criterios de Evaluación

- **Compilación**: El programa debe compilar sin errores (máximo 4/10 si no compila)
- **Excepciones**: -1 punto por cada tipo de excepción no controlada
- **Funcionalidad**: Puntuación detallada por cada requisito implementado
- **Código**: Se valorará código correcto, indentado, comentado y eficiente

## Buenas Prácticas

- Usa nombres descriptivos para variables
- Comenta el código cuando sea necesario
- Maneja casos límite (no hay proyectos de cierto tipo, etc.)
- Sigue las convenciones de nomenclatura de Java
- Prueba tu código con diferentes datos de entrada

---

**Tiempo estimado**: 90-120 minutos  
**Nivel**: Medio-Alto  
**Tecnologías**: Java básico, Scanner, variables, bucles, condicionales
