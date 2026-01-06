package dsa;

public class Leetcode_1796 {

	public static void main(String[] args) {
		String str = "dfa12321afd";
		// poor approach
		/*
		List<Integer> arr = str.chars().filter(c -> Character.isDigit(c)).mapToObj(c-> Character.getNumericValue(c)).collect(Collectors.toList()); 

		int largest = Integer.MIN_VALUE;
		for(int a : arr) {
			if(a>largest)
				largest = a;
			}
				int s_largest = Integer.MIN_VALUE;
				for(int a : arr) {
					if(a<largest && a>s_largest)
						s_largest = a;
				}
				System.out.println((s_largest == Integer.MIN_VALUE)?-1:s_largest);
		 */  
		// best approach
		int large = -1;
		int s_large = -1;
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				int number =  c - '0';
				if(number > large) {
					s_large = large;
					large=number;
				}else if(number < large && number > s_large)
					s_large=number;
			}
		}
		System.out.println(s_large);
	}

}
