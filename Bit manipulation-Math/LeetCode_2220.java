import java.util.Scanner;

public class LeetCode_2220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(minBitFlips(s,g));
    }
    public static int minBitFlips(int start, int goal) {
        // int ans =0;
        // while(start>0 && goal>0){
        //     int a = start & 1;
        //     int b = goal & 1;
        //     if(a != b) ans++;
        //     start = start >> 1;
        //     goal = goal >> 1;
        // }
        // while(start > 0){
        //     ans++;
        //     start = start >> 1;
        // }
        // while(goal > 0){
        //     ans++;
        //     goal = goal >> 1;
        // }
        // return ans;
        int x = start ^ goal;
        int count = 0;
        while(x != 0){
            count = count + (x & 1);
            x = x >> 1;
        }
        return count;
    }
}
