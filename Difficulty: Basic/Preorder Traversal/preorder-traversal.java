//  by Iteration

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
       ArrayList<Integer> ans =  new ArrayList<>();
       Stack<Node> st = new Stack<>();
       
       st.push(root);
       while(st.size()>0){
           Node top = st.pop();
           ans.add(top.data);
           if(top.right != null) st.push(top.right);
           if(top.left != null) st.push(top.left);
       }
       return ans;
        
    }
}



// by recurion 
// class Solution {
//     public void dfs(Node root, ArrayList<Integer> ans ) {
//       if(root == null ) return ;
//       ans.add(root.data);
//       dfs(root.left,ans);
//       dfs(root.right,ans);
        
//     }
//     public ArrayList<Integer> preOrder(Node root) {
//       ArrayList<Integer> ans = new ArrayList<>();
//       dfs(root,ans);
//       return ans;
        
//     }
// }