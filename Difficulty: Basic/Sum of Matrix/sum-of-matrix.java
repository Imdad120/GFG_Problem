class Solution {
    public int sumOfMatrix(int[][] arr) {
        // code here
        int sum = 0 ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length ;j++){
              sum += arr[i][j];
                
            }
        }
        return sum;
        
    }
}