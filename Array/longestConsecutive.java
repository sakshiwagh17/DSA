class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int num:arr){
            if(!arr.contains(num-1)){
                int cnt=1;
                int x=num;
                while(arr.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
