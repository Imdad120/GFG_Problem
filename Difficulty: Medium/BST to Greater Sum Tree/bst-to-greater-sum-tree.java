/* Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int sum = 0;

    public void transformTree(Node root) {
        sum = 0;
        inorder(root);
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.right);

        int old = root.data;
        root.data = sum;
        sum += old;

        inorder(root.left);
    }
}