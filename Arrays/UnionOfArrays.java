import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionOfArrays {
    public static ArrayList<Integer> unionArrays(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>(); 

        for(int x : a){
            set.add(x);
        }

        for(int y : b){
            set.add(y); 
        }

        return new ArrayList<Integer>(set); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); 
        }

        int m = sc.nextInt();
        int b[] = new int[m]; 
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt(); 
        }

        ArrayList<Integer> result = unionArrays(a, b);
        
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
