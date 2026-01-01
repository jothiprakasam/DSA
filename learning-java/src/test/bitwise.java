package test;

public class bitwise {
	public static void main(String args[]) {
		int x=15;
		for(int i=30;i>=0;i--) {
		if((x & (1 << i))!=0) {
			System.out.print(1);
		}else
			System.out.print(0);
	}
	
	}
}
