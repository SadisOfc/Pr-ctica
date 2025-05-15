package Figuras;

public class Main {
    public static void main(String[] args) {
        Figura figuras[] = {
            new Cuadrado(4),
            new Circulo(3),
            new Triangulo(10, 5),
            new Rectangulo(6, 3),
            new Cuadrado(5.5),
            new Circulo(6.5)
        };

        for(Figura i : figuras){
            System.out.println("Área de la figura: " + i.calcularArea());
        }
    }
}
