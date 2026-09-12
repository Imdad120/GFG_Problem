/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    static Node reverse(Node head){
            Node curr = head;
            Node prev = null;
            Node fwd = null;
            while(curr!=null){
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr= fwd;
        }
        return prev;
      }
      public void reorderList(Node head) {
        Node slow = head;
        Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow= slow.next;
                fast=fast.next.next;
            }
            Node head2 =slow.next;
            slow.next =null;
            head2 = reverse(head2);
            
            Node t1 =head;
            Node t2 = head2;
            while(t2 != null){

                Node next1 = t1.next;
                Node next2 = t2.next;

                t1.next = t2;
                t2.next = next1;

                t1 = next1;
                t2 = next2;
            }
        }
        
   }