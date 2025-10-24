class myStack {
    int top;
    int[] arr;
    int size;
    
    public myStack(int n) {
        // Define Data Structures
        top=-1;
        arr=new int[n];
        size=n;
    }

    public boolean isEmpty() {
        // check if the stack is empty
       return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top==(size-1);
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(!isFull()){
            top++;
            arr[top]=x;
        }
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(!isEmpty()){
            top--;
            
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if(!isEmpty()){
            return arr[top];
        }else{
            return -1;
        }
    }
}
