public class LeetCode_389 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abcd";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        char c =0;
        // for(int i =0;i<s.length();i++){
        //      c ^= s.charAt(i);
        // }

        // for(int i =0;i<t.length();i++){
        //     c ^= t.charAt(i);
        // }

        for(char ch : s.toCharArray()){
            c ^=ch;
        }
        for(char ch : t.toCharArray()){
            c ^= ch;
        }
        return c;
    }
}
