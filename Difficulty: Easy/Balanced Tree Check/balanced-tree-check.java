/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    static boolean flag;
    public boolean isBalanced(Node root) {
        if(root == null ) return true;
        flag = true;
        level(root);
        return flag;
    }
    
    private int level(Node root){
        if(root == null ) return 0;
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        if(Math.abs(leftLevel- rightLevel) > 1) flag = false;
        return 1 + Math.max(leftLevel , rightLevel);
    }
}