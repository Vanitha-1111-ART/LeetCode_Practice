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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int c=0;
        while(fast!=null){
            fast=fast.next;
            c++;
            if(c>1){
                slow=slow.next;
                c=0;
            }
        }
        return slow;

        
    }
}