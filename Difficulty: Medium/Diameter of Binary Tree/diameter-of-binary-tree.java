/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    static int max;
    public int diameter(Node root) {
        max = 0;
        level(root);
        return max;
    }
    private int level(Node root){
        if(root == null) return 0;
        int leftLevel = level(root.left);
        int rightLevel= level(root.right);
        max = Math.max(max, leftLevel + rightLevel);
        return 1 + Math.max(leftLevel , rightLevel);
    }
}   