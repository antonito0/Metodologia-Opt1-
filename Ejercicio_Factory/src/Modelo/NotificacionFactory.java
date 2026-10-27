package Modelo;

public class NotificacionFactory {

    public static Notificacion crear(String tipo){
        
        if (tipo.equals("email")){
            return new Email();
        } else if (tipo.equals("sms")){
            return new SMS();
        }
        
        return null;
    }
}
