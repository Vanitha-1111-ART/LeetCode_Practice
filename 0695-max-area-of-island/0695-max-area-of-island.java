class Solution {
    int maxArea=0;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int[] Area=new int[1];
                    dfs(i,j,grid,visited,Area);
                }
            }
        }
      return maxArea;
        
    }
    public void dfs(int r,int c,int[][] grid , boolean[][] visited ,int[] Area){

        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return;
        if(visited[r][c] || grid[r][c]==0) return;
          
        visited[r][c]=true;
        Area[0]+=1;
        maxArea=Math.max(maxArea,Area[0]); 
        dfs(r+1,c,grid,visited,Area);
        dfs(r-1,c,grid,visited,Area);
        dfs(r,c+1,grid,visited,Area);
        dfs(r,c-1,grid,visited,Area);
    }
}