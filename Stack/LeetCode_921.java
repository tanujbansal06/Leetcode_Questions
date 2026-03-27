import java.util.*;
class LeetCode_921 {
    public int minAddToMakeValid(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}
