class Solution {
    public char nonRepeatingChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        // Check characters in their original order
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (freq[idx] == 1) {
                return ch;
            }
        }

        return '$';
    }
}