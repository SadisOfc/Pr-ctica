package Salario;

public class EmpleadoTemporal extends Empleado{
    public EmpleadoTemporal(String nombre, double salario){
        super(nombre,salario);
    }

    @Override
    public String calcularSalario() {
        System.out.println("mmguevo le toca trabajar por horas, cambie de camello bro");
        return null;
    }
}
