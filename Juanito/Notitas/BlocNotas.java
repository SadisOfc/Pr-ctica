package Juanito.Notitas;


import java.time.LocalDateTime;
import java.util.Scanner;

public class BlocNotas {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        GestionNotas gestion = new GestionNotas();
        System.out.println("Bloc de notas, todo insano");
        while(true){
            System.out.println("Menú: ");
            System.out.println("1. Crear Nota");
            System.out.println("2. Leer Notas");
            System.out.println("3. Actualizar Notas");
            System.out.println("4. Eliminar Notas");
            System.out.println("5. Eliminar toa esa lista de notas");
            System.out.println("6. Salir");
            int m = Integer.parseInt(l.nextLine());
            System.out.println();

            switch (m) {
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = l.nextLine();
                    System.out.println("Texto: ");
                    String texto = l.nextLine();
                    LocalDateTime fecha = LocalDateTime.now();
                    gestion.crearNota(titulo, texto, fecha);
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println("Lista de Notas:");
                    for(nota o : gestion.notas){
                        System.out.println("- " + o.getTitulo() + " - Id: " + o.getId());
                    }
                    System.out.println();
                    System.out.println("Digite un id");
                    int id = Integer.parseInt(l.nextLine());
                    gestion.leerNota(id);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Lista de Notas:");
                    for(nota o : gestion.notas){
                    System.out.println("- " + o.getTitulo() + " - Id: " + o.getId());
                }
                    System.out.println();
                    System.out.println("Digite un id");
                    id = Integer.parseInt(l.nextLine());
                    System.out.println("Nuevo Titulo: ");
                    titulo = l.nextLine();
                    System.out.println("Nuevo Texto: ");
                    texto = l.nextLine();
                    fecha = LocalDateTime.now();
                    gestion.actualizarNota(id, fecha, titulo, texto);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Lista de Notas:");
                    for(nota o : gestion.notas){
                    System.out.println("- " + o.getTitulo() + " - Id: " + o.getId());
                }
                    System.out.println();
                    System.out.println("Digite un id");
                    id = Integer.parseInt(l.nextLine());
                    gestion.eliminarNota(id);
                    break;
                    
                case 5:
                    gestion.notas.clear();
                    System.out.println("Se eliminó toa esa vaina");
                    break;
                    
                case 6:
                    l.close();
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
