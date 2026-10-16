
class Solution {
    class pair {
        Node node;
        int level;

        pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            int level = q.peek().level;

            for (int i = 0; i < size; i++) {
                pair p = q.remove();
                Node node = p.node;

                temp.add(node.data);

                if (node.left != null)
                    q.add(new pair(node.left, p.level + 1));

                if (node.right != null)
                    q.add(new pair(node.right, p.level + 1));
            }

            if (level % 2 == 0) {
                for (int i = 0; i < temp.size(); i++) {
                    ans.add(temp.get(i));
                }
            } else {
                for (int i = temp.size() - 1; i >= 0; i--) {
                    ans.add(temp.get(i));
                }
            }
        }

        return ans;
    }
}
