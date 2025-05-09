package POO.Veterinaria;

public class Vaca extends Animal {
    public Vaca(String nombre){
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println("Mu");
    }
}
