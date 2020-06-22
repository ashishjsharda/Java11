import java.util.ArrayList;
import java.util.List;

/**
 * Stack in Java
 * @author ashish
 */
public class Stack {

    List<Integer> list=new ArrayList<Integer>();

    /**
     * Push an item into stack
     * @param num
     */
    public void push(int num)
    {
        list.add(num);
    }

    /**
     * Pop an item from stack
     * @return int
     */
    public int pop()
    {
        if(list.size()==0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return list.remove(list.size()-1);
    }
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
