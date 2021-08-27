class MyQueue {
    public MyQueue() {
        
    }
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()){
            stack1.push(x);
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        int i=0, val = -1;
        while(!stack1.isEmpty()){
            if(i==0){
                val = stack1.pop();
                stack2.push(val);
            }
            else
                stack2.push(stack1.pop());
            i++;
        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
        
    }
}
​
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
