public class twoStack {
    int arr[] = new int[100]; 
    int top1, top2; 

    public twoStack(){
        top1 = -1; 
        top2 = arr.length; 
    }

    void push1(int x){
        if(top1 < top2-1){
            top1 = top1 + 1; 
            arr[top1] = x; 
        }
    }

    void push2(int x){
        if(top1 < top2-1){
            top2 = top2-1; 
            arr[top2] = x; 
        }
    }

    int pop1(){
        if(top1 == -1){
            return -1; 
        }
        int val = arr[top1]; 
        top1 = top1 - 1; 
        return val; 
    }

    int pop2(){
        if(top2 == arr.length){
            return -1; 
        }
        int val = arr[top2]; 
        top2 = top2 + 1; 
        return val; 
    }


    public static void main(String[] args) {
        twoStack stack = new twoStack();

        stack.push1(10);
        stack.push2(20);
        stack.push1(30);
        
        System.out.println("Pop from stack2: " + stack.pop2()); // 20
        System.out.println("Pop from stack1: " + stack.pop1()); // 30

    }
}
