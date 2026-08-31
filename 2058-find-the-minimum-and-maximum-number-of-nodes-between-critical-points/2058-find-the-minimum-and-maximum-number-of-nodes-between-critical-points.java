/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode cu=head;
        while(cu!=null){
            arr.add(cu.val);
            cu=cu.next;
        }
        ArrayList<Integer> Index=new ArrayList<>();
        for(int i=1;i<arr.size()-1;i++){
            if( (arr.get(i)>arr.get(i-1) &&arr.get(i)>arr.get(i+1))||(arr.get(i)<arr.get(i-1) &&arr.get(i)<arr.get(i+1))){
                Index.add(i);
            }
        }
        
        int[] res=new int[2];
        if(Index.isEmpty()||Index.size()==1){
            res[0]=-1;
            res[1]=-1;
        }
        else{

            int ma=Math.abs(Index.get(0)-Index.get(Index.size()-1));
             int mi = Integer.MAX_VALUE;

    for(int i = 1; i < Index.size(); i++){
        mi = Math.min(mi, Index.get(i) - Index.get(i-1));
    }

             res[0]=mi;
            res[1]=ma;
            
        }
        return res;
        

        
    }
}