package greedy;

public class Greedy_121 {
	
    public static int maxProfit(int[] prices) {
    	int result = 0;
    	int minPrice = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < prices.length; i++) {
    		
    		if (prices[i] < minPrice) {
    			minPrice = prices[i];
    		} else {
    			int a = prices[i] - minPrice;
    			
    			if (a > result) {
    				result = a;
    			}
    		}
    		
    	}
        
        return result;
    }
    
    public static void main(String[] args) {
    	int[] price = {7, 1, 5, 3, 6, 4};
    	
    	System.out.println(maxProfit(price));
    }

}
