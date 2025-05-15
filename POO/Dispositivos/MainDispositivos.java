package Dispositivos;

public class MainDispositivos {
    public static void main(String[] args) {
        Gestion g = new Gestion();
        Dispositivo discoDuro = new DiscoDuro("Seagate 1TB", "Almacenamiento");
        Dispositivo impresora = new Impresora("HP LaserJet", "Impresión");
        Dispositivo monitor = new Monitor("Samsung 24", "Visualización");
        Dispositivo discoDuro2 = new DiscoDuro("Saramambiche", "Almacenamiento");
        Dispositivo impresora2 = new Impresora("igüeputat", "Impresión");
        Dispositivo monitor2 = new Monitor("olamami", "Visualización");
        
        g.crearConexion(discoDuro2);
        g.crearConexion(discoDuro);
        g.crearConexion(impresora);
        g.crearConexion(impresora2);
        g.crearConexion(monitor);
        g.crearConexion(monitor2);
        g.imprimirConexion();
    }
}
