package dsa.dp;
/** 
 * unique path using DP.
 * question is taken from freecodecamp
 * */
public class LL_62 {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m= 3,n=7;
		int[][] memo = new int[m+1][n+1];
        int result = path(m,n,memo);
        System.out.println(result);
	}
	public static int path(int m,int n,int[][] memo){
        LL_62.cnt++;
		if(n==0 || m==0) return 0;
        if(n==1 && m==1) return 1;
        if(memo[m][n]!=0) return memo[m][n];
        int right = path(m,n-1,memo);
        int down = path(m-1,n,memo);
        memo[m][n] = right + down;
        return memo[m][n];
    }
}
