class MinStack {
    int[] Sta;
    int[] MinSta;
    int top=-1,mintop=-1;
    public MinStack() {
        Sta=new int[30000];
        MinSta=new int[30000];    
    }
    
    public void push(int value) {
        Sta[++top]=value;
       if(mintop==-1 ||value<=MinSta[mintop]){
             MinSta[++mintop]=value;
       }  
    }
    
    public void pop() {
        if(Sta[top--]==MinSta[mintop]) mintop--;   
    }
    
    public int top() {
        return Sta[top];
        
    }
    
    public int getMin() {
     return  MinSta[mintop]; 
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */