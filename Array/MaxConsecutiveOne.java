class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            max1 = Math.max(max1, cnt);
        }
        return max1;
    }
}
