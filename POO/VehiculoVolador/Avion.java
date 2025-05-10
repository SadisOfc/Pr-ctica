package VehiculoVolador;

public class Avion extends Vehiculo implements Volar {
    private String tipo;
    public Avion(String nombre, String tipo, String modelo){
        super(modelo, nombre);
        this.tipo = tipo;
    }
    @Override
    public void volar() {
        System.out.println("Un avión volando");
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
