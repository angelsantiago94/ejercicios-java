# Examen de Herencia y Polimorfismo

## Descripción

Este examen evalúa conceptos avanzados de herencia y polimorfismo en Java.

## Estructura

- **Vehiculo.java** - Clase abstracta base
- **Coche.java** - Clase concreta que hereda de Vehiculo
- **Motocicleta.java** - Clase concreta que hereda de Vehiculo
- **TestHerencia.java** - Clase de prueba con ejemplos
- **ENUNCIADO.md** - Enunciado completo del examen

## Compilación y Ejecución

```bash
# Compilar
javac -d . *.java

# Ejecutar
java com.ejerciciosjava.herencia.examenes.examen_herencia.TestHerencia
```

## Métodos a Implementar

### Coche:
1. `acelerar()` - Acelera con límite y consumo
2. `frenar()` - Frena el vehículo
3. `calcularConsumo()` - Calcula consumo por distancia
4. `puedeRecorrer()` - Verifica autonomía
5. `repostar()` - Añade combustible

### Motocicleta:
1. `acelerar()` - Acelera según cilindrada y casco
2. `frenar()` - Frena más rápido que coches
3. `calcularConsumo()` - Calcula consumo específico
4. `ponerCasco()` / `quitarCasco()` - Gestiona casco
5. `esSegura()` - Verifica condiciones de seguridad

## Conceptos Evaluados

- Clases abstractas
- Métodos abstractos
- Herencia avanzada
- Polimorfismo
- @Override
- Acceso a miembros protegidos

## Dificultad

Alta - Requiere dominio de herencia y polimorfismo.
