class Solution {
    static int evenlyDivides(int n) {
        // code here
        int original=n;
        int cnt=0;
        while(n>0){
            int lastdigit=n%10;
            if(lastdigit!=0&&original%lastdigit==0){
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }
}
