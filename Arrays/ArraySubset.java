import java.util.HashMap;
import java.util.Scanner;

public class ArraySubset {
    
    public static boolean isSubset(int a[], int b[]){
        HashMap<Integer, Integer> mapp = new HashMap<>(); 

        for(int i: b){
            mapp.put(i, mapp.getOrDefault(i, 0)+1); 
        }
        
        for(int i: a){
            mapp.put(i, mapp.getOrDefault(i, 0)-1); 
        }

        for(int val : mapp.values()){
            if(val > 0) return false; 
        }
        return true;
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

        System.out.println(isSubset(a, b));


        sc.close();
    }
}
