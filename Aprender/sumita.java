import java.util.Scanner;
public class sumita {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    long usur = scanner.nextLong();
    long summa=0;

    for (int i=1; i<=usur; i++){
    summa +=i;
    }
    System.out.println("La suma de los numeros del 1 al "+ usur + " es igual a " + summa);

    scanner.close();
        
    }
}
