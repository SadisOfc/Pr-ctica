import java.util.Scanner;
public class Culicagao {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor, digite su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ahora escriba su edad");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("En que ciudad vive?");
        String ciudad = scanner.nextLine();

        System.out.println("Cual es su materia favorita?");
        String materia = scanner.nextLine();
        
        System.out.println("Cual es su nota en esa materia?");
        int nota = scanner.nextInt();

        if (nota<0 || nota>5) {
        System.out.println("Su calificacion no es valida");
        scanner.close();
        return;
        }

        if (nota<3) {
        System.out.println("Usted se tiro la materia pelao");

        } else {
        System.out.println("usted es un duro pelao, paso la materia");

        }

        System.out.println("Su nombre es " + nombre + ", tiene " + edad + " años, vive en la ciudad de: " + ciudad + ", su materia favorita es " + materia + " y su nota es de " + nota);

        scanner.close();
    }
}

