import java.util.List;

/**
 * Using Vars
 * @author ashish
 */
public class UsingVars {
    public static void main(String[] args) {
        var a="This is Ashish";
        System.out.println(a);
        var list= List.of("A","B","C");
        var copy=List.of(list);
        System.out.println(copy);
    }
}
