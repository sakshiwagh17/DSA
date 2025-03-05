class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '{' || it == '[')
                st.push(it);
            else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == '}' && ch == '{') || (it == ']' && ch == '[')) {
                    continue;
                } else
                    return false;
            }
        }
        if (st.size() > 0)
            return false;
        return true;
    }
}
