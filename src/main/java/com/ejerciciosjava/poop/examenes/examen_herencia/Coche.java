package com.ejerciciosjava.poop.examenes.examen_herencia;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;
    private double capacidadDeposito;
    private double combustibleActual;

    public Coche() {
        super();
        this.numeroPuertas = 0;
        this.tipoCombustible = "";
        this.capacidadDeposito = 0.0;
        this.combustibleActual = 0.0;
    }

    public Coche(String marca, String modelo, int año, int numeroPuertas, 
                 String tipoCombustible, double capacidadDeposito) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
        this.capacidadDeposito = capacidadDeposito;
        this.combustibleActual = capacidadDeposito * 0.5; // Medio depósito por defecto
    }

    // Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(double capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public double getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(double combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    @Override
    public void acelerar(double cantidad) {
        // aumenta la velocidad según la cantidad especificada
        // la velocidad máxima es 200 km/h
        // cada aceleración consume combustible: 0.1 litros por cada km/h aumentado
        // no puede acelerar si no hay suficiente combustible
        // TODO: Implementar este método
    }

    @Override
    public void frenar(double cantidad) {
        // reduce la velocidad según la cantidad especificada
        // la velocidad no puede ser negativa
        // el frenado no consume combustible
        // TODO: Implementar este método
    }

    @Override
    public double calcularConsumo(double distancia) {
        // calcula el consumo de combustible para una distancia
        // consumo base: 0.08 litros por km
        // si el tipo de combustible es "Diesel", reduce un 20% el consumo
        // si la velocidad media es > 100 km/h, aumenta un 15% el consumo
        // devuelve los litros consumidos
        // TODO: Implementar este método
        return 0.0;
    }

    public boolean puedeRecorrer(double distancia) {
        // devuelve true si el coche tiene suficiente combustible para recorrer la distancia
        // usa el método calcularConsumo() para determinar el consumo necesario
        // TODO: Implementar este método
        return false;
    }

    public void repostar(double litros) {
        // añade combustible al depósito
        // no puede superar la capacidad máxima del depósito
        // si intenta repostar más de lo que cabe, solo añade lo que cabe
        // TODO: Implementar este método
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + numeroPuertas + " puertas, " + 
               tipoCombustible + ", " + String.format("%.1f", combustibleActual) + 
               "/" + String.format("%.1f", capacidadDeposito) + "L]";
    }
}
