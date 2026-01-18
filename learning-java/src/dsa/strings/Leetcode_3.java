package dsa.strings;
import java.util.HashSet;
public class Leetcode_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int l=0;
		long ls = 0;
		HashSet<Character> hs = new HashSet<>();
		for(int r =0;r<s.length();r++) {
			char ch = s.charAt(r);	
			while(hs.contains(ch)) {
				hs.remove(s.charAt(l));
				l++;
			}
			ls = Math.max(r-l+1, ls);
			hs.add(ch);
		
		}
		System.out.println(ls);
	}
}
