class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for (String ip : tokens) {
            if ("+-*/".contains(ip)) {
                int topofStack = st.pop();
                int secondofStack = st.pop();
                switch (ip) {
                    case "+":
                        st.push(secondofStack + topofStack);
                        break;
                    case "-":
                        st.push(secondofStack - topofStack);
                        break;
                    case "*":
                        st.push(secondofStack * topofStack);
                        break;
                    case "/":
                        st.push(secondofStack / topofStack);
                        break;
                    default:
                        break;
                }
            } else {
                st.push(Integer.parseInt(ip));
            }
        }
        return st.pop();
    }
}
