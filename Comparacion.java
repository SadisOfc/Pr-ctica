import java.util.Scanner;
public class Comparacion {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su edad");
        int edad = scanner.nextInt();

        if (edad>=18){
            System.out.println("Usted es mayor de edad");
        
        } else {
            System.out.println("Usted es menor de edad");
        }

        scanner.close();
    }
}
