class Solution {
    public void sumofset( int sum , int [] arr , int idx , ArrayList<Integer>list){
        // Base case
        if (idx == arr.length) {
            list.add(sum);
            return;
        }

        // Take the current element
        sumofset(sum + arr[idx], arr, idx + 1, list);

        // Don't take the current element
        sumofset(sum, arr, idx + 1, list);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer>list  = new ArrayList<>();
        sumofset(0,arr,0,list);
        Collections.sort(list);
        return list;
    }
}