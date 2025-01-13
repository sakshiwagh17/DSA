class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        for(char ch:sArr){
            c^=ch;
        }
        for(char cht:tArr){
            c^=cht;
        }
        return c;
    }
}
