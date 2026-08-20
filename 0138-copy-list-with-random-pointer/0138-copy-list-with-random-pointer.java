/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map =new HashMap<>();
        Node cu=head;
        while(cu!=null){
            Node n=new Node(cu.val);
            map.put(cu,n);
            cu=cu.next;
        }
        Node l=head;
        while(l!=null){
            Node copy=map.get(l);
            copy.next=map.get(l.next);
            copy.random=map.get(l.random);
            l=l.next;
        }
        return map.get(head); 
        
    }
}