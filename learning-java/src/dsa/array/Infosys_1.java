package dsa.array;
import java.util.*;
public class Infosys_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max = 0;
		long mod = 1_000_000_007L;
		
		long[] arr = new long[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		
		for(int k=0;k<q;k++) {
			int type = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			if(type==1) {
				long lval = arr[l];
				for(int i =l;i<=r;i++) {
					long val = i-l+1;
					arr[i] = (val*lval)%mod; 
					// mod with 10^9 + 7 keeps the value in range, no overflow
				}
			}
			else if(type==2){
				long sum = 0;
				for(int i =l;i<=r;i++) {
					sum+=arr[i];
				}
				max = (max + sum)%mod;	
			}
		}
		System.out.println(max);
	}
}
