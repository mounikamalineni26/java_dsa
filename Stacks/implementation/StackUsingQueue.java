import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue{
    private Queue<Integer> q;
    public StackUsingQueue() {
        q = new LinkedList<>();
    }
    public void push(int x){
        q.add(x);
        int size = q.size();
        for(int i=1;i<size;i++){
            q.add(q.remove());
        }


    }
    public int pop(){
        return q.remove();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
    public static void main(String[] args){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());

    }

}

/* Output:
30
30
20 */
