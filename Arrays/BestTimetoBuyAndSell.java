import java.util.Scanner;

public class BestTimetoBuyAndSell {

    public static int maxProfit(int[] prices){
        int MiniMumPrice = Integer.MAX_VALUE; 
        int MaxiMumProfit = 0; 

        for(int i=0; i<prices.length; i++){
            if(prices[i] < MiniMumPrice){
                MiniMumPrice = prices[i]; 
            }
            int profit = prices[i] - MiniMumPrice;
            MaxiMumProfit = Math.max(MaxiMumProfit, profit);
        }
        return MaxiMumProfit; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int prices[] = new int[n]; 
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt(); 
        }


        System.out.println(maxProfit(prices));


        sc.close();
    }
}
// Best Time to Buy and Sell Stock
