import java.util.Scanner;

public class MeadianOfArray {

    public static double Meaidan(int arr[]){
        int n = arr.length; 
        for(int turn = 0; turn < n-1; turn++){
            for(int j=0; j<n-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
        if(n%2 != 0){
            return arr[n/2]; 
        } else {
            return (arr[n/2-1] + arr[n/2])/2.0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.err.println(Meaidan(arr));


        sc.close();
    }
}