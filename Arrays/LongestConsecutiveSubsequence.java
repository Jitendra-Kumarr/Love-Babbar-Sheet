import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>(); 

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]); 
        }

        int maxLength = 1; 
        for(int num : set){
            if(!set.contains(num-1)){
                int count=1; 
                int x = num; 

                while(set.contains(x+1)){
                    count++; 
                    x++; 
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(longestConsecutive(arr));

        sc.close();
    }
}