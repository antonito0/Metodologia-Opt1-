package Main;
import Modelo.Operacion;

public class Ej3 {
    public static void main(String[] args) throws Exception {
        Operacion suma = (a,b) -> a+b;
        System.out.println(suma.calcular(10, 4));
        Operacion resta = (a,b) -> a-b;
        System.out.println(resta.calcular(10, 4));
        Operacion multiplicacion = (a,b) -> a*b;
        System.out.println(multiplicacion.calcular(10, 4));
    }    
}
