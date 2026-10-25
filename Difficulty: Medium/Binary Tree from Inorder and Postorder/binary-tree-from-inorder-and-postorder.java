/* Structure of binary tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public Node buildTree(int[] inorder, int[] postorder) {
         int n = postorder.length;
              return build(0, n - 1, 0, n - 1 ,inorder,postorder);

            }

            public static Node build(int posLo, int posHi, int inLo , int inHi, int inorder [],int postorder[]){
                if(posLo > posHi) return null;
                int val = postorder[posHi];
                Node root = new Node(val);

                int r = -1;
                for(int i = inLo; i <=inHi; i++){
                    if(inorder[i]== val){
                        r = i;
                        break;
                    }
                }
                int cnt = r-inLo;
                root.left= build(posLo, posLo+cnt - 1,inLo,r - 1,inorder,postorder);
                root.right= build(posLo+cnt ,posHi - 1,r + 1,inHi,inorder,postorder);
                return root;
            }
        }