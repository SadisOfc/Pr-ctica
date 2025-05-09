package Juanito.GestionCursos;

public class Aula {
    private String nombreAula;
    private String materia;
    private String curso;
    public Aula(String nombreAula, String materia, String curso){
        this.nombreAula = nombreAula;
        this.materia = materia;
        this.curso = curso;
    }
    public String getNombreAula(){
        return nombreAula;
    }
    public String getMateria(){
        return materia;
    }
    public String getCurso(){
        return curso;
    }
    public void setNombreAula(String nombreAula){
        this.nombreAula = nombreAula;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
