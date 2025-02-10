class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            int charIdx = sb.charAt(i) - '0';
            if (charIdx >= 0 && charIdx <= 9) {
                sb = sb.delete(i - 1, i + 1);
                i -= 2;
            }
        }
        return sb.toString();
    }
}
