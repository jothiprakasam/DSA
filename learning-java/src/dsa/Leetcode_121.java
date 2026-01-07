package dsa;

public class Leetcode_121 {

	public static void main(String[] args) {
		int[] prices = {2,4,1};
		int minp = prices[0];
		int maxprofit = 0;
		for(int currentStock:prices) {
			maxprofit = Math.max(maxprofit, currentStock-minp);
			minp = Math.min(currentStock,minp);
		}
		System.out.println(maxprofit);
	}

}
