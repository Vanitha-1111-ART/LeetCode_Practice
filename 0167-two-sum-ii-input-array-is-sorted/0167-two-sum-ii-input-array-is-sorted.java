class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
               return new int[] {i+1,j+1};
                
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else {
                i++;
            }
        }
        int[] res=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            res[k]=arr.get(k);
        }
        return res;
        
    }
}