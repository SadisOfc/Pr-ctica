package Salario;

public class MainSalario {
    public static void main(String[] args) {
        Empleado completo = new EmpleadoTiempoCompleto("Baboni", 1962831923.94);
        Empleado horas = new EmpleadoTemporal("Olmairi", 777777777777.94);
        horas.calcularSalario();
        horas.saludarEmpleado();
        completo.calcularSalario();
        completo.saludarEmpleado();
    }
}
