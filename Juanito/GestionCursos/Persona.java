package Juanito.GestionCursos;

public class Persona {
    private long id;
    private String nombre;
    private int edad;
    public Persona (String nombre, int edad, long id){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public long getId(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setId(long id){
        this.id = id;
    }
}
