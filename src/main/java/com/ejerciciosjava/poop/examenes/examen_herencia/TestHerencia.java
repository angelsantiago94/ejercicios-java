package com.ejerciciosjava.poop.examenes.examen_herencia;

public class TestHerencia {
    public static void main(String[] args) {
        // Crear vehículos
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 4, "Gasolina", 50.0);
        Coche coche2 = new Coche("BMW", "Serie 3", 2021, 2, "Diesel", 60.0);
        Motocicleta moto1 = new Motocicleta("Honda", "CBR", 2023, 600, "Deportiva");
        Motocicleta moto2 = new Motocicleta("Yamaha", "MT-07", 2022, 689, "Naked");

        System.out.println("=== HERENCIA Y POLIMORFISMO - EXAMEN ===");
        System.out.println();

        System.out.println("=== VEHÍCULOS CREADOS ===");
        System.out.println("Coche 1: " + coche1.getInfo());
        System.out.println("Coche 2: " + coche2.getInfo());
        System.out.println("Moto 1: " + moto1.getInfo());
        System.out.println("Moto 2: " + moto2.getInfo());
        System.out.println();

        // Pruebas de aceleración y frenado (descomentar cuando implementes los métodos)
        /*
        System.out.println("=== PRUEBAS DE MOVIMIENTO ===");
        
        // Pruebas con coche 1
        System.out.println("--- Coche 1 ---");
        coche1.acelerar(50);
        System.out.println("Tras acelerar 50 km/h: " + coche1.getInfo());
        coche1.acelerar(100);
        System.out.println("Tras acelerar 100 km/h: " + coche1.getInfo());
        coche1.acelerar(100); // Intenta superar el máximo
        System.out.println("Tras intentar superar máximo: " + coche1.getInfo());
        coche1.frenar(30);
        System.out.println("Tras frenar 30 km/h: " + coche1.getInfo());
        coche1.detener();
        System.out.println("Tras detener: " + coche1.getInfo());
        System.out.println();

        // Pruebas con moto 1
        System.out.println("--- Moto 1 ---");
        moto1.ponerCasco();
        System.out.println("Casco puesto: " + moto1.getInfo());
        moto1.acelerar(60);
        System.out.println("Tras acelerar 60 km/h: " + moto1.getInfo());
        moto1.acelerar(100);
        System.out.println("Tras acelerar 100 km/h: " + moto1.getInfo());
        moto1.quitarCasco();
        System.out.println("Casco quitado: " + moto1.getInfo());
        moto1.acelerar(50); // Sin casco, límite 80 km/h
        System.out.println("Acelerar sin casco: " + moto1.getInfo());
        System.out.println("¿Es segura?: " + moto1.esSegura());
        System.out.println();

        System.out.println("=== PRUEBAS DE CONSUMO ===");
        double distancia = 100.0;
        System.out.println("Distancia a recorrer: " + distancia + " km");
        System.out.println("Consumo coche 1 (Gasolina): " + String.format("%.2f", coche1.calcularConsumo(distancia)) + " L");
        System.out.println("Consumo coche 2 (Diesel): " + String.format("%.2f", coche2.calcularConsumo(distancia)) + " L");
        System.out.println("Consumo moto 1 (Deportiva): " + String.format("%.2f", moto1.calcularConsumo(distancia)) + " L");
        System.out.println("Consumo moto 2 (Naked): " + String.format("%.2f", moto2.calcularConsumo(distancia)) + " L");
        System.out.println();

        System.out.println("=== PRUEBAS DE COMBUSTIBLE ===");
        System.out.println("¿Coche 1 puede recorrer 200 km?: " + coche1.puedeRecorrer(200));
        System.out.println("Repostando 20L al coche 1...");
        coche1.repostar(20);
        System.out.println("Coche 1 tras repostar: " + coche1.getInfo());
        System.out.println("¿Coche 1 puede recorrer 200 km ahora?: " + coche1.puedeRecorrer(200));
        System.out.println("Intentando repostar 100L (excede capacidad)...");
        coche1.repostar(100);
        System.out.println("Coche 1 tras intentar sobrellenar: " + coche1.getInfo());
        System.out.println();

        System.out.println("=== POLIMORFISMO ===");
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2};
        
        for (Vehiculo v : vehiculos) {
            System.out.println("Tipo: " + v.getClass().getSimpleName());
            v.acelerar(50);
            System.out.println("Tras acelerar 50: " + v.getInfo());
            System.out.println("Consumo para 50 km: " + String.format("%.2f", v.calcularConsumo(50)) + " L");
            v.detener();
            System.out.println("Tras detener: " + v.getInfo());
            System.out.println("---");
        }
        */
    }
}
