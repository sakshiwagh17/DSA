class Solution {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < stack.length; i++) {
            char current = s.charAt(i);
            if (top >= 0 && stack[top] == current) {
                top--;
            } else {
                stack[++top] = current;
            }
        }
        return new String(stack, 0, top + 1);
    }
}
