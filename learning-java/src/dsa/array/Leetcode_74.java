package dsa.array;

public class Leetcode_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int target = 10;
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			int l=0;
			int h=arr[i].length-1;
			while(l<=h) {
				int mid = (l+h)/2;
				if(arr[i][mid]==target) {
					found=true;
					break;
				}else if(arr[i][mid]<target)
					l=mid+1;
				else
					h=mid-1;
			}
			if(found==true)
				break;
		}
		System.out.println(found);
	}

}
