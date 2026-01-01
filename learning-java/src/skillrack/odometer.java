package skillrack;

public class odometer {
public static void main(String arhgs[]) {
	String initial = "600111011";
	int k=15;
	for(int i = 0;i<k;i++) {
		for(int j=0;j<initial.length();j++) {
			char third ;
			if(initial.charAt(j+2)=='9')
				initial='0';
		}
	}
	char a ='1';
	System.out.println(++a);
}
}
