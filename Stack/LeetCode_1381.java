class CustomStack {
    int[] arr;
    int maxSize;
    int top = -1;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(top!=maxSize-1){
            top++;
            arr[top] = x;
        }
    }
    
    public int pop() {
        if(top==-1) return -1;
        int a = arr[top];
        top--;
        return a;
    }
    
    public void increment(int k, int val) {
        int lmt = Math.min(k,top+1);
        for(int i =0;i<lmt;i++){
            arr[i]+= val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
