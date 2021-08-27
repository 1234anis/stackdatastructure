class MyStack {
​
    /** Initialize your data structure here. */
    int[] queue;
    int front = 0;
    int back = 0;
    
    public MyStack() {
        queue = new int[10];//could use dynamic array here        
    }
    
    public void push(int x) {
        queue[back++] = x;        
    }
    
    public int pop() {
        return queue[--back];
        
    }
    
    public int top() {
        return queue[back-1];
    }
    
    public boolean empty() {
        return front==back;
        
    }
}
​
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
