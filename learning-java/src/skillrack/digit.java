package skillrack;
// skillrack digits manipulations
public class digit {
public static void main(String args[]) {
	int num = 9081;
	String org = String.valueOf(num);
	long sum=0;
	for(int i=0;i<org.length();i++) {
		StringBuilder  copy = new StringBuilder(org);
		StringBuilder  buf = new StringBuilder();
		char ch = org.charAt(i);
		int bufint = ch-'0';
		if(bufint==0) copy.deleteCharAt(i);
		else {
		for(int j=0;j<bufint-1;j++) {
			buf.append(ch);
		}}
	 copy.insert(i,buf);
	 sum+=Long.valueOf(copy.toString());
	}
	System.out.println(sum);
}
}
