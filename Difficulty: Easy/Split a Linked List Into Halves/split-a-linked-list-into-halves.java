/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        Node temp= head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next = null;
        
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2 = slow.next;
        slow.next =head;
        temp.next= head2;
        
        Pair<Node , Node>  ans = new Pair<>(head,head2);
        return ans;
        
    }
}