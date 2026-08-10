class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr= new ArrayList<>();
        //List<Integer> arr2= new ArrayList<>();
        Set<Integer> set= new HashSet<>();
        int n=nums1.length,n2=nums2.length;
        if(n>n2){
           for(int i=0;i<n;i++){
            arr.add(nums1[i]);
           }
           for(int i=0;i<n2;i++){
            if(arr.contains(nums2[i])){
                set.add(nums2[i]);
            }
           }
        }
        else{
           for(int i=0;i<n2;i++){
            arr.add(nums2[i]);
           }
           for(int i=0;i<n;i++){
            if(arr.contains(nums1[i])){
                set.add(nums1[i]);
            }
           }
        }
        arr.clear();
        for(int num:set){
            arr.add(num);
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
     return res;
        
        
    }
}