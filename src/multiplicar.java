import java.util.Scanner;
public class multiplicar {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner (System.in);

    System.out.println("Ingrese un numero para mostrar su tabla de multiplicar del 1 hasta el 10");

    long mult = scanner.nextInt();

    for (int i=1; i<=10; i++){

    System.out.println(mult + " x " + i + " = " + (mult* i));
    }
    
    scanner.close();

    }
}
