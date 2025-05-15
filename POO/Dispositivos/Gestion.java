package Dispositivos;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    List<Dispositivo> ListaDispositivos = new ArrayList<>();

    public void crearConexion(Dispositivo dispo){
        try {
            ListaDispositivos.add(dispo);
            System.out.println("Se agregó el Dispositivo Correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    public void imprimirConexion(){
        try {
            if(ListaDispositivos.isEmpty()){
                System.out.println("No hay dispositivos conectados");
            }else{
                System.out.println("Dispositivos Conectados:");
                for(Dispositivo i : ListaDispositivos){
                i.ConectarDispositivo();
                System.out.println(i.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
