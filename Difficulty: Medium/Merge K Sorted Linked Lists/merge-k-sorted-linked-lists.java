class Solution {

    Node mergeKLists(Node[] arr) {

        ArrayList<Node> lists = new ArrayList<>(Arrays.asList(arr));

        while(lists.size() > 1) {

            Node a = lists.get(lists.size() - 1);
            lists.remove(lists.size() - 1);

            Node b = lists.get(lists.size() - 1);
            lists.remove(lists.size() - 1);

            Node c = merge(a, b);

            lists.add(c);
        }

        return lists.get(0);
    }

    Node merge(Node head1, Node head2) {

        Node i = head1;
        Node j = head2;

        Node dummy = new Node(-1);
        Node k = dummy;

        while(i != null && j != null) {

            if(i.data <= j.data) {
                k.next = i;
                i = i.next;
            }
            else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if(i == null)
            k.next = j;
        else
            k.next = i;

        return dummy.next;
    }
}