class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> count = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);

            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 1) == sb.charAt(len - 2)) {
                count.push(count.pop() + 1);
            } else {
                count.push(1);
            }

            if (count.peek() == k) {
                sb.delete(sb.length() - k, sb.length());
                count.pop();
            }
        }

        return sb.toString();
    }
}
