class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                q.offer(new int[] {i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int mins=-1;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int le=q.size();
            while(le-->0){
                int[] ar=q.poll();
                for(int[] d:directions){
                    int nr=d[0]+ar[0];
                    int nc=d[1]+ar[1];
                    if(nr>=0 && nr <grid.length && nc>=0 && nc<grid[0].length && fresh>0){
                        if(grid[nr][nc]==1){
                            grid[nr][nc]=2;
                            fresh--;
                            q.offer(new int[] {nr,nc});
                        }
                    }
                }
            } 
                mins++;  
        }
        if(fresh >0) return -1;

        return mins;    
    }
}