import java.util.Scanner;

public class KadaneAlgo {
    public static int maxSubarraySum(int[] arr){
        int MaxiMum = Integer.MIN_VALUE; 
        int sum = 0; 

        for(int i=0; i<arr.length; i++){
            sum += arr[i]; 

            if(sum > MaxiMum){
                MaxiMum = sum; 
            }

            if(sum < 0){
                sum = 0; 
            }
        }
        return MaxiMum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(maxSubarraySum(arr));

        sc.close();
    }
}
