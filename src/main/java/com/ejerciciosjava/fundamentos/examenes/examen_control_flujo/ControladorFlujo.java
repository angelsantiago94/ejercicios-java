package com.ejerciciosjava.fundamentos.examenes.examen_control_flujo;

public class ControladorFlujo {
    
    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public String clasificarEdad(int edad) {
        // clasifica a una persona según su edad:
        // "Menor de edad" (< 18)
        // "Adulto" (18-64)
        // "Adulto mayor" (65+)
        // Si la edad es negativa, devuelve "Edad inválida"
        // TODO: Implementar este método
        return "";
    }
    
    public String obtenerDiaSemana(int numeroDia) {
        // devuelve el nombre del día de la semana según el número:
        // 1: "Lunes", 2: "Martes", ..., 7: "Domingo"
        // Si el número no está en el rango 1-7, devuelve "Día inválido"
        // Usa switch-case
        // TODO: Implementar este método
        return "";
    }
    
    public String generarSecuenciaNumeros() {
        // genera una secuencia de números usando bucles:
        // 1. Números del 1 al 10 (cada uno en nueva línea)
        // 2. Números pares del 2 al 20 (separados por espacios)
        // Devuelve un String con ambas secuencias
        // TODO: Implementar este método
        return "";
    }
    
    public String cuentaRegresiva(int inicio) {
        // simula una cuenta regresiva desde el número inicio hasta 0
        // Cada número en una línea
        // Cuando llega a 0, imprime "¡Despegue!"
        // Si inicio es negativo, devuelve "Inicio inválido"
        // Usa bucle while
        // TODO: Implementar este método
        return "";
    }
    
    public String simularAdivinanza(int[] intentos, int numeroSecreto) {
        // simula un juego de adivinar número entre 1 y 10
        // Recibe un array con los intentos del jugador
        // Para cada intento, muestra "Intento X: Y - Mayor/Menor/Correcto"
        // Cuando acierte, muestra "¡Adivinaste en X intentos!"
        // Si no acierta en todos los intentos, muestra "No adivinaste. El número era: X"
        // Usa bucle do-while o for
        // TODO: Implementar este método
        return "";
    }
    
    public String filtrarNumeros(int[] numeros) {
        // procesa un array de números del 1 al 20:
        // - Salta los múltiplos de 3 (usando continue)
        // - Detén el procesamiento cuando llegues a 15 (usando break)
        // Devuelve un String con los números procesados separados por espacios
        // TODO: Implementar este método
        return "";
    }
    
    public String tablaMultiplicar(int numero, int limite) {
        // genera la tabla de multiplicar de un número hasta el límite
        // Formato: "5 x 1 = 5", "5 x 2 = 10", etc.
        // Cada resultado en una línea
        // Si el límite es menor que 1, usa 10 por defecto
        // TODO: Implementar este método
        return "";
    }
    
    public String calcularFactorial(int n) {
        // calcula el factorial de un número usando bucle
        // Formato: "Factorial de 5 = 1 x 2 x 3 x 4 x 5 = 120"
        // Si n es negativo, devuelve "Factorial no definido para números negativos"
        // Si n es 0, devuelve "Factorial de 0 = 1"
        // TODO: Implementar este método
        return "";
    }
    
    public String numerosPrimos(int limite) {
        // genera todos los números primos hasta el límite
        // Usa bucles anidados para verificar primalidad
        // Devuelve los primos separados por comas
        // Si no hay primos, devuelve "No hay números primos en este rango"
        // TODO: Implementar este método
        return "";
    }
    
    public String patronTriangular(int altura) {
        // genera un patrón triangular con asteriscos
        // Ejemplo altura=4:
        // *
        // **
        // ***
        // ****
        // Si la altura es menor que 1, devuelve "Altura inválida"
        // TODO: Implementar este método
        return "";
    }
    
    public String validarPassword(String password) {
        // valida una contraseña según estos criterios:
        // - Al menos 8 caracteres
        // - Contiene al menos una letra mayúscula
        // - Contiene al menos una letra minúscula
        // - Contiene al menos un número
        // Devuelve "Válida" si cumple todos, sino "Inválida: [razones]"
        // TODO: Implementar este método
        return "";
    }
}
