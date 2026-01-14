package dsa.array;

public class Reverse_array {

	public static void main(String[] args) {
		int[] arr = {0};
		int l = 0;
		int h = arr.length-1;
		while(l<h) {
		int temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
		l++;
		h--;
		}
		for(int a: arr)
			System.out.println(a);
	}

}
