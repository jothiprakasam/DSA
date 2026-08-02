package dsa.array;

public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,-3,-1};
			//{-2,1,-3,4,-1,2,1,-5,4};
		int curr = 0;
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			curr += arr[i];
			max = Math.max(curr,max);
			if(curr<0)
				curr = 0;
			//curr = Math.max(curr, 0);
		}
		System.out.println(max);
	}

}
