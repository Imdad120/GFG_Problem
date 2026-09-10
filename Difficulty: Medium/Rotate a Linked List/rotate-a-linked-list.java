class Solution {

    public Node rotate(Node head, int k) {

        if (head == null || head.next == null) return head;

        // Find length and tail
        int n = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;

        if (k == 0) return head;

        // Find kth node
        Node temp = head;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // New head
        Node newHead = temp.next;

        // Break the list
        temp.next = null;

        // Connect old tail to old head
        tail.next = head;

        return newHead;
    }
}