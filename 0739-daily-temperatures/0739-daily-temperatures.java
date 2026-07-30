class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st1=new Stack<>();
        int[] ans=new int[temperatures.length];
        ans[temperatures.length-1]=0;
        st1.push(temperatures.length-1);
        for(int i=temperatures.length-2;i>=0;i--){
            while(!st1.isEmpty() && temperatures[i]>=temperatures[st1.peek()]){
                st1.pop();   
            }
            
            if (st1.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st1.peek() - i;
            };
            st1.push(i);
            
        }
        return ans;

        
    }
}