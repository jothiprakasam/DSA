package dsa;

public class Leetcode_409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccccdd";
		int[] cnt = new int[128];
		for(char ch:s.toCharArray()) {
			cnt[ch]++;
		}
		int longest=0;
		boolean hasOdd=false;
		for(int c:cnt) {
			longest+=(c/2)*2;
			if(c%2==1)
				hasOdd=true;
		}
		System.out.println(hasOdd?longest+1:longest);
	}
}
