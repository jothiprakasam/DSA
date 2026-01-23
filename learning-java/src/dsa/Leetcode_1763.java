package dsa;
import java.util.HashSet;
public class Leetcode_1763 {
	public static String NiceString(String s){
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			for(char c : s.toCharArray())
				hs.add(c);
			if(hs.contains(Character.toLowerCase(ch))&&hs.contains(Character.toUpperCase(ch))) 
				continue;
			String s1 = NiceString(s.substring(0,i));
			String s2 = NiceString(s.substring(i+1));
			return (s1.length()>=s2.length())?s1:s2;
		}
		return s;
	}
	public static void main(String args[]) {
	   String s = "YazaAay";
	   // This program can be solved in Divide and conquer.
	   System.out.print(Leetcode_1763.NiceString(s));
  }
}
