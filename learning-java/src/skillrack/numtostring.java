package skillrack;

import java.util.*;

public class numtostring {
public static void main(String arhs[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the variable");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int max=0;
	for(int i=0;i<=9;i++) {
		int sum=0;
		for(int j =0;j<n;j++) {
			int cha = i;
			int chb = a[j];
			String cval = Integer.toString(chb);
			String copy = cval.replaceAll(String.valueOf(cha), "");
			int lval; 
			if(copy.isEmpty())
				lval=0;
			else
				lval = Integer.valueOf(copy);
			sum+=lval;
			if(lval>max)
				max=lval;
		}
	}
	System.out.println("Max ans is "+max);

}
}
