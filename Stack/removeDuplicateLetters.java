class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack();
        HashSet<Character> set=new HashSet<>();
        int[] lastOccurence=new int[26];
        for(int i=0;i<s.length();i++){
            lastOccurence[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) continue;
            while(!st.isEmpty()&&ch<st.peek()&&lastOccurence[st.peek()-'a']>i){
                set.remove(st.pop());
            }
            st.push(ch);
            set.add(ch);
        }
        StringBuilder result=new StringBuilder();
        for(char str:st){
            result.append(str);
        }
        return result.toString();
    }
}
