class Solution {
    public int pivotIndex(int[] nums) {
        int left=  0;
        int right = 0;
        int tolatSumOfArray = 0;

         for (int  i = 0; i < nums.length;i++){
             tolatSumOfArray+= nums[i];
         }

         for (int i = 0;  i < nums.length;i++){
             right = tolatSumOfArray - left - nums[i];
             if(right ==  left){
               return i;
             }
             
             left = left + nums[i];
             
         }
          return  -1;

    }
}