import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {

    public static int smallestSubWithSum(int x, int[] arr){
        int minLength = Integer.MAX_VALUE; 

        for(int i=0; i<arr.length; i++){
            int sum = 0; 
            for(int j=i; j<arr.length; j++){
                sum += arr[j]; 

                if(sum > x){
                    minLength = Math.min(minLength, j-i+1); 
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); 

        System.out.println(smallestSubWithSum(x, arr));

        
        sc.close();
    }
}
