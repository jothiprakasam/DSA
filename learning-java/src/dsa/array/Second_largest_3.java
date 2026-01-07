package dsa.array;

public class Second_largest_3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		int f_large = Integer.MIN_VALUE;
		int s_large = Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>f_large) {
				s_large = f_large;
				f_large = a;
			}else if(s_large < a)
				s_large= a;
		}
		System.out.println(s_large);
	}

}
