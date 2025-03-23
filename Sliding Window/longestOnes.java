class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int maxLen = 0;
        int zeros = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        return maxLen;
    }
}
