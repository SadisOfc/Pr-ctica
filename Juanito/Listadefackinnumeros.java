package Juanito;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Listadefackinnumeros {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.println("Número mayor, número menor y promedio");
        boolean centinela = true;
        while(true){
            System.out.println("Menú");
            System.out.println("1. Agregar números");
            System.out.println("2. Limpiar Lista");
            System.out.println("3. Imprimir Lista");
            System.out.println("4. Número Mayor");
            System.out.println("5. Número Menor");
            System.out.println("6. Promedio");
            System.out.println("7. Salir");
            System.out.print("Seleccione: "); 
            int menu = Integer.parseInt(l.nextLine());
            System.out.println();

            switch (menu) {
                case 1:
                centinela = true;
                System.out.println("Agregue los números (Para salir ingrese 00)");
                while(centinela){
                    int numero = Integer.parseInt(l.nextLine());
                    if(numero==00){
                        System.out.println("Saliendo...");
                        System.out.println();
                        centinela = false;
                    }else{
                        lista.add(numero);
                    }
                }
                    break;

                    case 2:
                    try {
                        lista.clear();
                        System.out.println("Limpiando la lista...");
                        if(lista.isEmpty()){
                            System.out.println("Se ha limpiado correctamente");
                            System.out.println();
                        }
                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e.getMessage());
                        System.out.println();
                    }
                    break;

                    case 3:
                    System.out.println("Lista de números: ");
                    if(lista.isEmpty()){
                        System.out.println("La lista está vacía, primero añada números");
                    }else{
                        for(int i : lista){
                            System.out.println("- " + i);
                        }
                    }
                    
                    System.out.println();
                    break;

                    case 4:
                    if(lista.isEmpty()){
                        System.out.println("La lista está vacía, primero añada números");
                    }else{
                        int mayor = lista.get(0);
                        for(int i=0; i<lista.size(); i++){
                            if(mayor<lista.get(i)){
                                mayor = lista.get(i);
                            }
                        }
                        System.out.println("El número mayor es: " + mayor);
                        System.out.println("");
                    }
                    break;

                    case 5:
                    if(lista.isEmpty()){
                        System.out.println("La lista está vacía, primero añada números");
                    }else{
                        int menor = lista.get(0);
                        for(int i=0; i<lista.size(); i++){
                            if(menor>lista.get(i)){
                                menor = lista.get(i);
                            }
                        }
                        System.out.println("El número menor es: " + menor);
                        System.out.println("");
                    }
                    break;

                    case 6:
                    if(lista.isEmpty()){
                        System.out.println("La lista está vacía, primero añada números");
                    }else{
                        int promedio = 0;
                        for(int i=0; i<lista.size(); i++){
                            promedio += lista.get(i);
                        }
                        promedio = promedio/lista.size();
                        System.out.println("El promedio es: " + promedio);
                        System.out.println("");
                    }
                    break;

                    case 7:
                    System.out.println("Chao hp");
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
