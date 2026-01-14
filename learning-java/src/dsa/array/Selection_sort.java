package dsa.array;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = {1,3,4,-1};
		int smallest;
		int min=0;
		for(int i = 0;i<arr.length;i++) {
			smallest = arr[i];
			//finding smallest in array
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<smallest)	
					min = j;
			}
			int temp = arr[i];
			arr[i] =arr[min];
			arr[min]  = temp;
		}
		for(int a : arr)
	System.out.println(a);
	}
}
