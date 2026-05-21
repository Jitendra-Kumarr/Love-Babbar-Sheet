import java.util.ArrayList;
import java.util.Scanner;

public class CommonIn3SortedArr {

    public static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c){
        int i = 0; 
        int j = 0; 
        int k = 0; 

        ArrayList<Integer> result = new ArrayList<>(); 

        while (i < a.length && j < b.length && k < c.length) {
            if(a[i] == b[j] && b[j] == c[k]){
                result.add(a[i]); 

                int val = a[i]; 
                while(i < a.length && a[i] == val) i++; 
                while(j < b.length && b[j] == val) j++; 
                while(k < c.length && c[k] == val) k++; 
            } else if (a[i] < b[j]){
                i++;
            } else if (b[j] < c[k]){
                j++; 
            } else {
                k++; 
            }
        }
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int a[] = {1, 5, 10, 20, 40, 80}; 
        int b[] = {6, 7, 20, 80, 100}; 
        int c[] = {3, 4, 15, 20, 30, 70, 80, 120}; 

        ArrayList<Integer> Answer = commonElements(a, b, c); 

        for(int x : Answer){
            System.out.print( x + " ");
        }
    }
}
