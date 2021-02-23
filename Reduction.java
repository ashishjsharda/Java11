import java.util.List;

/**
 *Add all numbers of list using Streams
 * @author ashish
 */
public class Reduction {
    public static void main(String[] args) {

        List<Integer> list=List.of(10,20,15,29);
        Integer add=list.stream().reduce((x,y)->x+y).get();
        System.out.println("Addition of all the nums is "+add);

    }
}
