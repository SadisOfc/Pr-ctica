package SistemaDePagos;

public class PagoEfectivo implements Pago {

    @Override
    public void tipoDePago() {
        System.out.println("Tipo de Pago: Efectivo");
    }

    @Override
    public void realizarPago() {
        System.out.println("El pago se realizó con Efectivo");
    }
}
