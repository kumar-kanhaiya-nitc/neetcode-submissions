class MinStack {
    int[] val;
    int top;

    public MinStack() {
        top = -1;
        val = new int[300000];
    }
    
    public void push(int val) {
        this.val[++top] = val;
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return val[top];
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <=top; i++){
            min = Math.min(min,val[i]);
        }
        return min;
    }
}
