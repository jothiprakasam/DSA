package xtreme;
import java.util.*;
import java.lang.*;
import java.io.*;
public class twin {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int Q= sc.nextInt();
	    int arr[] = new int[N];
	    for(int i=0;i<N;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<Q;i++) {
			/*
			 * long query = sc.nextInt(); long flag_a = -1; long flag_b = -1;
			 */
			/*
			 * for(int j=0;j<N;j++) { if(arr[j]==query && (flag_a==-1)) { flag_a=j+1;
			 * flag_b=j+1; }else if(arr[j]==query){ flag_b=j+1; } }
			 */
	    	long query = sc.nextInt();
	    	long flag_a = -1; long flag_b = -1;
	    	int low=0;
	    	int mid;
	    	int high=arr.length-1;
	    	
	    	while(low<=high) {
	    		mid=low+(high-low)/2;
	    		if(arr[mid]>=query) {
	    			if(arr[mid]==query)
	    				flag_a=mid;
	    			low=mid+1;
	    		}else
	    			high=mid-1;
	    	}
	    	int low2=0;
	    	int mid2;
	    	int high2=arr.length-1;
	    	while(low2<=high2) {
	    		mid2=low2+(high2-low2)/2;
	    		if(arr[mid2]<=query) {
	    			if(arr[mid2]==query)
	    				flag_b=mid2;
	    			low2=mid2+1;
	    		}else
	    			high2=mid2-1;
	    	}
	    	System.out.println(flag_a+" "+flag_b);
	    }
	    
	}
}
