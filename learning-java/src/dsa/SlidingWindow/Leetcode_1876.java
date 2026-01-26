package dsa.SlidingWindow;

import java.util.HashMap;

public class Leetcode_1876 {

	public static void main(String[] args) {
		String s = "xyzzaz";
		HashMap<Character,Integer> hm = new HashMap<>();
		int k=3;
		int result = 0;
		for(int i =0;i<k;i++) {
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		if(hm.size()==3)
			result++;
		for(int i =k;i<s.length();i++) {
			char outchar = s.charAt(i-k);
			hm.put(outchar,hm.get(outchar)-1);
			if(hm.get(outchar)==0) hm.remove(outchar);
			char inchar = s.charAt(i);
			hm.put(inchar,hm.getOrDefault(inchar,0)+1);
			if(hm.size()==3) result++;
		}
		System.out.println(result);
	}

}
