# Paquete de Exámenes de Programación Java

## Descripción General

Este paquete contiene una colección completa de exámenes de programación en Java, organizados por temas específicos. Cada examen está diseñado para evaluar competencias particulares y sigue una estructura consistente.

## 📁 Estructura de Paquetes

```
com.ejerciciosjava/
├── arrays/examenes/examen_arrays/              # Arrays y Matrices
├── fundamentos/examenes/                        # Exámenes de Fundamentos
│   ├── examen_strings/                          # Strings y Manipulación de Texto
│   ├── examen_POO/                              # Programación Orientada a Objetos
│   ├── examen_variables/                        # Variables y Tipos de Datos
│   └── examen_control_flujo/                    # Control de Flujo
├── poop/examenes/examen_herencia/               # Herencia y Polimorfismo
└── colecciones/examenes/                        # Exámenes de Colecciones
    ├── examen_vuelos/                           # Gestión de Vuelos
    └── examen_biblioteca/                       # Gestión de Biblioteca
```

## 🎯 Exámenes Disponibles

### 1. Arrays y Matrices (`arrays/examenes/examen_arrays/`)
- **Nivel**: Bajo-Medio
- **Contenido**: Operaciones con arrays unidimensionales y matrices
- **Métodos**: 9 métodos para implementar
- **Conceptos**: Recorrido, búsqueda, ordenación básica, matrices simétricas

### 2. Variables y Tipos de Datos (`fundamentos/examenes/examen_variables/`)
- **Nivel**: Bajo-Medio
- **Contenido**: Variables primitivas, operaciones aritméticas, conversiones
- **Métodos**: 9 métodos para implementar
- **Conceptos**: Tipos primitivos, casting, constantes, formateo
- **Basado en**: EjercicioVariables.java

### 3. Strings y Manipulación de Texto (`fundamentos/examenes/examen_strings/`)
- **Nivel**: Medio
- **Contenido**: Procesamiento de cadenas de texto
- **Métodos**: 10 métodos para implementar
- **Conceptos**: Manipulación de caracteres, palíndromos, análisis textual
- **Ubicación**: Fundamentos (conceptos básicos de Java)

### 4. Control de Flujo (`fundamentos/examenes/examen_control_flujo/`)
- **Nivel**: Medio
- **Contenido**: Estructuras de control, condicionales, bucles
- **Métodos**: 11 métodos para implementar
- **Conceptos**: if-else, switch, for, while, do-while, break, continue
- **Basado en**: EjercicioControlFlujo.java

### 5. Programación Orientada a Objetos (`fundamentos/examenes/examen_POO/`)
- **Nivel**: Medio-Alto
- **Contenido**: Clases, objetos, herencia simple
- **Clases**: Persona (base), Estudiante, Profesor
- **Conceptos**: Encapsulación, herencia, toString(), equals(), hashCode()
- **Ubicación**: Fundamentos (conceptos POO básicos)

### 6. Herencia y Polimorfismo (`poop/examenes/examen_herencia/`)
- **Nivel**: Alto
- **Contenido**: Clases abstractas y polimorfismo
- **Clases**: Vehiculo (abstracta), Coche, Motocicleta
- **Conceptos**: Métodos abstractos, @Override, polimorfismo avanzado
- **Ubicación**: POOP (Programación Orientada a Objetos Avanzada)

### 7. Gestión de Vuelos (`colecciones/examenes/examen_vuelos/`)
- **Nivel**: Medio-Alto
- **Contenido**: Gestión de sistema de vuelos
- **Colecciones**: TreeMap, HashSet, TreeSet
- **Conceptos**: Estructuras de datos complejas, relaciones entre objetos

### 8. Gestión de Biblioteca (`colecciones/examenes/examen_biblioteca/`)
- **Nivel**: Alto
- **Contenido**: Sistema completo de biblioteca
- **Colecciones**: TreeMap, ArrayList, HashMap, TreeSet
- **Conceptos**: Manejo de fechas, consultas complejas, gestión de estado

## 🔧 Características Comunes

### Estructura de Cada Examen
- ✅ **Clases base completas** con constructores y atributos
- ✅ **Métodos TODO** para implementar por los alumnos
- ✅ **Clases de prueba** con ejemplos comentados
- ✅ **Enunciado detallado** en formato Markdown
- ✅ **Sistema de puntuación** específico
- ✅ **Ejemplos de ejecución** para verificación

### Sistema de Evaluación
- 📊 **Compilación**: Programa que no compile = nota máxima 4/10
- ⚠️ **Excepciones**: -1 punto por cada tipo de excepción no controlada
- 📈 **Puntuación detallada** por método y concepto
- 🎯 **Ejemplos de salida** para facilitar corrección

### Requisitos Técnicos
- ☕ **Java 8+** compatible
- 🚫 **Sin Streams API** (bucles tradicionales)
- 🛡️ **Manejo de casos límite** (null, vacíos, etc.)
- ✅ **Validación de parámetros** de entrada
- 📝 **Código robusto y legible**

## 🚀 Cómo Usar los Exámenes

### Para Estudiantes
1. **Leer el enunciado** completo en `ENUNCIADO.md`
2. **Implementar los métodos** marcados con `// TODO:`
3. **Descomentar las pruebas** en la clase Test correspondiente
4. **Compilar y ejecutar** para verificar la implementación
5. **Comparar la salida** con los ejemplos proporcionados

### Para Profesores
1. **Seleccionar el examen** adecuado según nivel y contenidos
2. **Proporcionar las clases base** a los estudiantes
3. **Establecer tiempo límite** según complejidad (90-120 min)
4. **Usar la puntuación detallada** para evaluación objetiva
5. **Verificar manejo de casos límite** y excepciones

## 📋 Compilación y Ejecución

Para cada examen:
```bash
# Navegar al directorio del examen
cd /path/to/examen/

# Compilar
javac -d . *.java

# Ejecutar
java com.ejerciciosjava.[paquete].examenes.[examen].Test[Nombre]
```

Ejemplos:
```bash
# Arrays
java com.ejerciciosjava.arrays.examenes.examen_arrays.TestArrays

# Variables (Fundamentos)
java com.ejerciciosjava.fundamentos.examenes.examen_variables.TestVariables

# Strings (Fundamentos)
java com.ejerciciosjava.fundamentos.examenes.examen_strings.TestStrings

# Control de Flujo (Fundamentos)
java com.ejerciciosjava.fundamentos.examenes.examen_control_flujo.TestControlFlujo

# POO (Fundamentos)
java com.ejerciciosjava.fundamentos.examenes.examen_POO.TestPOO

# Herencia (POOP)
java com.ejerciciosjava.poop.examenes.examen_herencia.TestHerencia

# Colecciones - Vuelos
java com.ejerciciosjava.colecciones.examenes.examen_vuelos.TestExamen
```

## 📈 Secuencia Recomendada de Aprendizaje

### Fundamentos de Java
1. **Arrays y Matrices** - Fundamentos de estructuras de datos
2. **Variables y Tipos de Datos** - Tipos primitivos y operaciones básicas
3. **Strings y Manipulación** - Procesamiento de texto básico
4. **Control de Flujo** - Estructuras condicionales y bucles
5. **Programación Orientada a Objetos** - Conceptos POO básicos

### Programación Orientada a Objetos Avanzada
6. **Herencia y Polimorfismo** - POO avanzado

### Aplicaciones Prácticas
7. **Gestión de Vuelos** - Aplicación de colecciones simples
8. **Gestión de Biblioteca** - Aplicación de colecciones complejas

## 🔄 Organización por Paquetes

### Fundamentos (`fundamentos/`)
- Contiene conceptos básicos y fundamentales de Java
- **Arrays**: Estructuras de datos fundamentales
- **Variables**: Tipos primitivos, operaciones aritméticas, conversiones
- **Strings**: Manipulación de texto (concepto fundamental)
- **Control de Flujo**: Estructuras condicionales y bucles
- **POO**: Programación Orientada a Objetos básica

### Arrays (`arrays/`)
- Estructuras de datos fundamentales
- Manejo de arrays unidimensionales y multidimensionales

### POOP (`poop/`)
- Programación Orientada a Objetos Avanzada
- **Herencia**: Conceptos avanzados de herencia y polimorfismo

### Colecciones (`colecciones/`)
- Framework de Colecciones de Java
- Aplicaciones prácticas y complejas

## 🎓 Objetivos Pedagógicos

- 📚 **Progresión gradual** en dificultad y complejidad
- 🔧 **Aplicación práctica** de conceptos teóricos
- 🏗️ **Desarrollo de habilidades** de resolución de problemas
- ✨ **Preparación completa** para evaluaciones de programación
- 🎯 **Evaluación objetiva** con criterios claros

## 📝 Notas Importantes

- Los exámenes están diseñados para ser **autosuficientes**
- Cada examen incluye **ejemplos detallados** de ejecución
- Se recomienda **resolver en orden** según la secuencia propuesta
- Los enunciados incluyen **requisitos específicos** y restricciones
- La **documentación está completa** para facilitar el aprendizaje

---

**Creado para**: Formación en Programación Java  
**Nivel**: 1º DAM / Inicial - Intermedio - Avanzado  
**Formato**: Exámenes prácticos con enunciados detallados
