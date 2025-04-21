import java.util.Scanner;

public class pesopluma {

    public static void main(String[] args) throws Exception {


    Scanner scanner = new Scanner (System.in);

    System.out.println ("¿Usted es fan de peso pluma?");
    String pesodeidad = scanner.nextLine();

    if (pesodeidad.equals("simon carnal")){
    System.out.println ("Tremendo ganador");

    } else {
    System.out.println ("Tremendo fracasado");
}

    scanner.close();
    }
}
