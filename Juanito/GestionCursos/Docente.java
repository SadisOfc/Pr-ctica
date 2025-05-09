package Juanito.GestionCursos;

public class Docente extends Persona {
    private String curso;
    public Docente(String nombre, int edad, long id, String curso){
        super(nombre, edad, id);
        this.curso = curso;
    }

    public String getNombre(){
        return super.getNombre();
    }
    public int getEdad(){
        return super.getEdad();
    }
    public long getId(){
        return super.getId();
    }
    public String getCurso(){
        return curso;
    }

    //
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    public void setEdad(int edad){
        super.setEdad(edad);
    }
    public void setId(long id){
        super.setId(id);
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

}
