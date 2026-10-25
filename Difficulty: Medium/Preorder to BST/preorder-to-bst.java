/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node preToBST(int pre[]) {
       int [] in = Arrays.copyOf(pre,pre.length);
       Arrays.sort(in);
       int n = in.length;
       return build(0,n - 1,0,n - 1,in,pre);

    }

     public static Node build(int preLo, int preHi, int inLo , int inHi, int inorder [],int preorder[]){       
      if(preLo > preHi) return null;
       int val = preorder[preLo];         
       Node root = new Node(val);

        int r = -1;
        for(int i = inLo; i <=inHi; i++){
            if(inorder[i]== val){
               r = i;
               break;
            }
        }
        int cnt = r-inLo;
        root.left= build(preLo + 1,preLo+cnt,inLo,r - 1,inorder,preorder);
        root.right= build(preLo+cnt + 1,preHi,r + 1,inHi,inorder,preorder);
        return root;
        }
}
