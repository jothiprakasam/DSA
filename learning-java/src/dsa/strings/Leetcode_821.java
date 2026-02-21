import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        String  s = "loveleetcode";
        char t = 'e';
        int n=s.length();
        int[] larr = new int[n];
        int[] rarr = new int[n];
        Arrays.fill(larr,Integer.MAX_VALUE);
        Arrays.fill(rarr,Integer.MAX_VALUE);
        int dis = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(t==s.charAt(i)){
                dis=0;
                larr[i]=dis;
            }else{
                if(dis!=Integer.MAX_VALUE)
                dis++;
                larr[i]=dis;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(t==s.charAt(i)){
                dis=0;
                rarr[i]=dis;
            }else{
                if(dis!=Integer.MAX_VALUE)
                dis++;
                rarr[i]=dis;
            }
            larr[i]=Math.min(larr[i],rarr[i]);
        }
        for(int a:larr)
        System.out.println(a);
    }
}
