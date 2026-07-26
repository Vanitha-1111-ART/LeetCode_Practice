class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        int n=code.length;
        if(k>0){   
            for(int i=0;i<code.length;i++){
                int sum=0;
                for(int j=i+1;j<=k+i;j++){
                    if(j>=code.length){
                        sum+=code[j-n];
                    }else{sum+=code[j];}
                    
                }
                arr[i]=sum;
            }     
        }
        else if(k<0){
            for(int i=0;i<code.length;i++){
                int sum=0;
                for(int j=1;j<=-k;j++){
                        sum+=code[(i-j+n)%n];
                }
                arr[i]=sum;
            }     

        }
        else{
            Arrays.fill(arr,0);
        }
        return arr;
        
    }
}