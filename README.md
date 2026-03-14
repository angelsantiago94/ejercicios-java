# Ejercicios Java - Proyecto de Aprendizaje

Bienvenido al proyecto de ejercicios Java para aprender programación desde cero hasta niveles intermedios/avanzados.

## 🎯 Objetivo del Proyecto

Este proyecto está diseñado para que nuevos programadores aprendan Java de manera práctica y progresiva a través de ejercicios estructurados por conceptos fundamentales.

## 📚 Estructura del Proyecto

```
src/main/java/com/ejerciciosjava/
├── fundamentos/          # Conceptos básicos de Java
├── arrays/              # Arrays unidimensionales y bidimensionales
├── poop/                # Programación Orientada a Objetos
├── colecciones/         # List, Set, Map y Java Collections Framework
├── excepciones/         # Manejo de errores y excepciones
└── streams/             # Streams y programación funcional (Java 8+)
```

## 🚀 Cómo Empezar

### Requisitos Previos
- Java Development Kit (JDK) 8 o superior
- Un IDE (IntelliJ IDEA, Eclipse, VS Code con Java Extension)
- Conocimientos básicos de programación (variables, bucles, condicionales)

### Guía de Aprendizaje

#### 1. Fundamentos 📖
**Paquete:** `fundamentos/`
- **Variables y Tipos de Datos:** Aprende los tipos primitivos y objetos de Java
- **Control de Flujo:** Domina condicionales y bucles
- **Operadores:** Aritméticos, lógicos, de comparación

**Archivos:**
- `EjercicioVariables.java` - 4 ejercicios progresivos
- `EjercicioControlFlujo.java` - 6 ejercicios de control de flujo
- `README.md` - Explicaciones detalladas y consejos

#### 2. Arrays 📊
**Paquete:** `arrays/`
- **Arrays Unidimensionales:** Creación, recorrido, búsqueda, ordenamiento
- **Arrays Bidimensionales:** Matrices, operaciones matemáticas, algoritmos

**Archivos:**
- `EjercicioArraysUnidimensionales.java` - 8 ejercicios
- `EjercicioArraysBidimensionales.java` - 8 ejercicios
- `README.md` - Conceptos y buenas prácticas

#### 3. Programación Orientada a Objetos 🏗️
**Paquete:** `poop/`
- **Clases y Objetos:** Creación, atributos, métodos
- **Constructores:** Sobrecarga, validación
- **Encapsulamiento:** Getters, setters, visibilidad
- **Herencia:** extends, super, @Override
- **Polimorfismo:** Comportamiento dinámico

**Archivos:**
- `Persona.java` - Clase base con 6 ejercicios integrados
- `Estudiante.java` - Clase hija con 5 ejercicios
- `EjercicioPOO.java` - 8 ejercicios prácticos
- `README.md` - Guía completa de POO

#### 4. Colecciones 🗂️
**Paquete:** `colecciones/`
- **List:** ArrayList, LinkedList, operaciones avanzadas
- **Set:** HashSet, TreeSet, eliminación de duplicados
- **Map:** HashMap, TreeMap, diccionarios y asociaciones

**Archivos:**
- `EjercicioList.java` - 8 ejercicios
- `EjercicioSet.java` - 8 ejercicios
- `EjercicioMap.java` - 8 ejercicios
- `README.md` - Java Collections Framework completo

#### 5. Excepciones ⚠️
**Paquete:** `excepciones/`
- **Manejo Básico:** try-catch-finally
- **Excepciones Personalizadas:** Creación y lanzamiento
- **Jerarquías:** Checked vs Unchecked
- **Patrones Avanzados:** Retry, Circuit Breaker

**Archivos:**
- `EjercicioExcepciones.java` - 10 ejercicios completos
- `JovenException.java` - Excepción checked
- `EdadInvalidaException.java` - Excepción unchecked
- `README.md` - Guía exhaustiva de manejo de errores

#### 6. Streams y Programación Funcional 🌊
**Paquete:** `streams/`
- **Streams Básicos:** Creación, operaciones intermedias y terminales
- **Collectors:** Agrupación, partición, recolección
- **Programación Funcional:** Lambdas, referencias a métodos
- **Streams Paralelos:** Procesamiento concurrente

**Archivos:**
- `EjercicioStreams.java` - 10 ejercicios progresivos
- `README.md` - Guía completa de streams y programación funcional

## 🛠️ Cómo Usar los Ejercicios

### 1. Lee la Documentación
Cada paquete incluye un archivo `README.md` con:
- Explicaciones conceptuales detalladas
- Consejos y buenas prácticas
- Ejemplos de código
- Casos de uso prácticos

### 2. Implementa los Ejercicios
- Abre cada archivo `.java`
- Busca los comentarios `// Tu código aquí`
- Implementa las soluciones paso a paso
- No te saltes las validaciones requeridas

### 3. Prueba tus Soluciones
```java
public static void main(String[] args) {
    // Ejemplo para fundamentos
    com.ejerciciosjava.fundamentos.EjercicioVariables ejVar = new com.ejerciciosjava.fundamentos.EjercicioVariables();
    ejVar.ejercicio1();
    
    // Ejemplo para POO
    com.ejerciciosjava.poop.EjercicioPOO ejPOO = new com.ejerciciosjava.poop.EjercicioPOO();
    ejPOO.ejercicio1();
}
```

### 4. Experimenta y Mejora
- Modifica los ejercicios para probar diferentes casos
- Añade tus propias validaciones
- Optimiza las soluciones
- Compara diferentes enfoques

## 📈 Ruta de Aprendizaje Sugerida

### Nivel Principiante (Semanas 1-4)
1. **Fundamentos:** Domina variables, operadores, control de flujo
2. **Arrays:** Practica con estructuras de datos básicas

### Nivel Intermedio (Semanas 5-8)
3. **POO:** Aprende conceptos de orientación a objetos
4. **Colecciones:** Domina Java Collections Framework

### Nivel Avanzado (Semanas 9-12)
5. **Excepciones:** Manejo robusto de errores
6. **Streams:** Programación funcional y moderna

## 💡 Consejos de Aprendizaje

### Para Principiantes
- **Un concepto a la vez:** No avances hasta entender completamente
- **Practica constantemente:** La programación se aprende haciendo
- **Lee los errores:** Los mensajes de error son tus amigos
- **Pide ayuda:** No dudes en consultar documentación o foros

### Para Intermedios/Avanzados
- **Refactoriza constantemente:** Mejora tu código continuamente
- **Mide rendimiento:** Compara diferentes soluciones
- **Aprende patrones:** Identifica patrones de diseño comunes
- **Contribuye:** Comparte tus conocimientos con otros

## 🔧 Configuración del Entorno

### Usando Maven (Recomendado)
```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### Usando Gradle
```gradle
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.8.2'
}
```

## 📖 Recursos Adicionales

### Documentación Oficial
- [Java Documentation](https://docs.oracle.com/javase/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)

### Tutoriales Recomendados
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Baeldung Java Guide](https://www.baeldung.com/java)
- [W3Schools Java](https://www.w3schools.com/java/)

### Libros Sugeridos
- "Head First Java" para principiantes
- "Effective Java" para intermedios/avanzados
- "Java 8 in Action" para streams y programación funcional

## 🤝 Contribuciones

¡Este proyecto es colaborativo! Si quieres contribuir:
- Reporta errores o mejoras en los ejercicios
- Sugiere nuevos ejercicios o temas
- Comparte tus soluciones y enfoques
- Ayuda a otros aprendices en la comunidad

## 📝 Licencia

Este proyecto está diseñado para fines educativos. Siéntete libre de usarlo, modificarlo y compartirlo para aprender y enseñar Java.

---

**¡Feliz aprendizaje y que disfrutes programando en Java! 🚀**
