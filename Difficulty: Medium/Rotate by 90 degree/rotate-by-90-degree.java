class Solution {
    public void rotateMatrix(int[][] arr) {
        // code here
        // transpose arr
        for( int i = 1 ; i < arr.length;i++){
            for(int j = 0 ; j < i ; j ++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        // reverse matrix
        
        for( int j = 0; j < arr.length ; j++){
          int stCols = 0 , endCols = arr[0].length-1;
          while(stCols<endCols){
              int temp = arr[stCols][j];
              arr[stCols][j] =arr[endCols][j];
              arr[endCols][j] = temp ;
              stCols++;
              endCols--;
          }
        
    }
  }
}