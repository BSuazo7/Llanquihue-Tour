package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        // Crear objetos Direccion
        Direccion dir1 = new Direccion("Av. Frutillar 123", "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Puerto Montt 456", "Puerto Montt", "Los Lagos");
        Direccion dir3 = new Direccion("Camino Lago Llanquihue 789", "Llanquihue", "Los Lagos");

        // Crear objetos Persona (clientes)
        Persona cliente1 = new Persona("Juan", "Pérez", "12.345.678-9", "+56912345678", dir1);
        Persona cliente2 = new Persona("María", "González", "98.765.432-1", "+56987654321", dir2);

        // Crear objeto Empleado (guía turístico)
        Empleado guia1 = new Empleado("Carlos", "Muñoz", "11.222.333-4", "+56911223344", dir3, "Guía Turístico", 850000);

        // Mostrar información por consola
        System.out.println("=== SISTEMA LLANQUIHUE TOUR ===");
        System.out.println();

        System.out.println("--- Cliente 1 ---");
        System.out.println(cliente1.toString());
        System.out.println();

        System.out.println("--- Cliente 2 ---");
        System.out.println(cliente2.toString());
        System.out.println();

        System.out.println("--- Empleado ---");
        System.out.println(guia1.toString());
        System.out.println();

        System.out.println("=== FIN DEL SISTEMA ===");
    }
}
