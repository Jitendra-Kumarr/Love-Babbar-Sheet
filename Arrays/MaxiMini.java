// package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxiMini {

    public static ArrayList<Integer> getMinMax(int[] arr){

        ArrayList<Integer> result = new ArrayList<>(); 

        int MiniMum = Integer.MAX_VALUE; 
        int MaxiMum = Integer.MIN_VALUE; 

        for(int i=0; i<arr.length; i++){

            if(arr[i] < MiniMum){
                MiniMum = arr[i]; 
            }

            if(arr[i] > MaxiMum){
                MaxiMum = arr[i]; 
            }
        }

        result.add(MiniMum); 
        result.add(MaxiMum); 

        return result; 
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        ArrayList<Integer> Answer = getMinMax(arr); 

        for(int i=0; i<Answer.size(); i++){
            System.out.print(Answer.get(i) + " ");
        }

        sc.close();
    }
}
// Maximum And Minimum In An Array
