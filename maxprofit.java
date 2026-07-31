//The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i],
//you can even buy and sell the stock on the same day. Find the maximum profit that you can get.
public class maxprofit {
    public static int total(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i=1;i<n;i++){
            // If today's price is higher than yesterday's, we gain profit
        if(prices[i]>prices[i-1]){
            profit = profit + prices[i]-prices[i-1];
        }
        }
        return profit;
    }
    public static void main(String args[]){
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(total(prices)); // Output: 865
    }
}
