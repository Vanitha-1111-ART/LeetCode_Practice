class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();
         ArrayList<Integer> res=new ArrayList<>();
        if(n1>n2){
        for(int i=0;i<n1;i++){
           arr.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            if(arr.contains(nums2[i])){
                res.add(nums2[i]);
                 arr.remove(Integer.valueOf(nums2[i]));
            }
        }
        }
        else{
            for(int i=0;i<n2;i++){
           arr.add(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            if(arr.contains(nums1[i])){
                res.add(nums1[i]);
                arr.remove(Integer.valueOf(nums1[i]));
            }
        }
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
}