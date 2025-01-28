class Solution {
    public boolean isAnagram(String s, String t) {
        String s1=s.toLowerCase();
        String t1=t.toLowerCase();
        if(s1.length()!=t1.length()){
            return false;
        }else{
            char[] s1Arr=s1.toCharArray();
            char[] t1Arr=t1.toCharArray();
            Arrays.sort(s1Arr);
            Arrays.sort(t1Arr);
            if(Arrays.equals(s1Arr,t1Arr)){
                return true;
            }else{
                return false;
            }
        }
        
    }
}
