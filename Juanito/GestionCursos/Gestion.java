package Juanito.GestionCursos;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    List<Estudiante> estudiantesLista = new ArrayList<>();
    List <Aula> aulasLista = new ArrayList<>();
    List <Docente> docentesListas = new ArrayList<>();
    
    public Estudiante buscarEstudiante(long id){
        for(Estudiante i : estudiantesLista){
            if(id==i.getId()){
                return i;
            }
        }
        return null;
    }
    public void crearEstudiante(Estudiante estudiante){
        estudiantesLista.add(estudiante);
        System.out.println("Se ha creado el Registro");
    }
    public void imprimirEstudiantes(){
        System.out.println("Lista de Estudiantes");
        int contador = 1;
        for(Estudiante i: estudiantesLista){
            System.out.println(contador + ". " + i.getNombre() + " " + i.getEdad()+ " " + i.getCurso()+ " " + i.getId());
            contador++;
        }
        System.out.println();
    }
    public void eliminarEstudiante(int id){
        Estudiante estudiante = buscarEstudiante(id);
        if(estudiante!=null){
            estudiantesLista.remove(estudiante);
            System.out.println("Se eliminó correctamente.");
            System.out.println();
        }else{
            System.out.println("No se encontró ese registro.");
        }
    }
    public void actualizarEstudiante(String nombre, int edad, long id, String curso){
        Estudiante estudiante = buscarEstudiante(id);
        if(estudiante !=null){
            estudiante.setCurso(curso);
            estudiante.setId(id);
            estudiante.setEdad(edad);
            estudiante.setNombre(nombre);
            System.out.println();
        }else{
            System.out.println("NO se encontró ese registro.");
        }
    }
    public void imprimirEstudianteSolito(long id){
        Estudiante e = buscarEstudiante(id);
        if(e !=null){
            System.out.println("Estudiante:");
            System.out.println(e.getNombre() + " " + e.getEdad()+ " " + e.getCurso()+ " " + e.getId());
            System.out.println();
        }
    }

    public Aula buscarAula(String nombre){
        for(Aula i : aulasLista){
            if(nombre.equals(i.getNombreAula())){
                return i;
            }
        }
        return null;
    }
    public void crearAula(Aula aula){
        aulasLista.add(aula);
        System.out.println("Se ha creado el Registro");
    }

    public void imprimirAulas(){
        System.out.println("AULAS");
        int contador = 1;
        for(Aula i: aulasLista){
            System.out.println(contador+ ". "+ i.getNombreAula()+ " " + i.getMateria());
        }
        System.out.println();
    }
    public void imprimirAulaSolita(String nombre){
        Aula aula = buscarAula(nombre);
        if(aula!=null){
            System.out.println(aula.getNombreAula() + " - " + aula.getMateria());
            for(Docente i : docentesListas){
                if(i.getCurso()==aula.getCurso()){
                    System.out.println("Docente: " + i.getNombre());
                }
            }
            System.out.println();
            int contador = 1;
            for(Estudiante i : estudiantesLista){
                if(i.getCurso()==aula.getCurso()){
                    System.out.println(contador + ". " + i.getNombre() + " - " + i.getId());
                }
            }
        }
    }
    public void eliminarAula(String nombre){
        Aula aula = buscarAula(nombre);
        if(aula!=null){
            aulasLista.remove(aula);
            System.out.println("Se ha eliminado correctamente");
        }else{
            System.out.println("No se encontró el aula");
        }
    }
    public void actualizarAula(String nombre, String materia, String curso){
        Aula aula = buscarAula(nombre);
        if(aula !=null){
            aula.setMateria(materia);
            aula.setCurso(curso);
            System.out.println("Se actualizó correctamente");
        }else{
            System.out.println("No se encontró el aula");
        }
    }

    public Docente buscarDocente(long id){
        for(Docente i : docentesListas){
            if(id==i.getId()){
                return i;
            }
        }
        return null;
    }
    public void crearDocente(Docente docente){
        docentesListas.add(docente);
    }
    public void imprimirDocentes(){
        int contador = 1;
        System.out.println("Docentes");
        for(Docente i: docentesListas){
            System.out.println(contador + ". " + i.getNombre() + " - " +i.getCurso() + " - "+ i.getId());
        }
        System.out.println("");
    }
    public void eliminarDocente(long id){
        Docente docente = buscarDocente(id);
        if(docente!=null){
            docentesListas.remove(docente);
            System.out.println("Se eliminó correctamente");
        }else{
            System.out.println("No se encontró ese docente");
        }
    }
    public void actualizarDocente(long id, String nombre, int edad, String curso){
        Docente docente = buscarDocente(id);
        if(docente!=null){
            docente.setCurso(curso);
            docente.setEdad(edad);
            docente.setId(id);
            docente.setNombre(nombre);
        }
    }
    public void buscarDocenteSolito(long id){
        Docente docente  = buscarDocente(id);
        if(docente!=null){
            System.out.println(docente.getNombre() + " - " + docente.getCurso() + " - " + docente.getId());
        }
    }
    
}
