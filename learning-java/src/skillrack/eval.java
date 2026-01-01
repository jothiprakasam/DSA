package skillrack;
class util{
	static void eval(String exp) {
		String arr[] = exp.split("((?<=[+*=])|(?=[+*=]))");
		int xindex=-1; // 1 means X is  in right
		int isPlus=0; // 1 means + else *(0)
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("X"))
				xindex=i;
		}
		if(arr[1].equals("+"))
			isPlus=1;
		if(isPlus==1) {
			if(xindex==0)
				res=Integer.valueOf(arr[4]) - Integer.valueOf(arr[2]);
			else if(xindex==2)
				res=Integer.valueOf(arr[4])-Integer.valueOf(arr[0]);
			else
				res=Integer.valueOf(arr[0])+Integer.valueOf(arr[2]);
		}else {
			if(xindex==0)
				res=Integer.valueOf(arr[4]) / Integer.valueOf(arr[2]);
			else if(xindex==2)
				res=Integer.valueOf(arr[4])/Integer.valueOf(arr[0]);
			else
				res=Integer.valueOf(arr[0])*Integer.valueOf(arr[2]);
		}
		System.out.println(res);	
	}
}
public class eval {
public static void main(String args[]) {
	String exp1 = "2*X=4";
	//System.out.print(util.eval(exp1));
	util.eval(exp1);
}
}
