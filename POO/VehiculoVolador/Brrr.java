package VehiculoVolador;

public class Brrr {
    public static void main(String[] args) {
        System.out.println("Cosas Voladoras");
        Avion avioncito = new Avion("Trapimosa", "AR15", "Beatriz");
        Volar pajaro = new Pajaro();
        Volar droncito = new Dron();

        System.out.println("El avioncito " + avioncito.getNombre() + " es un tipo " + avioncito.getTipo() + " del modelo " + avioncito.getModelo());
        System.out.println();
        pajaro.volar();
        droncito.volar();
    }
}
