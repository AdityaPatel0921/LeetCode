class Solution {
    public String largestEven(String s) {
        int lastTwo =  -1;

        for(int i =  0; i < s.length() ;  i ++){
            if(s.charAt(i) =='2' ){
                lastTwo   =  i ;
                 
            }
        }
            if(lastTwo   == -1){
                return "";
            }
        
        
        return s.substring(0 , lastTwo + 1);
    }
}