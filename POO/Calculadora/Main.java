package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Metodos metodos = new Metodos();
        while (true) {
            System.out.println("Menú:");
            System.out.println("1.Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int menu = l.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    System.out.println("Sumar");
                    System.out.println("Numerador");
                    double num1 = l.nextDouble();
                    System.out.println("Denominador");
                    double num2 = l.nextDouble();
                    double resultado = metodos.Sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Restar");
                    System.out.println("Numerador");
                     num1 = l.nextDouble();
                    System.out.println("Denominador");
                     num2 = l.nextDouble();
                     resultado = metodos.Restar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    System.out.println("Numerador");
                     num1 = l.nextDouble();
                    System.out.println("Denominador");
                     num2 = l.nextDouble();
                     resultado = metodos.Multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Dividir");
                    System.out.println("Numerador");
                     num1 = l.nextDouble();
                    System.out.println("Denominador");
                     num2 = l.nextDouble();
                     resultado = metodos.Sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5:
                    l.close();
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Opción inválida");
                    break;
            }
        }
        
    }
}
