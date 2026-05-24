// package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllTheDuplicatesInTheInputString {

    public static List<String> findDuplicates(String s){
        int freq[] = new int[256]; 
        boolean seen[] = new boolean[256]; 
        ArrayList<Character> order = new ArrayList<>(); 

        ArrayList<String> result = new ArrayList<>(); 

        for(char ch : s.toCharArray()){
            freq[ch]++; 
            if(!seen[ch]){
                seen[ch] = true; 
                order.add(ch); 
            }
        }

        for(char ch : order){
            if(freq[ch] > 1){
                result.add("[" + ch + ", " + freq[ch] + "]");
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next(); 

        List<String> duplicates = findDuplicates(str);  
        System.out.println(duplicates);                 

        sc.close(); 

    }
}