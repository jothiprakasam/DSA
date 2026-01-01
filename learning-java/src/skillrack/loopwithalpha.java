package skillrack;

public class loopwithalpha {
  public static void main(String args[]) {
	  int n=25;
	  for(int i=0;i<n;i++) { 
		  for(int j=0;j<n;j++) {
			  char c = 'a';
			  for(int k=0;k<i+j+1;k++) {
				  if(c>'z') {
				  c='a';
				  }
				  System.out.print(c);
				  ++c;
			  }
			  System.out.print(" ");
		} 
		  System.out.println();
	}
  }
}
