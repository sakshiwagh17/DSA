class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;

    }
}