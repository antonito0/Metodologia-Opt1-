package Modelo;

public class Email implements Notificacion{

    @Override
    public void enviar() {
        System.out.println("Enviado Email");
    }

}
