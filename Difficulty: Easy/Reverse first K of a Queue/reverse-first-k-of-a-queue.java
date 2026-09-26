class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n  = q.size();
        if(k > n ) return q;
        for(int i =1 ; i <= k ; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i =1;i<= n-k; i++){
            q.add(q.remove());
        }
        return q;
        
    }
}