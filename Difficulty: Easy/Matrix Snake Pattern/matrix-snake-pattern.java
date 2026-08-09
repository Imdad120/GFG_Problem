 class Solution {
    static ArrayList<Integer> snakePattern(int arr[][]) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                // Left to Right
                for (int j = 0; j < arr[i].length; j++) {
                    ans.add(arr[i][j]);
                }

            } else {

                // Right to Left
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    ans.add(arr[i][j]);
                }
            }
        }

        return ans;
    }
}