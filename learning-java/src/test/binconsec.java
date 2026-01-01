package test;
import java.util.*;
// check no of consecutive Binary "0"s of a value.
public class binconsec {
public static int consec(int n) {
	String binary = Integer.toBinaryString(n);
	int maxzeros=0;
	int curzer=0;
	for(char bit:binary.toCharArray()) {
		if(bit=='0') {
			curzer+=1;
			maxzeros=Math.max(maxzeros, curzer);
		}else {
			curzer=1;
		}
	}
	return maxzeros;
}
public static void main(String args[]) {
	int[] inputArray = {9, 2, 5, 10};
    List<Integer> result = new ArrayList<>();
    int maxvals=0;
    for(int a:inputArray) {
    	if(maxvals<consec(a))
    		maxvals=consec(a);
    }
    for(int a:inputArray) {
    	if(consec(a)==maxvals)
    		result.add(a);
    }
    Collections.reverse(result);
    for (int num : result) {
        System.out.print(num + " ");
    }
}
}
