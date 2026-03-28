import java.util.*;
public class LeetCode_735 {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int ast : asteroids){
            boolean des = false; // current asteroid ast k liye h
            while(!st.isEmpty() && ast<0 && st.peek()>0){
                if(st.peek() < -ast){
                    st.pop();
                    continue;
                }
                else if(st.peek() == -ast){
                    st.pop();
                    des = true;
                    break;
                }else{
                    des = true;
                    break;
                }
            }
            if(!des){
                st.push(ast);
            }
        }
        int[] arr = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}
