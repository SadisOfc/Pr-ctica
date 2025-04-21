import java.util.Scanner;
public class multpordie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long numerito = scanner.nextLong();

        for (int i=1; i<=10; i++){
        System.out.println(numerito + " x " + i + " = " +(numerito*i));
        }

        scanner.close();
        
    }
}
