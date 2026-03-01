// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Stack;

public class MinStack {
   private Stack<Integer> stack = new Stack();
   private Stack<Integer> minStack = new Stack();

   public MinStack() {
   }

   public void push(int var1) {
      this.stack.push(var1);
      if (this.minStack.isEmpty() || var1 <= (Integer)this.minStack.peek()) {
         this.minStack.push(var1);
      }

   }

   public void pop() {
      if (((Integer)this.stack.peek()).equals(this.minStack.peek())) {
         this.minStack.pop();
      }

      this.stack.pop();
   }

   public int top() {
      return (Integer)this.stack.peek();
   }

   public int getMin() {
      return (Integer)this.minStack.peek();
   }

   public static void main(String[] var0) {
      MinStack var1 = new MinStack();
      var1.push(-2);
      var1.push(0);
      var1.push(-3);
      System.out.println(var1.getMin());
      var1.pop();
      System.out.println(var1.top());
      System.out.println(var1.getMin());
   }
}
// Time Complexity = O(n)
// Space Complexity = O(n)
/* Output:
-3
 0
-2 */
