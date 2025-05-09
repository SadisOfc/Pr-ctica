package Juanito.Notitas;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class GestionNotas {
    List<nota> notas = new ArrayList<>();

    public void leerNota(int id){
        boolean c = false;
        try {
            for(int i=0; i<notas.size();i++){
                nota notitaa = notas.get(i);
                if(id==notitaa.getId()){
                    System.out.println(notitaa.getId());
                    System.out.println(notitaa.getTitulo());
                    System.out.println(notitaa.getTexto());
                    System.out.println(notitaa.getFecha());
                    c = true;
                }
            }
            if(!c){
                System.out.println("Id Inválido");
            }
        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
    }

    public void actualizarNota(int id,LocalDateTime fecha, String titulo, String texto){
        boolean c = false;
        for(int i=0; i<notas.size();i++){
                nota notitaa = notas.get(i);
                if(id==notitaa.getId()){
                    notitaa.setFecha(fecha);
                    notitaa.setTexto(texto);
                    notitaa.setTitulo(titulo);
                    notas.set(i, notitaa);
                    System.out.println("El cambio se realizó con éxito");
                    c = true;
                }
            }
            if(!c){
                System.out.println("Id Inválido");
            }
    }
    public void eliminarNota(int id){
        boolean c = false;
        for(int i=0; i<notas.size();i++){
                nota notitaa = notas.get(i);
                if(id==notitaa.getId()){
                    notas.remove(i);
                    System.out.println("Se eliminó la nota");
                    c = true;
                }
            }
            if(!c){
                System.out.println("Id Inválido");
            }
    }

    public void crearNota(String title, String text, LocalDateTime date){
        try {
            int id = notas.size() + 1;
            nota nota = new nota(title, text, date, id);
            notas.add(nota);    
            System.out.println("Se creó correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
        
    }
}
