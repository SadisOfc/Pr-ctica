package Figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double resultado = base*altura/2;
        return resultado;
    }
}
