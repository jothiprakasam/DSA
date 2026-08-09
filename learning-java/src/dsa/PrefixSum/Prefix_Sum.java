package dsa.PrefixSum;

import java.util.Arrays;
import java.util.*;
public class Prefix_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++) {
			int n = sc.nextInt(),m = sc.nextInt();  sc.nextLine();
			String str = sc.next();
			int[] arr = new int[n*m+1];
			int[] p = new int[n*m+1];
			p[0]=arr[0]=0;
			int j=0;
			for(int i=1;i<=n*m;i++) {
				if(j>=str.length()) j=0;
				arr[i]=str.charAt(j)-'0';
				j++;
			}
			for(int i=1;i<=n*m;i++) {
				p[i] = p[i-1]+arr[i];
			}
			int res = 0;
			for(int i =0;i<arr.length-1;i++) {
				int a = p[i+1];
				int b = p[m*n]-p[i+1];
				if(a==b)
					res++;
			}
			System.out.println(res);
	}
	}

}
