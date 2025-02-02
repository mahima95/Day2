class MyQueue {
    Stack <Integer> s1 = new Stack<Integer>();
    Stack <Integer> s2 = new Stack<Integer>();
    private int front;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    
    //Extra variable front used for when s2 is empty
        if(s1.isEmpty())
              front = x;
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    //Check if s2 is empty otherwise the order is varied
    
    if(s2.isEmpty())
        {
        
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
                   
        }
    }
       return s2.pop();
                
    }
    
    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
    }
    return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
       return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
