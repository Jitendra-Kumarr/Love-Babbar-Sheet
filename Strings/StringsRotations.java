// package Strings;

import java.util.Scanner;

public class StringsRotations {
    public static boolean areRotations(String s1, String s2){
        if(s1.length() != s2.length()){
            return false; 
        }

        for(int i=0; i<s1.length(); i++){
            if(s1.equals(s2)){
                return true; 
            }

            char last = s1.charAt(s1.length()-1); 
            s1 = last + s1.substring(0, s1.length()-1); 
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s1 = sc.next(); 
        String s2 = sc.next(); 

        System.out.println(areRotations(s1, s2));

    }
}
