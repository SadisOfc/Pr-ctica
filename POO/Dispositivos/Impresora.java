package Dispositivos;

public class Impresora extends Dispositivo{
    public Impresora(String nombre, String tipo){
        super(nombre, tipo);
    }

    @Override
    public void ConectarDispositivo() {
        System.out.println("Impresora" + getNombre() + " Conectada");
    }

}
