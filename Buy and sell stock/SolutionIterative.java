class SolutionIterative {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int minPrice = 10_000;
        int maxPrice;
        int difference = 0;

        for (int i = 0; i < prices.length - 1; i ++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                maxPrice = 0;

                for (int j = i + 1; j < prices.length; j ++) {
                    if (prices[j] > maxPrice) {
                        maxPrice = prices[j];
                    }
                }

                if (maxPrice - minPrice > difference) {
                    difference = maxPrice - minPrice;
                }
            }
        }
        return difference;
    }
}