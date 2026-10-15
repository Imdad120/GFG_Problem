/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    void mirror ( Node root){
        if(root == null ) return ;
        Node temp  = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    boolean identical(Node p , Node q){
        if(p == null && q == null) return true;
        if(p == null || q ==null) return false;
        if(p.data != q.data) return false;
        return identical(p.left , q.left) && identical(p.right , q.right);
    }
    public boolean isSymmetric(Node root) {
        mirror(root.left);
        return identical(root.left ,root.right);
        
    }
}