class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
            int i =0;
            while(i <n ){
                if(arr[i]== i+1 || arr[i]> n || arr[i] <= 0 || arr[i] == arr[arr[i]-1]) i++;
                else {
                    swap(arr,i,arr[i]-1);
                }  
            }
            for(i = 0 ; i< arr.length;i++){
                if(arr[i]!=i+1) return i+1;
            }
            return n+1;
        }
        private void swap(int []arr, int i , int j ){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp ;
    }
}
