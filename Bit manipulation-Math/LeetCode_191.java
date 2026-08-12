import java.util.*;
public class LeetCode_191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        // int c=0;
        // while(n>0){
        //     c = c + (n&1); // n&1 gives last bit value
        //     n = n>>1;
        // }
        // return c;
        
        int cnt = 0;
        int mask =1;
        for(int i = 0;i<32;i++){
            if((n & mask) != 0) cnt++;
            mask <<=1;
        }
        return cnt;
    }
}
