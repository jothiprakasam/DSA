package dsa;

public class LC_set_mismatch {
	public static void main(String args[]) {
		int[] nums = {2,2};
		int[] cnt= new int[nums.length+1]; // due to mentioned in question that nums starts from 1
		for(int a: nums) 
			cnt[a]++; // 0 ingnored
		int missing=-1,duplicate=-1;
		for(int i=1;i<cnt.length;i++) {
			if(cnt[i]==2)
				duplicate=i;
			else if(cnt[i]==0)
				missing=i;
		}
		//return new int[]{duplicate,missing};
		System.out.println(duplicate+" "+missing);
	}
}
