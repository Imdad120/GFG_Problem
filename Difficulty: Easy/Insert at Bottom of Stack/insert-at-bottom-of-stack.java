class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        if(st.size()== 0){
            st.push(x);
            return st;
        }else{
        int top = st.pop();
        insertAtBottom(st,x);
        st.push(top);
        }
        return st;
    }

}