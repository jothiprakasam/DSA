import java.util.*;
class Leetcode_43 {
    public static void main(String[] args) {
        String nums1="9";
        String nums2="9";
        int n1 = nums1.length();
        int n2 = nums2.length();
        int[] pos = new int[n1+n2]; 
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int mul = (nums1.charAt(i)-'0')*(nums2.charAt(j)-'0');
                int sum = mul + pos[i+j+1];
                pos[i+j+1]=sum%10;
                pos[i+j]+=sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pos.length;i++){
        //System.out.println(a+" ");
            if(i==0 && pos[0]==0) continue;
            sb.append(pos[i]);
        }
        System.out.println(sb);
    }
}
