class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashArr=new HashSet<>();
        for(int num:nums){
            if(hashArr.contains(num)){
                return num;
            }
            hashArr.add(num);
        }
        return -1;
    }
}
