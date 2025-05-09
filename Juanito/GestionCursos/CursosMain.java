package Juanito.GestionCursos;

public class CursosMain {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();

        Estudiante e1 = new Estudiante("Juan", 20, 1, "Matematicas");
        Estudiante e2 = new Estudiante("Ana", 22, 2, "Fisica");
        Estudiante e3 = new Estudiante("Bellako", 77, 9999, "Baretología");
        gestion.crearEstudiante(e1);
        gestion.crearEstudiante(e2);
        gestion.crearEstudiante(e3);

        Docente d1 = new Docente("Profe Maria", 35, 1001, "Matematicas");
        Docente d2 = new Docente("Profe Pedro", 40, 1002, "Fisica");
        gestion.crearDocente(d1);
        gestion.crearDocente(d2);

        Aula a1 = new Aula("Aula 101", "Algebra", "Matematicas");
        Aula a2 = new Aula("Aula 102", "Mecánica", "Fisica");
        gestion.crearAula(a1);
        gestion.crearAula(a2);

        System.out.println("\n=== Listado General ===\n");
        gestion.imprimirEstudiantes();
        gestion.imprimirDocentes();
        gestion.imprimirAulas();

        System.out.println("\n=== Información detallada de Aula 101 ===\n");
        gestion.imprimirAulaSolita("Aula 101");

        System.out.println("\n=== Actualizar Estudiante Juan ===\n");
        gestion.actualizarEstudiante("Juanito", 21, 1, "Fisica");
        gestion.imprimirEstudianteSolito(1);

        System.out.println("\n=== Eliminar Docente ===\n");
        gestion.eliminarDocente(1002);
        gestion.imprimirDocentes();
    }
}