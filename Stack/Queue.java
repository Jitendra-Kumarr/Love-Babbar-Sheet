public class Queue {
    int arr[]; 
    int front; 
    int rear; 
    int size; 

    Queue(int size){
        this.size = size; 
        arr = new int[size]; 
        front = 0; 
        rear = 0; 
    }

    boolean isEmpty(){
        return front == rear;
    }

    void enqueue(int x){
        if(rear == size){
            return; 
        }
        arr[rear] = x; 
        rear = rear+1; 
    }

    int dequeue(){
        if(isEmpty()){
            return -1; 
        }
        int val = arr[front]; 
        front = front + 1; 
        return val; 
    }

    int peek(){
        if(isEmpty()){
            return -1; 
        }
        return arr[front]; 
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5); 

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: "    + queue.peek());      // 10
        System.out.println("Dequeue: " + queue.dequeue());   // 10
        System.out.println("Peek: "    + queue.peek());      // 20
    }
}
