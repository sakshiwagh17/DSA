class Solution {
    public int maxArea(int[] height) {
        int end = height.length - 1;
        int start = 0;
        int maxAmount = 0;
        while (start < end) {
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = w * h;
            maxAmount = Math.max(maxAmount, area);
            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return maxAmount;
    }
}
