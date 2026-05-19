import java.util.Scanner;

public class RotateBy1 {
    public static int[] RotatebyOne(int arr[]){
        int store = arr[arr.length-1]; 

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1]; 
        }

        arr[0] = store; 

        return arr; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result[] = RotatebyOne(arr); 

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
