import java.util.Arrays;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) throws Exception {
        List<String> nombres =
        Arrays.asList(
                "Jon",
                "Unai",
                "Irene",
                "Ana",
                "Galder");

        nombres.stream()
                .filter(n -> n.length()>4)
                .forEach(System.out::println);
    }
}
