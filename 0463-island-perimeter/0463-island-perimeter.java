class Solution {
    int peri;
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,visited);
                    return peri;
                }
            }
        }
        return 0;
    }
    public void dfs(int r,int c,int[][]grid,boolean[][] visited){
        if( r< 0||r>=grid.length ||c<0 || c>=grid[0].length){
            peri++;
            return;
        } 
         if(visited[r][c])return;
        
        if(grid[r][c]==0){
            peri++;
            return;
         }
         visited[r][c]=true;
         dfs(r+1,c,grid,visited);
         dfs(r-1,c,grid,visited);
         dfs(r,c+1,grid,visited);
         dfs(r,c-1,grid,visited);

    }
}