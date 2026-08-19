class Solution {
    public int trap(int[] height) {
        int i=0;
        int n=height.length;
        int ans=0;
        int j=n-1;
        int im=0,jm=0;
        while(j>i){
            if(height[i]<=height[j]){
               if(height[i]>=im){
                im=height[i];
               }
               else{
                ans+=im-height[i];
               }
               i++;
            }
            
        else{
               if(height[j]>=jm){
                jm=height[j];
               }
               else{
                ans+=jm-height[j];
               }
            j--;
            }
         } 
      
        return ans;
        
    }
}