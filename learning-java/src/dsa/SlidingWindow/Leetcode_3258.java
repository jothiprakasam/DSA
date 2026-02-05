package dsa.SlidingWindow;

public class Leetcode_3258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1010101";
		int k =2;
		int l=0;
		int res=0;
		int[]  cnt = new int[2];
	for(int r =0;r<s.length();r++) {
		char ch = s.charAt(r);
		cnt[ch-'0']++;
		while(cnt[0]>k && cnt[1]>k) { // here the logic is more imp, cuz the question has "either" -
			// which means the if a string has 3's and 2's, which is vaild, this gives wrong when we use OR, so AND is right 
			cnt[s.charAt(l)-'0']--;
			l++;
		}
		res+=(r-l+1); // every substring that has is valid that its - 
					  // own substrings ending with r is also a substring -
					  // so the no of substring is (r-l+1).
	}
	System.out.println(res);
	}
}
