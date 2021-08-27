class Solution {
    public int[] nextGreaterElements(int[] arr) {
            int n = arr.length;
        Deque<Integer> stack = new LinkedList<>();
        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            stack.push(i);
        }
        
        // System.out.println(stack);
        
        int[] res= new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() &&
                 (i == stack.peek() ||  arr[stack.peek()] <= arr[i])) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1: arr[stack.peek()];
            stack.push(i);
        }
        
        return res;
        
    }
}
