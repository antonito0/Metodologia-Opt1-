package Main;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ej6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Unai");
        nombres.add("Galder");
        nombres.add("Irene");
        nombres.add("Jon");
        nombres.add("Rebeca");

        Predicate<String> mas4 = (nom) -> nom.length()>4;
        Consumer<String> mayus = (nom) -> System.out.println(nom.toUpperCase());

        for (String n : nombres) {
            if (mas4.test(n)) {
                mayus.accept(n);
            }   
        }
    }
}
