class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        int  low = 0;
        int high =  str.length() -1;
        while(low < high ) {
             if(str.charAt(low) != str.charAt(high)){
                return false;
             }
             low++;
             high --;
        }
        return true;
        
    }
}