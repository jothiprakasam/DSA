package test;

public class datatype {
public static void main(String args[]) {
	int a = 54; //number that to be shifted in bits
	int k = 2; //no of bits it should be shifted
	int c = a << k;
	int d = (int) (a*Math.pow(2, k));
	int rs = a >> k;
	int res= (int)(Math.floorDiv(a, (int)Math.pow(2, k)));
	System.out.print(rs+" "+res);
}
}
