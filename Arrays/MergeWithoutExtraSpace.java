import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void mergeArrays(int a[], int b[]){
        int n = a.length; 
        int m = b.length; 

        int i = n-1; 
        int j = 0; 

        while (i >= 0 && j < m) {
            if(a[i] > b[j]){
                int temp = a[i]; 
                a[i] = b[j]; 
                b[j] = temp; 
                i--; j++; 
            } else {
                break; 
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("a[] = " + Arrays.toString(a)); 
        System.out.println("b[] = " + Arrays.toString(b));
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

        mergeArrays(a, b);

        sc.close();
    }
}
// Merge Without Extra Space
