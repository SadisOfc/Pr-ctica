import java.util.Scanner;
public class Mayormenor {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 numeros");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b) {
        System.out.println("El numero " + a + " es mayor al numero " + b);
        
        }else{
        System.out.println("El numero " + b + " es mayor al numero " + a);

        }

        scanner.close();
    }
}
