class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n>0){
            if(n==1){
                return true;
            }else{
                if(n%2!=0) break;
                n=n/2;
            }
        }
        return false;
    }
}
