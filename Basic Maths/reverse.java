class Solution {
    public int reverse(int x) {
        int reverseNum = 0;
        while (x != 0) {
            int lastdigit = x % 10;
            x = x / 10;
            if (reverseNum > Integer.MAX_VALUE / 10)
                return 0;
            if (reverseNum < Integer.MIN_VALUE / 10)
                return 0;
            reverseNum = (reverseNum * 10) + lastdigit;
        }
        return reverseNum;
    }
}
