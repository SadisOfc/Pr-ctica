package SistemaDePagos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pagos realizados:");
        Pago tarjeta = new PagoTarjeta();
        Pago efectivo = new PagoEfectivo();

        tarjeta.realizarPago();
        tarjeta.tipoDePago();
        System.out.println();
        efectivo.realizarPago();
        efectivo.tipoDePago();
    }
}
