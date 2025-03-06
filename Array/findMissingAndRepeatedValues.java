class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing = -1;
        int repeating = -1;
        int n = grid.length;
        int N = n * n;
        int[] freq = new int[N + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        for (int num = 1; num < freq.length; num++) {
            if (freq[num] == 2)
                repeating = num;
            else if (freq[num] == 0)
                missing = num;
            if (repeating != -1 && missing != -1)
                break;
        }
        int[] arr = { repeating, missing };
        return arr;
    }
}
