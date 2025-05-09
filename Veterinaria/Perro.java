package Veterinaria;

public class Perro extends Animal {
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println("Wau");
    }
}
