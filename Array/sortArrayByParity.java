class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
             if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
