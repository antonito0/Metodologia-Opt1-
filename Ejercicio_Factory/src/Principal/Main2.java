import Modelo.MetodoPago;
import Modelo.MetodoPagoFactory;

public class Main2 {
    public static void main(String[] args){

        MetodoPago pago1 = MetodoPagoFactory.pagar("tarjeta");
        MetodoPago pago2 = MetodoPagoFactory.pagar("paypal");

        pago1.realizarPago();
        pago2.realizarPago();
    }
}
