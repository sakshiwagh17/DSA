class Solution {
    public int firstUniqChar(String s) {
        int[] charArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charArr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charArr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
