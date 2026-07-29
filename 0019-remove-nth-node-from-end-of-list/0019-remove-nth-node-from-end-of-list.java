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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode cu=head;

        while(cu!=null){
            cu=cu.next;
            c++;    
        }
        if(c==n) return head.next;
        int co=1;
        cu=head;
         while(cu!=null){
            if(co==c-n) {
                cu.next=cu.next.next;
                break;
            } 
            cu=cu.next;
            co++;
              
        }

    return head;


        
    }
}