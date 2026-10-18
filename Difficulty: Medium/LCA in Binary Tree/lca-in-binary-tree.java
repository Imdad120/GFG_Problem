/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int p, int q) {
       if(root == null) return null;
       if(root.data == p || root.data == q) return root;
       Node l = lca(root.left,p,q);
       Node r = lca(root.right,p,q);
       
       if(l!= null && r!= null) return root;
       return (l==null) ? r:l;
    }
}




// ANOTHER APPROACH 

// class Solution {
//     Node lca(Node root, int p, int q) {
//         if(root == null ) return null;
//         if(root.data == p || root.data == q ) return root;
        
//         boolean pLiesInLeft = exists(root.left,p);
//         boolean qLiesInRight = exists(root.right,q);
        
//         if(pLiesInLeft && !qLiesInRight) return lca(root.left,p,q);
//         else if (!pLiesInLeft && qLiesInRight) return lca(root.right,p,q);
//         else return root;
//     }
//      private boolean exists(Node root ,int val){
//         if(root == null ) return false;
//         if(root.data == val )return true;
//         return exists(root.left,val) || exists(root.right,val);
//     }
// }