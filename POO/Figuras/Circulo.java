package Figuras;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        double resultado = radio*Math.PI;
        return resultado;
    }
}
