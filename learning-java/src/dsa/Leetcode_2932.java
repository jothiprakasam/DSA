package dsa;

public class Leetcode_2932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5};
		int max_res = 0;
        int curr=0;
        for(int first:nums){
            for(int second:nums){
                if(Math.abs(first - second)<=Math.min(first,second)){
                    curr = first^second;
                }
                    max_res=Math.max(max_res,curr);
            }
        }
        System.out.println(max_res);
	}

}
