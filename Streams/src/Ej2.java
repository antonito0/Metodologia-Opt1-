import java.util.Arrays;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) throws Exception {
    List<Integer> numeros =
        Arrays.asList(1,2,3,4,5,6);

    numeros.stream()
            .filter(n -> n % 2 == 1)
            .filter(n -> n > 4)
            .forEach(System.out::println);
    }
}
