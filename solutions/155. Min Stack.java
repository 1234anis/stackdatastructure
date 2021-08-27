class MinStack {
​
    Deque<Long> stack;
    long currMin;
    public MinStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int v) {
        long val = v;
        if(stack.isEmpty()) {
            stack.push(val);
            currMin = val;
        } else {
            if(currMin > val) {
                stack.push(val+val-currMin);
                currMin = val;
            } else {
                stack.push(val);
            }
        }
    }
    
    public void pop() {
        long pop = stack.pop();
        if(pop < currMin) {
            currMin = currMin + currMin - pop;
        }
    }
    
    public int top() {
        long top = stack.peek();
        return top < currMin ? (int)currMin : (int)top;
    }
    
    public int getMin() {
        return (int)currMin;
        
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
