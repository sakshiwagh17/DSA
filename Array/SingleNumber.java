class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int num:nums){
            unique^=num;
        }
        return unique;
    }
}

//Time Complexity: O(n)
//Space Complexity:O(1)
