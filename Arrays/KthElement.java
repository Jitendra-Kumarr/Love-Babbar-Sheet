// package Arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthElement {
    public static int KthSmallest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 

        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]); 
        }

        for(int i=1; i<k; i++){
            pq.poll();
        }
        
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(KthSmallest(arr, 4));

    }
}
