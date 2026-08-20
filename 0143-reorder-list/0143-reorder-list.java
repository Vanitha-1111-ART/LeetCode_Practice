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
    public void reorderList(ListNode head) {
       ListNode fast=head;
       ListNode slow=head;
       ListNode f=head;
       //Middle 
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode prev=null;
       ListNode second=slow.next; 
      slow.next=null;
       while(second!=null){
        ListNode tem=second.next;
        second.next=prev;
        prev=second;
        second=tem;
       }
       second=prev;
       while(second !=null){
        ListNode fn=f.next;
        ListNode sn=second.next;
        f.next=second;
        second.next=fn;
        f=fn;
        second=sn;
       }
    }
}