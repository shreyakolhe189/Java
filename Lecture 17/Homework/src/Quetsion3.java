public class Quetsion3 {
    public static int maxProfit(int prices[]){
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[] = {7,1,3,5,6,4};
        System.out.println(maxProfit(prices));
    }
}


