package skillrack;
/*
 * input is 1-2 2-5 2-0
 * which means to sum the each like 12 2345 210
 * print the sum
 */
public class stringplay {
	public static void main(String args[]) {
		int n =3;
		String s = "5-9 2-0 7-9";
		String[] seq = s.split("(-)|(\\s+)");
		long sum=0;
		for(int i=0;i<seq.length;i+=2) {
			int start = Integer.valueOf(seq[i]);
			int end = Integer.valueOf(seq[i+1]);
			StringBuilder obj = new StringBuilder();
			if(start<end) {
			for(int j=start;j<=end;j++) {
				String c = String.valueOf(j);
				obj.append(c);
			}
			}else {
				for(int j=start;j>=end;j--) {
					String c = String.valueOf(j);
					obj.append(c);
			}
			
		}
			sum+=Long.valueOf(obj.toString());
	}
		System.out.println(sum);
	}
}
