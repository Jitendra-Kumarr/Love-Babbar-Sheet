import java.util.Scanner;

public class MinimumJumps {
    public static int minJumps(int[] arr){
        int n = arr.length; 
        if(n == 1) return 0;
        if(arr[0] == 0) return -1; 
        
        int jumps = 0; 
        int current = 0; 
        int fartest = 0; 

        for(int i=0; i<n; i++){
            fartest = Math.max(fartest, i+arr[i]); 

            if(i == current){
                jumps++; 
                current = fartest; 

                if(fartest <= i) return -1; 
            }

            if(current >= n-1) break; 
        }
        return jumps; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; 


        System.out.println(minJumps(arr));
        sc.close();
    }
}
// Minimum Jumps
