class Solution {
    public int lengthOfLastWord(String s) {
        int resultValue =  0;
        int  compare  =  s.length() - 1;
        while( compare >=0 && s.charAt(compare) == ' '){
            compare -- ;
        }
        while( compare  >= 0 && s.charAt(compare) != ' ' ){
            resultValue  ++;
            compare--;
        }
        return resultValue;
       
        
    }
}