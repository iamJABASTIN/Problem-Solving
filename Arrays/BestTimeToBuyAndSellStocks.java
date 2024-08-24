public class BestTimeToBuyAndSellStocks {

    public static int bestTimeToBuyAndSellStock( int []prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0, maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String []args) {
        int []arr = {7,1,5,3,6,4};
        int ans = bestTimeToBuyAndSellStock(arr);
        System.out.println("The output is "+ ans);
    }
}

