import java.util.Arrays;
import java.util.List;

public class Ej5 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros =
        Arrays.asList(1,2,3,4,5,6);

        numeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n *2)
                .forEach(System.out::println);

        //Este no saca nada por pantalla por que moltiplica el valor por 2 antes de el filter asi quue nunca pasa un valor impar
        numeros.stream()
            .map(n -> n *2)
            .filter(n -> n % 2 == 1)
            .forEach(System.out::println);
    }
}
