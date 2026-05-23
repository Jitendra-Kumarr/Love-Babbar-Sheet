// package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void reverseString(char[] s){
        int start = 0; 
        int end = s.length-1; 

        while (start < end) {
            char temp = s[start]; 
            s[start] = s[end]; 
            s[end] = temp; 
            start++; end--; 
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(Arrays.toString(s));

        
        sc.close();
    }
}
