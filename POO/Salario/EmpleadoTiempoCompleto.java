package Salario;

public class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, double salario){
        super(nombre, salario);
    }

    @Override
    public String calcularSalario() {
       System.out.println("Este kbrón factura más que el man que trabaja por horas, brrr");
        return null;
    }
}
