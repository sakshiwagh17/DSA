class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[high] < nums[mid]) {
                low = mid + 1;
            } else if (nums[high] > nums[mid]) {
                high = mid;
            } else {
                high--;
            }
        }
        return nums[low];
    }
}
