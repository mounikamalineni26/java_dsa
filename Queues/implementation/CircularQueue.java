public class CircularQueue {
    int[] arr;
    int front, rear, size;
    public CircularQueue(int k){
        size = k;
        arr = new int[k];
        front = rear = -1;
    }
    public boolean enqueue(int value){
        if(isFull()) return false;
        if(front==-1) front = 0;
        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public boolean dequeue(){
        if(isEmpty()) return false;
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % size;
        }
        return true;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public int Front(){
        if(isEmpty()) return -1;
        return arr[front];
    }  
    public int Rear(){
        if(isEmpty()) return -1;
        return arr[rear];
    } 
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq.Front()); // Output: 1
        System.out.println(cq.Rear());  // Output: 5
        cq.dequeue();
        System.out.println(cq.Front()); // Output: 2
    }

}


