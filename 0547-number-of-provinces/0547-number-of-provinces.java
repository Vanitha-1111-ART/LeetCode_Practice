class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] seen=new boolean[n+1];
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int c=0;
        for(int i=1;i<=isConnected.length;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(isConnected[i][j]==1 && i!=j){
                     map.get(i+1).add(j+1);
            }
            }    
        }
        for(int i=1;i<n+1;i++){
            if(!seen[i]){
                dfs(i,seen,map);
                c++;
            }
        }
        return c;
       
    }
    public void dfs(int x,boolean[] seen,HashMap<Integer,List<Integer>> map){
        seen[x]=true;
        for(int nei :map.get(x)){
            if(!seen[nei]){
                dfs(nei,seen,map);
            }
        }
    }
}