import java.util.Scanner;
public class LeetCode_190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int bit = n & 1;        // last bit
            res = (res << 1) | bit; // left shift krke ek khali space mein result add
            n = n >> 1;            // right shift
        }
        return res;
    }
}
