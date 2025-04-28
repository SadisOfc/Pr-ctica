package Juanito.GestionCursos;

public class Estudiante extends Docente {
    public Estudiante (String nombre, int edad, long id, String curso){
        super(nombre, edad, id,curso);
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
        return super.getCurso();
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
       super.setCurso(curso);
    }
}
