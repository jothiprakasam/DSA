package dsa.array;

public class Leetcode_680 {
	public static boolean isPalindrome(String s,int left,int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
			return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String args[]) {
		String s = "abc";
		int l=0,r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				if(isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1)) {
					System.out.println("true");
					break;
				}
			}
				l++;
				r--;
			System.out.println(false);
		}
	}
}
