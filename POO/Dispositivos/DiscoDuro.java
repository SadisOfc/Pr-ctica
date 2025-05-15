package Dispositivos;

public class DiscoDuro extends Dispositivo {
    public DiscoDuro(String nombre, String tipo){
        super(nombre, tipo);
    }

    @Override
    public void ConectarDispositivo() {
       System.out.println("Disco Duro" + getNombre() + " Conectado");
    }
}
