class Solution {
    public int secondHighest(String s) {
        int n=s.length();
        /*HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                set.add(s.charAt(i)-'0');
            }
        }
        if(set.size()<2){
            return -1;
        } 
        List<Integer> arr=new ArrayList<>();
        for(int num:set){
            arr.add(num);
        }
        Collections.sort(arr);
        return arr.get(arr.size()-2);*/
        int co=1;
        for(char c='9';c>='0';c--){
            if(s.indexOf(c)!=-1){
                if(co--<=0) return c-'0';
            }
        }
        return -1;
    }
}