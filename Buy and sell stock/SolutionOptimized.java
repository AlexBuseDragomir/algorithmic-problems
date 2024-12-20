class SolutionOptimized {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int minPrice = 10_000;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}