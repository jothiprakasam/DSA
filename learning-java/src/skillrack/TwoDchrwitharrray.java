package skillrack;
import java.util.*;		
public class TwoDchrwitharrray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int  r = sc.nextInt();
		int  c = sc.nextInt();
		sc.nextLine();
		char[][] res = new char[r][c];
		System.out.println("Enter the char: ");
		String str  = sc.nextLine();
		//int flag;
		char ch = str.charAt(0);
		boolean isLower = Character.isLowerCase(ch);


		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				String tok = sc.next();
				char tokch = tok.charAt(0);
			    if(tokch=='1') {
			    	if(isLower) {
			    		if(ch>'z')
			    			ch='a';
			    	}else {
			    		if(ch>'Z')
			    			ch='A';
			    	}
			    	res[i][j] = ch;
			    	ch++;
			    }else
					
					res[i][j]=tokch;
			}
		}
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
