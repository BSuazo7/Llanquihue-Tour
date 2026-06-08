package model;

public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, String apellido, String rut, String telefono, Direccion direccion, String cargo, double sueldo) {
        super(nombre, apellido, rut, telefono, direccion); // Llama al constructor de Persona
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo +
                "\nSueldo: $" + sueldo;
    }
}
