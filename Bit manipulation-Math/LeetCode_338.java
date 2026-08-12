import java.util.*;
public class LeetCode_338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i =0;i<=n;i++){
            ans[i] = ones(i);
        }
        return ans;
    }

    public static int ones(int i){
        int c =0;
        while(i>0){
            if((i&1)==1) c++;
            i = i>>1;
        }
        return c;
    }
}
