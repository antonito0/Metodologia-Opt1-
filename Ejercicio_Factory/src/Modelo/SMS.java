package Modelo;

public class SMS implements Notificacion{

    @Override
    public void enviar() {
        System.out.println("Enviado SMS");
    }

}
