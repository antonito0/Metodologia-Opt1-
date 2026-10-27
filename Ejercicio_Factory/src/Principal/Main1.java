import Modelo.Notificacion;
import Modelo.NotificacionFactory;

public class Main1 {
    public static void main(String[] args){

        Notificacion notificacion = NotificacionFactory.crear("sms");

        notificacion.enviar();

    }
}
