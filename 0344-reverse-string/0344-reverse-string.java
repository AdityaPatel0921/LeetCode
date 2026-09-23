class Solution {
    public void reverseString(char[] nums) {
        int left =  0;
        int right =  nums.length -1;
        while(left <  right){
            char temp   =  nums[left] ;
            nums[left] =  nums[right];
            nums[right] =  temp;
            left ++;
            right -- ;
        }
        
    }
}