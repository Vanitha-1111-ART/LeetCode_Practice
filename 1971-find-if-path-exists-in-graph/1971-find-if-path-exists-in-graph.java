class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.get(u).add(v);
            map.get(v).add(u);
        }
        boolean[] seen =new boolean[n];
        return dfs(source,destination,map,seen);
        
    }
    public boolean dfs(int sou,int des,HashMap<Integer,List<Integer>> map,boolean[] seen){
        if(sou==des){
            return true;
        }
         seen[sou]=true;
        for(int n:map.get(sou)){
            if(!seen[n]){
                if(dfs(n,des,map,seen)) return true;
            }
        }
        return false;
    }
}