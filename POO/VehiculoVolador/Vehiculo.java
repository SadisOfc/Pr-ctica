package VehiculoVolador;

public class Vehiculo {
    private String modelo;
    private String nombre;
    public Vehiculo(String modelo, String nombre){
        this.modelo = modelo;
        this.nombre = nombre;
    }
    public String getModelo(){
        return modelo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
