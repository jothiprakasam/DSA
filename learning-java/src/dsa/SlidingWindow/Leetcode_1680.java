package dsa.SlidingWindow;

public class Leetcode_1680 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mod = (long)Math.pow(10,9) + 7;
        //long n = 118505380540L%mod;
        int n = 12;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
        System.out.println(Integer.parseInt(sb.toString(),2));
	}

}
