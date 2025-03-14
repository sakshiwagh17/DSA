class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reverseNum = 0;
        while (x > 0) {
            int lastdigit = x % 10;
            reverseNum = (reverseNum * 10) + lastdigit;
            x = x / 10;
        }
        if (reverseNum == originalNum) {
            return true;
        }
        return false;

    }
}
