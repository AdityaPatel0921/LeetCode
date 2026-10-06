class Solution {
    public int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddsNeeded = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openBrackets++;
            } else {
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    minAddsNeeded++;
                }
            }
        }
        
        return minAddsNeeded + openBrackets;
        
    }
}