public class ReversedString {
    public static String reverseString(String s) {
        // Reverse the string str
        char[] charArr=s.toCharArray();
        int left=0;
        int right=charArr.length-1;
        while(left<right){
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }
        return new String(charArr);  
    }
}

