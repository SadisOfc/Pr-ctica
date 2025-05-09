package Juanito.Notitas;

import java.time.LocalDateTime;

public class nota {
    private String titulo;
    private int id;
    private String texto;
    private LocalDateTime fecha;

    public nota(String titulo, String texto, LocalDateTime fecha, int id){
        this.texto = texto;
        this.fecha = fecha;
        this.titulo = titulo;
        this.id = id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getTexto(){
        return texto;
    }
    public LocalDateTime getFecha(){
        return fecha; 
    }
    public int getId(){
        return id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
}
