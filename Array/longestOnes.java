class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        int maxLen=0;
        int left=0;
        int zero=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            if(zero<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }
        }
        return maxLen;
    }
}
