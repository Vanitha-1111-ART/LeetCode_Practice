class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]%2!=0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                if(i==j)continue;
            for(int k=0;k<digits.length;k++){
                    if(digits[k]==0 || k==i ||k==j) continue;
                int d=digits[k]*100 +digits[j]*10+digits[i];
                set.add(d);
                }
            }
        }
        return set.size();
        
    }
}