package regex;

public class regex1 {
public static void main(String args[]) {
	String reg = "[a-z]+_[a-z]+";
			//"^[p{1}q{0,}]+$";
	System.out.println("pq_q".matches(reg));
}
}
