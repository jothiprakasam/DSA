package dsa;

public class Leetcode_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		//int n = Math.max(a.length(),b.length());
		StringBuilder sb = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		int total=0;
		while(i>=0 || j>=0 || carry!=0) {
			int digit_a = (i>=0)? a.charAt(i)-'0':0;
			int digit_b = (j>=0)? b.charAt(j)-'0':0; 
			total = digit_a + digit_b + carry;
			sb.append(total%2);
			carry=total/2;
			i--;
			j--;
		}
	System.out.println(sb.reverse().toString());
	}
}
