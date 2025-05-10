package SistemaDePagos;

public class PagoTarjeta implements Pago {

    @Override
    public void realizarPago() {
        System.out.println("El pago se realizó con Tarjeta de Crédito");
    }
    @Override
    public void tipoDePago() {
        System.out.println("Tipo de Pago: Tarjeta");
    }
}
