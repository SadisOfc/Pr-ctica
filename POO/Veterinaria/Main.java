package Veterinaria;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Juan carlos");
        Animal vaquita = new Vaca("Lolita");
        Animal gatico = new Gato("Mao");

        perro.hacerSonido();
        vaquita.hacerSonido();
        gatico.hacerSonido();
    }
}
