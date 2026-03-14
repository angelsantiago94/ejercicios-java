# Programación Orientada a Objetos (POO)

Este paquete contiene ejercicios para aprender los conceptos fundamentales de Programación Orientada a Objetos en Java.

## Ejercicios Incluidos

### Clases Principales

#### 1. Persona.java
Clase base que demuestra los conceptos fundamentales de POO.

**Conceptos clave:**
- **Atributos:** Variables que representan el estado del objeto
- **Métodos:** Comportamientos que el objeto puede realizar
- **Constructores:** Métodos especiales para crear objetos
- **Encapsulamiento:** Uso de private para proteger datos
- **Getters y Setters:** Métodos para acceder y modificar atributos privados
- **Métodos estáticos:** Pertenecen a la clase, no a los objetos

#### 2. Estudiante.java
Clase que hereda de Persona, demostrando herencia y polimorfismo.

**Conceptos clave:**
- **Herencia:** extends para reutilizar código
- **@Override:** Sobreescribir métodos de la clase padre
- **super():** Llamar constructores de la clase padre
- **Polimorfismo:** Mismo método, diferente comportamiento
- **this vs super:** Diferenciar entre atributos propios y heredados

#### 3. EjercicioPOO.java
Clase principal con ejercicios prácticos para aplicar todos los conceptos.

## Ejercicios Detallados

### Persona.java

#### Ejercicio 1: Constructor vacío
**Objetivo:** Aprender a crear constructores y asignar valores por defecto.

**Consejos:**
- Los constructores tienen el mismo nombre que la clase
- No tienen tipo de retorno
- Usa this para referenciar atributos del objeto

#### Ejercicio 2: Constructor con parámetros
**Objetivo:** Practicar sobrecarga de constructores.

**Consejos:**
- Puedes tener múltiples constructores con diferentes parámetros
- Usa this() para llamar a otro constructor de la misma clase
- Los parámetros pueden tener el mismo nombre que los atributos

#### Ejercicio 3: Constructor completo
**Objetivo:** Crear constructores que inicialicen todos los atributos.

**Consejos:**
- Valida los parámetros antes de asignarlos
- Considera lanzar excepciones para datos inválidos

#### Ejercicio 4: Getters y setters
**Objetivo:** Implementar encapsulamiento y validación.

**Consejos:**
- Los getters siempre devuelven un valor
- Los setters siempre reciben un parámetro y son void
- Valida los datos en los setters para mantener la integridad
- Usa expresiones regulares para validar formatos como DNI

#### Ejercicio 5: Métodos de comportamiento
**Objetivo:** Crear métodos que representen acciones del objeto.

**Concejos:**
- calcularIMC(): Usa la fórmula estándar IMC = peso / altura²
- esMayorDeEdad(): Retorna boolean basado en el atributo edad
- cumpleaños(): Modifica el estado del objeto
- toString(): Sobreescribe el método de Object para representación textual

#### Ejercicio 6: Métodos estáticos
**Objetivo:** Entender la diferencia entre métodos de instancia y estáticos.

**Consejos:**
- Los métodos estáticos usan la palabra clave static
- No pueden acceder a atributos de instancia (no estáticos)
- Se llaman con NombreClase.metodoEstatico()

### Estudiante.java

#### Ejercicio 1: Constructores de la clase hija
**Objetivo:** Aprender a llamar constructores de la clase padre.

**Consejos:**
- Usa super() para llamar constructores de la clase padre
- super() debe ser la primera línea del constructor
- Si no llamas explícitamente a super(), Java llama automáticamente a super()

#### Ejercicio 2: Getters y setters propios
**Objetivo:** Manejar atributos específicos de la clase hija.

**Consejos:**
- Los atributos de la clase hija son independientes
- Puedes tener atributos con el mismo nombre (no recomendado)
- Valida los datos igual que en la clase padre

#### Ejercicio 3: Sobreescribir métodos
**Objetivo:** Practicar polimorfismo mediante sobreescritura.

**Consejos:**
- Usa @Override para indicar que sobreescribes un método
- Puedes llamar al método del padre con super.metodo()
- La firma del método debe ser idéntica

#### Ejercicio 4: Métodos específicos
**Objetivo:** Agregar comportamiento especializado a la clase hija.

**Consejos:**
- agregarNota(): Maneja arrays dinámicamente
- calcularMediaNotas(): Usa bucles para procesar arrays
- Math.random() genera números aleatorios entre 0.0 y 1.0

#### Ejercicio 5: Polimorfismo
**Objetivo:** Demostrar cómo el mismo método se comporta diferente.

**Consejos:**
- El polimorfismo permite tratar objetos de diferentes clases de manera uniforme
- El método que se ejecuta depende del tipo real del objeto
- Usa instanceof para verificar el tipo específico

### EjercicioPOO.java

#### Ejercicio 1: Creación y manipulación de objetos
**Objetivo:** Practicar la instanciación y uso básico de objetos.

**Consejos:**
- Usa new para crear objetos
- Prueba diferentes constructores
- Verifica el estado de los objetos después de cada operación

#### Ejercicio 2: Uso de métodos de comportamiento
**Objetivo:** Interactuar con los objetos a través de sus métodos.

**Consejos:**
- Los métodos pueden modificar el estado del objeto
- Algunos métodos devuelven valores útiles
- Combina múltiples métodos para lograr resultados complejos

#### Ejercicio 3: Arrays de objetos
**Objetivo:** Trabajar con colecciones de objetos.

**Consejos:**
- Los arrays de objetos se declaran como: Clase[] array = new Clase[tamaño]
- Cada elemento debe ser instanciado individualmente
- Usa bucles for-each para recorrer arrays de objetos

#### Ejercicio 4: Polimorfismo en acción
**Objetivo:** Demostrar el poder del polimorfismo.

**Consejos:**
- Puedes asignar objetos de subclases a variables de superclase
- El método que se ejecuta depende del tipo real del objeto
- instanceof es útil para identificar el tipo específico

#### Ejercicio 5: Composición vs Herencia
**Objetivo:** Entender cuándo usar cada técnica.

**Consejos:**
- Herencia: "es un" (Estudiante es una Persona)
- Composición: "tiene un" (Universidad tiene Estudiantes)
- La compospción es más flexible y preferible en muchos casos

#### Ejercicio 6: Encapsulamiento y validación
**Objetivo:** Aprender a proteger la integridad de los datos.

**Consejos:**
- Los setters son el lugar ideal para validación
- Considera lanzar IllegalArgumentException para datos inválidos
- El encapsulamiento permite cambiar la implementación sin afectar al código cliente

#### Ejercicio 7: Métodos estáticos
**Objetivo:** Practicar el uso de métodos de clase.

**Consejos:**
- Los métodos estáticos son útiles para operaciones utilitarias
- No dependen del estado de un objeto específico
- Se pueden llamar directamente desde la clase

#### Ejercicio 8: Equals y hashCode (desafío)
**Objetivo:** Implementar correctamente la igualdad de objetos.

**Consejos:**
- equals() debe ser reflexivo, simétrico, transitivo y consistente
- hashCode() debe devolver el mismo valor para objetos iguales
- Si sobreescribes equals(), debes sobreescribir hashCode()
- Usa IDEs para generar estos métodos automáticamente

## Cómo ejecutar los ejercicios

1. **Completa las clases Persona y Estudiante:**
   - Implementa todos los métodos marcados con "// Tu código aquí"
   - Presta atención a los comentarios y validaciones requeridas

2. **Prueba con EjercicioPOO:**
```java
public static void main(String[] args) {
    EjercicioPOO ejercicios = new EjercicioPOO();
    ejercicios.ejercicio1();
    // Llama a otros ejercicios gradualmente
}
```

3. **Verifica tus soluciones:**
   - Imprime resultados para verificar que funcionan correctamente
   - Prueba con casos edge (valores límite, datos inválidos, etc.)

## Buenas Prácticas POO

- **Principio de responsabilidad única:** Cada clase debe tener una sola razón para cambiar
- **Encapsulamiento:** Mantén los atributos privados y expón comportamiento a través de métodos
- **Herencia apropiada:** Úsala solo cuando realmente exista una relación "es un"
- **Polimorfismo:** Permite que el código trabaje con tipos abstractos en lugar de concretos
- **Validación:** Siempre valida los datos en los setters y constructores
- **Documentación:** Documenta el propósito de cada clase y método con JavaDoc

## Consejos de Aprendizaje

1. **Dibuja diagramas:** Visualiza las relaciones entre clases
2. **Piensa en objetos:** Identifica objetos y sus interacciones en problemas reales
3. **Prueba incremental:** Implementa y prueba un método a la vez
4. **Refactoriza:** Mejora tu código a medida que aprendes mejores prácticas
5. **Experimenta:** Modifica los ejercicios para entender mejor los conceptos
