class Solution {
    public void sortInDesc(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the maximum
            int maxIndex = i;

            // Find the largest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the current element with the largest element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}