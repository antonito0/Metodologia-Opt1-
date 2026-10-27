package Modelo;

public class PayPal implements MetodoPago{

    @Override
    public void realizarPago() {
        System.out.println("Pagado con PayPal");
    }

}
