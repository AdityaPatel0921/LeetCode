class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double  low  = 0;
      double n  = nums.length;
    double currentSum = 0;
    for(int  i =  0;i < k; i++){
     currentSum  = currentSum + nums[i];
    }
     double window =  currentSum;
      for(int  i  = k ; i < n; i++ ){
       window =  window + nums[i] - nums[ i -k] ;
         currentSum = Math.max(currentSum , window);
       }
         double resultValue  = currentSum / k;
             return resultValue; 
        
    }
}