package com.ejerciciosjava.poop.examenes.examen_herencia;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipo;
    private boolean tieneCasco;

    public Motocicleta() {
        super();
        this.cilindrada = 0;
        this.tipo = "";
        this.tieneCasco = false;
    }

    public Motocicleta(String marca, String modelo, int año, int cilindrada, String tipo) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.tieneCasco = false;
    }

    // Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    @Override
    public void acelerar(double cantidad) {
        // aumenta la velocidad según la cantidad especificada
        // la velocidad máxima depende de la cilindrada:
        // - < 500cc: máximo 120 km/h
        // - 500-1000cc: máximo 180 km/h
        // - > 1000cc: máximo 220 km/h
        // si no tiene casco, solo puede acelerar hasta 80 km/h como máximo
        // TODO: Implementar este método
    }

    @Override
    public void frenar(double cantidad) {
        // reduce la velocidad según la cantidad especificada
        // la velocidad no puede ser negativa
        // las motocicletas frenan más rápido que los coches (1.5x la cantidad)
        // TODO: Implementar este método
    }

    @Override
    public double calcularConsumo(double distancia) {
        // calcula el consumo para una distancia
        // consumo base: 0.04 litros por km
        // si la cilindrada > 1000cc, aumenta 50% el consumo
        // si el tipo es "Deportiva", aumenta 25% el consumo
        // devuelve los litros consumidos
        // TODO: Implementar este método
        return 0.0;
    }

    public void ponerCasco() {
        // pone el casco a la motocicleta
        // TODO: Implementar este método
    }

    public void quitarCasco() {
        // quita el casco de la motocicleta
        // TODO: Implementar este método
    }

    public boolean esSegura() {
        // devuelve true si la motocicleta es segura para conducir
        // es segura si tiene casco Y la velocidad actual es <= 80 km/h
        // TODO: Implementar este método
        return false;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + cilindrada + "cc, " + tipo + 
               ", Casco: " + (tieneCasco ? "Sí" : "No") + "]";
    }
}
