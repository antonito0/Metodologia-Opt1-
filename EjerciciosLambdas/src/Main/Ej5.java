package Main;

import java.util.function.Predicate;

public class Ej5 {
    public static void main(String[] args) throws Exception {
        Predicate<Integer> mayor = (a) -> a>100;

        System.out.println(mayor.test(101));
        System.out.println(mayor.test(99));
    }
}
