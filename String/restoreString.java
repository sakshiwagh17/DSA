class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            charArr[indices[i]]=s.charAt(i);
        }

        return new String(charArr);
    }
}
