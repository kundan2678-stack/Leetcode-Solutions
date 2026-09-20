class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int revAlphabetIdx = 26 - (s.charAt(i) - 'a');
            totalSum += (i + 1) * revAlphabetIdx;
        }
        return totalSum;
    }
}