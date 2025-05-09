package Juanito;
import java.util.*;

public class SepararEntero {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        boolean c = true;
        List<Integer> lista = new ArrayList<>();
        System.out.println("Separar número entero");
        while (true) {
            System.out.println("Menú");
            System.out.println("1. Agrergar número");
            System.out.println("2. Imprimir dígitos");
            System.out.println("3. Realizar Suma");
            System.out.println("4. Salir");
            int menu = Integer.parseInt(l.nextLine());
            System.out.println();
            switch (menu) {

                case 1:
                System.out.println("Digite un número de más de 1 dígito.");
                int numero = Integer.parseInt(l.nextLine());
                if(numero<10 && numero>-10){
                    System.out.println("le dije que ingresara un fackin número de más de 1 dígito");
                }else if(numero==10){
                    System.out.println("Los números son 1 y 0");
                }else{
                    
                    while (c) {
                        int residuo = numero % 10;
                        numero = numero/10;
                        lista.add(residuo);
                        if(numero<10){
                            lista.add(numero);
                            c = false;
                        }
                    }
                    System.out.println("Listo, mmgbo");
                }
                    break;

                    case 2:
                    System.out.println("Los dígitos del número son:");
                    for(int i : lista){
                        System.out.println(i);
                    }
                    System.out.println();
                    break;

                    case 3:
                    int suma = 0;
                    for(int i=0;i<lista.size();i++){
                        suma=suma+lista.get(i);
                    }
                    System.out.println("El resultado de la suma es: " + suma);
                    break;

                    case 4:
                    System.out.println("Nos vemos");
                    l.close();
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Opción inválida, inténtelo nuevamente.");
                    break;
            }
            }
        }
    }

