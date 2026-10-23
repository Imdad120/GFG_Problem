// by Iteration 
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans =new ArrayList<>();
        Stack<Node> st = new Stack<>();
        
        Node curr = root;
        while(st.size()>0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }else{
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }
        return ans;
    }
}



// by recursion 
// class Solution {
//     void dfs (Node root , ArrayList<Integer> ans){
//         if(root == null ) return;
//         dfs(root.left,ans);
//         ans.add(root.data);
//         dfs(root.right,ans);
//     }
//     public ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer> ans  = new ArrayList<>();
//         dfs(root,ans);
//         return ans ;
        
//     }
// }