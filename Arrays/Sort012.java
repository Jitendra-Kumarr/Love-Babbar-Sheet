// package Arrays;

import java.util.Scanner;

public class Sort012 {
    public static int[] sort012(int arr[]){
        int countZeroes = 0; 
        int countOnes = 0; 
        int countTwos = 0; 

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                countZeroes++; 
            } else if (arr[i] == 1){
                countOnes++; 
            } else {
                countTwos++; 
            }
        }

        for(int i=0; i<countZeroes; i++){
            arr[i] = 0; 
        }

        for(int i=countZeroes; i<countZeroes+countOnes; i++){
            arr[i] = 1; 
        }

        for(int i=countZeroes+countOnes; i<arr.length; i++){
            arr[i] = 2;
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

        int result[] = sort012(arr); 

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
