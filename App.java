import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Por favor, ingrese su nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("Ahora, ingrese su edad");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("En que ciudad vive?");
        String ciudad = scanner.nextLine();

        if (edad>0 && edad<=120) {
        System.out.println("su edad es valida");
        
        System.out.println("Su nombre es " + nombre + ", tiene " + edad + " años, y vive en la ciudad de: " + ciudad);

        if (edad<18) {
        System.out.println("Usted es menor de edad");

        }else if (edad>=18 && edad<=30){
        System.out.println("Usted es un adulto joven");

        }else if (edad>30 && edad<60){
        System.out.println("Usted es un adulto");

        }else if (edad>59) {
        System.out.println ("Usted es un adulto mayor");
        }

        } else {

        System.out.println("Su edad es invalida, vuelva a intentarlo");
        
    }

        scanner.close();

        System.out.println("Gracias por usar mi primer programa!");
    
    }

}

