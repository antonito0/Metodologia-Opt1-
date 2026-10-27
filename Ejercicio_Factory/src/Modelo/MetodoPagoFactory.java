package Modelo;

public class MetodoPagoFactory {

    public static MetodoPago pagar(String tipo){

        if (tipo.equals("tarjeta")){
            return new Tarjeta();
        } else if (tipo.equals("paypal")){
            return new PayPal();
        }
        
        return null;
    }

}
