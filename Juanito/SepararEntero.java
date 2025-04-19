package Juanito;
import java.util.*;

public class SepararEntero {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        boolean c = true;
        List<Long> lista = new ArrayList<>();
        System.out.println("Separar número entero");
        while (true) {
            System.out.println("Digite un número de más de 1 dígito.");
            long numero = Long.parseLong(l.nextLine());
            if(numero<10 && numero>-10){
                System.out.println("le dije que ingresara un fackin número de más de 1 dígito");
            }else if(numero==10){
                System.out.println("Los números son 1 y 0");
            }else{
                
                while (c) {
                    long residuo = numero % 10;
                    numero = numero/10;
                    lista.add(residuo);
                    if(numero<10){
                        lista.add(numero);
                        c = false;
                    }
                }
                System.out.println("Los dígitos del número son:");
                for(long i : lista){
                    System.out.println(i);
                }
            }

            if(numero==0){
                l.close();
                System.exit(0);
            }
        }
    }
}
