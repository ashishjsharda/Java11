import java.util.ArrayList;
import java.util.List;

public class Queues {

    List<Integer> list=new ArrayList<Integer>();
    public void enqueue(int num)
    {
        list.add(num);
    }
    public int dequeue()
    {

        if (list.size()==0)
        {
            System.out.println("Queue is Empty");
            return 0;

        }
        return list.remove(0);
    }
    public static void main(String[] args) {
        Queues queues=new Queues();
        System.out.println(queues.dequeue());
        queues.enqueue(10);
        queues.enqueue(20);
        System.out.println(queues.dequeue());
    }
}
