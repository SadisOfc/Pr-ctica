package Dispositivos;

public class Dispositivo implements Conectar{
    private String nombre;
    private String tipo;

    public Dispositivo(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void ConectarDispositivo() {
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
