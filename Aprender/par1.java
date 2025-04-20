import java.util.Scanner;
public class par1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba un numero para comprobar si es par o no");
        int numerr = scanner.nextInt();

        if (numerr % 2 == 0) {
        System.out.println("El numero " + numerr + " es par");

        } else {
        System.out.println("El numero " + numerr + "es impar");
        
        }
        scanner.close();
    }
}
