class Solution {
    public void moveZeroes(int[] nums) {
         int size =  nums.length;
        if(size == 0 ||  size == 1){
            return ;
        }

        int zero = 0 ;
        int nonZero  = 0 ;

      while(nonZero <  size){

        if (nums[nonZero] != 0){

            int temp   =  nums[nonZero];

            nums[nonZero] =   nums[zero];

            nums[zero]   = temp;

            nonZero++;

            zero++;}

        else{
            nonZero++;


        }



      }
        
    }
}