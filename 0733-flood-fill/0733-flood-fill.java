class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited=new boolean[image.length][image[0].length];
        int org=image[sr][sc];
        dfs(sr,sc,image,visited,color,org);
        return image;
    }
    public void dfs(int r,int c,int[][] image,boolean[][] visited,int color,int org){
        if(r<0 || r>=image.length || c<0 || c>=image[0].length) return;
        if(image[r][c]!= org) return;
        if(visited[r][c]) return;

        visited[r][c]=true;
        image[r][c]=color;
        dfs(r+1, c,image, visited,color, org);
        dfs(r-1, c,image, visited,color, org);
        dfs(r, c+1,image, visited,color, org);
         dfs(r, c-1,image, visited,color, org);

    }
}