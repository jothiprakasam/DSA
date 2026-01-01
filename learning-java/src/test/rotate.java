package test;

public class rotate {
public static void main(String args[]) {
	int[] nums= {-1,-100,3,99};
	int k=2;
	int[] temp = new int[k+1];
    for(int i=0;i<k+1;i++)
        temp[i]=nums[i];
    for(int i=k+1;i<nums.length;i++){
      nums[i-k-1]=nums[i];
    }
    int j=0;
    for(int i=k;i<nums.length;i++)
      nums[i]=temp[j++];
    for(int a:nums)
    	System.out.print(a);
}
}
