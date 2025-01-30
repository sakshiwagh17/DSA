class Solution {
    public static int First_occurence(int[] nums,int target){
        int n=nums.length;
        int low=0,high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
               low=mid+1;
            }
        }
        return first;
    }
    public static int Last_occurence(int[] nums,int target){
        int n=nums.length;
        int low=0,high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=First_occurence(nums,target);
        if(first==-1) return new int[]{-1,-1};
        int last=Last_occurence(nums,target);
        return new int[]{first,last};
    }
}
