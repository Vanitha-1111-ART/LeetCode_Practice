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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cu=head;
        while(cu!=null){
            list.add(cu.val);
            cu=cu.next;
        }
        int i=0;
        int j=list.size()-1;
        while(j>i){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}