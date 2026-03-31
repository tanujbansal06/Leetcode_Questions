import java.util.*;
class StockSpanner {
    ArrayDeque<int[]> st;
    public StockSpanner() {
        st = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span =1;
        while(!st.isEmpty() && price>= st.peek()[0]){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
