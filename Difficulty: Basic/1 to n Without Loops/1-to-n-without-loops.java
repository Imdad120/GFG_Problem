class Solution {
    public void printTillN(int n) {
        printNumbers(1, n);
    }

    public void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }

        System.out.print(current + " ");
        printNumbers(current + 1, n);
    }
}