import java.util.Stack;
public class QueueUsingStack{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public QueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enqueue(int x){
        s1.push(x);
    }
    public int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if(s2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return s2.pop();
    }
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if(s2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return s2.peek();

    }
    public static void main(String[] args){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek());    // Output: 2
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.isEmpty()); // Output: true
    }

}
