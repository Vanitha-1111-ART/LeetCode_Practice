class RecentCounter {
    Queue<Integer> ans=new LinkedList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        ans.offer(t);
        while(ans.peek()<t-3000){
            ans.poll();
        }
        return ans.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */