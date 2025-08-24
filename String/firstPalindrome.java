class Solution {
    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (palindromic(str)) {
                return str;
            }
        }
        return "";
    }

    public boolean palindromic(String str) {
        int low = 0, right = str.length()-1;
        while (low < right) {
            if (str.charAt(low) != str.charAt(right)) {
                return false;
            }
            low++;
            right--;
        }
        return true;
    }
}
