/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {

    Node head;
    int len;

    public myStack() {
        head = null;
        len = 0;
    }

    public boolean isEmpty() {
        if(len == 0) return true;
        return false;
    }

    public void push(int x) {
        Node temp = new Node(x);

        temp.next = head;
        head = temp;

        len++;
    }

    public void pop() {
        if(head == null) return;

        head = head.next;
        len--;
    }

    public int peek() {
        if(head == null) return -1;

        return head.data;
    }

    public int size() {
        return len;
    }
}