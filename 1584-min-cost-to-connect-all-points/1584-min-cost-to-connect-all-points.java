class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,List<int[]>> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int w=Math.abs(points[i][0]-points[j][0])+
                Math.abs(points[i][1]-points[j][1]);
                map.get(i).add(new int[]{j,w});
                map.get(j).add(new int[]{i,w});
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int src=0;
        int total=0;
        boolean[] visited=new boolean[points.length];
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] cu=pq.poll();
            int node=cu[0];
            int c=cu[1];
            if(visited[node]) continue;
            visited[node]=true;
            total+=c;
            for(int[] nei:map.get(node)){
                if(visited[nei[0]]) continue;
                pq.offer(new int[]{nei[0],nei[1]});
            }
        }
        return total; 
    }
}