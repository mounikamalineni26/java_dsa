import java.util.Stack;
public class MaxStack{
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    public MaxStack(){
        stack = new Stack<>();
        maxStack = new Stack<>();

    }
    public void push(int x){
        stack.push(x);
        if(maxStack.isEmpty() || x >= maxStack.peek()){
            maxStack.push(x);
        }
    }
    public void pop(){
        if(stack.peek().equals(maxStack.peek())){
            maxStack.pop();
        }
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMax() {
        return maxStack.peek();
    }
    public static void main(String[] args){
        MaxStack maxStack = new MaxStack();
        maxStack.push(98);
        maxStack.push(89);
        maxStack.push(67);
        System.out.println(maxStack.getMax()); // Returns 98
        maxStack.pop();
        System.out.println(maxStack.top());    // Returns 89
        System.out.println(maxStack.getMax()); // Returns 98
    }

}

// Time Complexity = O(1)
// Space Complexity = O(n)
