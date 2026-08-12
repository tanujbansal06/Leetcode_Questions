import java.util.Scanner;

public class LeetCode_461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(hammingDistance(x,y));
    }
    public static int hammingDistance(int x, int y) {
        int xor = x^y;
        int c=0;
        while(xor>0){
            c = c+ (xor&1);
            xor = xor>>1;
        }
        return c;
    }
}
