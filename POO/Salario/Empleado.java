package Salario;

public abstract class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.salario = salario;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSalario(){
        return salario;
    }

    public abstract String calcularSalario();

    public void saludarEmpleado(){
        System.out.println("¡Hola "+ this.nombre +"! cómo estás");
    }
}
