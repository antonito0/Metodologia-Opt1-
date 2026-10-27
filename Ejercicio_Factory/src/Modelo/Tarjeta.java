package Modelo;

public class Tarjeta implements MetodoPago{

    @Override 
    public void realizarPago(){
        System.out.println("Pagado con tarjeta");
    }

}
