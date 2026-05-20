// package Arrays;

import java.util.Scanner;

public class MoveNegToBeg {
    public static int[] MoveNeg(int arr[]){

        int j=0; 
        for(int i=1; i<arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                j++; 
            }
        }
        return arr; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        int result[] = MoveNeg(arr); 

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
// Move all negatives to beginning
