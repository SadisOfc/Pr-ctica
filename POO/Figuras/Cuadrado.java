package Figuras;

public class Cuadrado extends Figura{
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }
}
