package Veterinaria;

public class Gato extends Animal {
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    void hacerSonido(){
        System.out.println("Miau hp");
    }
}
