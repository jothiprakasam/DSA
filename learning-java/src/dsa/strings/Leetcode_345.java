package dsa.strings;

public class Leetcode_345 {
	static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
        return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IceCreAm";
		int l=0;
        int r=s.length()-1;
        char[] arr = s.toCharArray();
        while(l<r){
                while(l<r && !isVowel(arr[l]))
                l++;
                while(l<r && !isVowel(arr[r]))
                r--;
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
                l++;
        }
        System.out.println(String.valueOf(arr));
	}

}
