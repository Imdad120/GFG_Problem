/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
       ArrayList<Integer> arr =  new ArrayList<>();
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while(q.size()>0){
           Node node = q.remove();
          arr.add(node.data);
           if(node.left!= null) q.add(node.left);
           if(node.right!=null) q.add(node.right);
           
       }
        return arr;
    }
}