class MyStack {
    
    private Queue<Integer> q;
    
    
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        this.q.add(x);
        for(int i=1; i<q.size(); i++){
            this.q.add(this.q.remove());
        }
        
    }
    
    public int pop() {
        return this.q.remove();
    }
    
    public int top() {
        return this.q.peek();
    }
    
    public boolean empty() {
        return this.q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */