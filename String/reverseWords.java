class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String outStr="";
        for(int i=str.length-1;i>0;i--){
            outStr+=str[i]+" ";
        }
        return outStr+str[0];
    }
}
