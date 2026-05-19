import java.util.Scanner;
import java.util.Arrays;

public class MinimizeTheHeight {
    public static int getMinDiff(int[] arr, int k){
        int n = arr.length; 
        Arrays.sort(arr);

        int minDiff = arr[n-1] - arr[0];

        for(int i=0; i<n-1; i++){
            if(arr[i+1]-k < 0) continue; 

            int currMin = Math.min(arr[0]+k, arr[i+1]-k); 
            int currMax = Math.max(arr[i]+k, arr[n-1]-k); 

            minDiff = Math.min(minDiff, currMax - currMin); 
        }
        return minDiff; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(getMinDiff(arr, 2));
    }
}
