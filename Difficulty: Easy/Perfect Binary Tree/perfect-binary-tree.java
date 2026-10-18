/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    int size( Node root){
        Queue < Node> q = new LinkedList<>();
        q.add(root);
        int counter = 0;
        while(!q.isEmpty()){
            int size = q.size();
            Node node = q.remove();
            counter ++;
            if(node.left!= null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        return counter;
    }
    
    boolean isPerfect(Node root) {
        int  h = height(root);
        int nodes = (int) Math.pow(2, h) - 1;
        return nodes == size(root);
    }
};