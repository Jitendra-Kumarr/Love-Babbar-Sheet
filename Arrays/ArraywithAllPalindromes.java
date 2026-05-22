import java.util.Scanner;

public class ArraywithAllPalindromes {

    public static boolean isPalinArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            int reversed = 0; 
            int original = arr[i]; 
            int temp = arr[i]; 

            while( temp != 0){
                int lastDigit = temp%10; 
                reversed = reversed * 10 + lastDigit; 
                temp /= 10; 
            }

            if(original != reversed){
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalinArray(arr));

        sc.close();
    }
}