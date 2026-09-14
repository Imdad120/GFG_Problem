/* Structure of Linked List Node
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
    Node deleteNode(Node head, int key) {

        if (head == null)
            return null;

        // Only one node
        if (head.next == head) {
            if (head.data == key)
                return null;
            return head;
        }

        // Delete head
        if (head.data == key) {
            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            return head.next;
        }

        Node temp = head;

        while (temp.next != head) {

            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        return head;
    }
}