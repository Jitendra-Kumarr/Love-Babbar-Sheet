import java.util.HashMap;
import java.util.Scanner;

public class OccuranceMoreThanNdividedbyK {


    public static int countOccurence(int arr[], int k){
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num, 0)+1); 
        }

        int count = 0; 

        for(int key : mpp.keySet()){
            if (mpp.get(key) > arr.length/k) {
                count++; 
            }
        }
        return count; 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        int k = sc.nextInt(); 

        System.out.println(countOccurence(arr, k));

        sc.close();
    }

}
