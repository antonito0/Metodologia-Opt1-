import java.util.Arrays;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) throws Exception {
    List<String> nombres =
        Arrays.asList(
                "Ana",
                "Luis",
                "Pedro");


    nombres.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}