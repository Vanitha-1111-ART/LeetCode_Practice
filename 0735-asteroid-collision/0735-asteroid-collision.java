class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        //ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                if(!st.isEmpty()){
                    while(!st.isEmpty() && st.peek()<Math.abs(asteroids[i]) &&st.peek()>0 ){
                        st.pop();
                    }
                    if(st.isEmpty() || st.peek() < 0){
                          st.push(asteroids[i]);  
                        }
                   else if(st.peek()==Math.abs(asteroids[i])){
                        st.pop();
                    }
                }
                else{
                    st.push(asteroids[i]);
                }
            }
        }
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
        
    }
}