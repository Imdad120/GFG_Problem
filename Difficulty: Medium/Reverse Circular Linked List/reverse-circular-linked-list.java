/* Linked List Node Structure
class Node { 
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverseCircular(Node head) {
        // code here
        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=null;
        
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next= prev;
            prev = curr;
            curr = fwd;
        }
        head.next = temp;
        return temp;
    }
}