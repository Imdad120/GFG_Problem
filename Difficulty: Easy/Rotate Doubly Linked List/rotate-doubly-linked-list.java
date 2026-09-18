/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public Node rotateDLL(Node head, int k) {
        // code here
        if(head == null || head.next == null) return head;
        Node temp = head;
        for(int i = 1; i<=k-1;i++){
            temp = temp.next;
        }
        
        if(temp.next == null) {
                    return head;
                }
                
        Node a = temp.next;
        temp.next = null;
        a.prev = null;
        Node t = a;
        while(t.next!=null){
           t = t.next; 
        }
        t.next = head;
        head.prev = t;
        return a;
    }
}