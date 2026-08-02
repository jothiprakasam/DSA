package dsa.Greedy;

import java.util.Arrays;

public class Leettcode_435 {
	public static void main(String args[]) {
		int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
		Arrays.sort(intervals,(a,b)->Integer.compare(a[1], b[1]));
		int prev= intervals[0][1];
		int remove = 0;
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i][0]<prev)
				remove++;
			else
			prev = intervals[i][1];
		}
		for(int[] a : intervals)
			System.out.println(Arrays.toString(a));
		System.out.println(remove);
}
}
