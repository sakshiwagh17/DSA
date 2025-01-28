class Solution {
    public String reverseStr(String s, int k) {
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length - 1; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, sArr.length - 1);
            while (left < right) {
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(sArr);
    }
}
