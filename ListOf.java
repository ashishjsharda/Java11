import java.util.List;

/**
 * List.of Java 11
 *
 * @author ashish
 */
public class ListOf {
    public static void main(String[] args) {

        var list = List.of("Sai", "Ram");
        var copy = List.copyOf(list);
        System.out.println(list == copy);
    }
}
