public class ParenthesisChecker {
    int arr[]; 
    int top; 
    int size; 

    ParenthesisChecker(int size){
        this.size = size; 
        arr = new int[size]; 
        top = -1;
    }

    void push(int x){
        if(top == size-1){
            return; 
        }
        top = top+1; 
        arr[top] = x; 
    }

    int pop(){
        if(top == -1){
            return -1; 
        }
        int val = arr[top]; 
        top = top-1; 
        return val; 
    }

    boolean isEmpty(){
        return top == -1; 
    }

    public boolean isBalanced(String s){

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                push(ch); 
            } else {
                if(isEmpty()){
                    return false; 
                }

                char top = (char) pop(); 
                if(ch == ')' && top != '(' ||
                   ch == '}' && top != '{' || 
                   ch == ']' && top != '[' ) return false; 
            }
        }
        return isEmpty(); 
    }



    public static void main(String[] args) {
        ParenthesisChecker checker = new ParenthesisChecker(50); 


        System.out.println(checker.isBalanced("(){}[]"));   // true
        System.out.println(checker.isBalanced("({[]})"));   // true
        System.out.println(checker.isBalanced("({[}])"));   // false
        System.out.println(checker.isBalanced("((()"));     // false
        System.out.println(checker.isBalanced(""));         // true

    }
    
}
