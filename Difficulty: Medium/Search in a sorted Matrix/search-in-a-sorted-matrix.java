class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        // code here
        int rows = arr.length ;
        int cols = arr[0].length;
        int low = 0 , high = rows*cols-1;
        
        while(low<=high){
            int mid = low +( high -low)/2;
            int midRow = mid/cols;
            int midCols = mid%cols;
            if(arr[midRow][midCols]== tar)  return true;
            else if(arr[midRow][midCols]>tar) high = mid-1;
            else 
            low = mid+1;
            
        }
        return false;
    }
}
