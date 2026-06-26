class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;
    public MinStack() {
         this.stack = new ArrayDeque<>();
         this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
           minStack.push(val); 
        }else {
            int currMin = minStack.peek();
            minStack.push(Math.min(val, currMin));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
}
    
    public int getMin() {
        return minStack.peek();
    }
}
