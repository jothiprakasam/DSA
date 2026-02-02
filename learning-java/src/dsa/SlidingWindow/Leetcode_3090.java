package dsa.SlidingWindow;

import java.util.HashMap;

public class Leetcode_3090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaa";
		HashMap<Character,Integer> hm = new HashMap<>();
		int l=0;
		int max_len =0;
		for(int r=0;r<s.length();r++) {
			char ch = s.charAt(r);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
			while(hm.get(ch)>2) {
				char lchar = s.charAt(l);
				if(hm.get(lchar)==0)
				hm.remove(lchar);
				else
					hm.put(lchar, hm.get(lchar)-1);
				l++;
			}
			max_len = Math.max(max_len, r-l+1);
	}
		System.out.println(max_len);
	}

}
