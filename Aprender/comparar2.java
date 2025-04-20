import java.util.Scanner;
public class comparar2 {

    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a comparar dos edades");

        int edad1 = scanner.nextInt();
        int edad2 = scanner.nextInt();

        if (edad1>edad2) {
        System.out.println("la edad de " + edad1 + " años es mayor a la edad de " + edad2 + " años");

        } else if (edad1==edad2) {
        System.out.println("La edad de " + edad1 + " años es igual a la edad de " + edad2 + " años");
        
        } else{
        System.out.println("La edad de " + edad2 + " años es mayor a la edad de " + edad1 + " años");

    }
    
    scanner.close();
    }
}
