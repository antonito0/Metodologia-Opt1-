package Main;
import Modelo.*;

public class Ej2 {
    public static void main(String[] args) throws Exception {

        OperacionSuma suma = (a, b, c) -> a+b+c;

        System.out.println(suma.calcular(1, 5, 3));
    }
}
