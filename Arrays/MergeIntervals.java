import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        ArrayList<int[]> result = new ArrayList<>(); 

        int curr[] = intervals[0]; 

        for(int i=1; i<intervals.length; i++){
            int next[] = intervals[i]; 

            if(next[0] <= curr[1]){
                curr[1] = Math.max(curr[1], next[1]); 
            } else {
                result.add(curr); 
                curr = next; 
            }
        }
        result.add(curr); 

        return result.toArray(new int[result.size()][]);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int intervals[][] = new int[n][2]; 

        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt(); 
            intervals[i][1] = sc.nextInt(); 
        }

        int merged[][] = merge(intervals); 

        for(int[] interval : merged){
            System.out.print(Arrays.toString(interval));
        }
        sc.close();
    }
}
