class Solution {
    public String reverseVowels(String s) {
        char[] str=s.toCharArray();
        int left=0;
        int right=str.length-1;
        String vowels="aeiouAEIOU";
        while(left<right){
            while(left<right&&vowels.indexOf(str[left])==-1){
                left++;
            }
            while(left<right&&vowels.indexOf(str[right])==-1){
                right--;
            }
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        return new String(str);   
    }
}
