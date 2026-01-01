package skillrack;
import java.util.*;
public class flowchar1 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n>0) {
		int d;
		d= n%10;
		if(d>0)
			System.out.println(d);
		else
			n/=10;
		if(n%2==0)
			n/=10;
		else 
			d--;
	}
}
}
