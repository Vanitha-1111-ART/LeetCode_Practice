class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        int j=0,k=0,i=0;
        while(j<m && k<n){
            if(nums1[j]<nums2[k]){
                res[i++]=nums1[j++];
            }
            else{
                res[i++]=nums2[k++];
            }
           
        }
        while(j<m) res[i++]=nums1[j++];
        while(k<n)  res[i++]=nums2[k++];
        for(int x=0;x<res.length;x++){
            nums1[x]=res[x];
        }
        

    }
}