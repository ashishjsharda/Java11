import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *Example using Streams [Starts with]
 * @author ashish
 */
public class StreamElement {
    public static void main(String[] args) {

        List<String> users = new ArrayList<String>();
        users.add("Tony");
        users.add("Sachin");
        users.add("Maxwell");
        users.add("Wilson");
        Optional<String> max=users.stream().max(String::compareToIgnoreCase);
        System.out.println(max);
    }
}
