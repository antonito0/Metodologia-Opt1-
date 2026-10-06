package Main;

import Modelo.Operacion;

public class Ej4 {
    public static void main(String[] args) throws Exception {
        Operacion suma = (a,b) -> a+b;
        System.out.println(suma.calcular(10, 4));
        Operacion resta = (a,b) -> a-b;
        System.out.println(resta.calcular(10, 4));
        Operacion multiplicacion = (a,b) -> a*b;
        System.out.println(multiplicacion.calcular(10, 4));

        operar(10, 4, suma);
        operar(10, 4, multiplicacion);
    }   

    static int operar(int a, int b, Operacion operacion) {
        System.out.println(operacion.calcular(a, b));
        return 0;
    }
}
