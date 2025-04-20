import java.util.Scanner; 
public class Clasinotas {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese que nota ha sacado");
    int nota = scanner.nextInt();

    if (nota==5) {
    System.out.println("Su nota es excelente");
        
    }else if (nota>=3){
    System.out.println("Aprobado");

    }else if (nota>0){
    System.out.println("Yaper");

    }else{
    System.out.println("su nota no es valida");
    }
        scanner.close();
    }
}
