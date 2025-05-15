package Dispositivos;

public class Monitor extends Dispositivo{
    public Monitor(String nombre, String tipo){
        super(nombre,tipo);
    }

    @Override
    public void ConectarDispositivo() {
        System.out.println("Monitor" + getNombre() + " Conectado");
    }
}
