import java.util.Scanner;

public class CountInversion {
    // Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
    public static int inversionCount(int arr[]){
        int count = 0; 

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(i < j && arr[i] > arr[j]){
                    count++; 
                }
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(inversionCount(arr));

        sc.close();
    }
}
