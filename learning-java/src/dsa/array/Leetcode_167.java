package dsa.array;

public class Leetcode_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,7,11,15};
        int target = 9;
        int l=0;
        int r=numbers.length-1;
        int[] arr = new int[2];
        while(l<r){
            int sum = numbers[l]+numbers[r];
        	if(sum==target) {
            	System.out.println(l+1+" "+(r+1));
            	break;
            }else if(sum<target)
            	l++;
            else
            	r--;
            
        }
	}

}
