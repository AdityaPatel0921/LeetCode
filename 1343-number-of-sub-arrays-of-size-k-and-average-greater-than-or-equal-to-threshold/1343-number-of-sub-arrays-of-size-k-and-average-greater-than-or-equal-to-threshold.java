class Solution {
    public int numOfSubarrays(int[]arr , int k, int threshold) {

        int left = 0;
        int windowSum = 0;
        int count = 0;

        int requiredSum = k * threshold;

        for (int right = 0; right < arr.length; right++) {

            windowSum += arr[right];

            if (right - left + 1 > k) {
                windowSum -= arr[left];
                left++;
            }

            if (right - left + 1 == k) {

                if (windowSum >= requiredSum) {
                 
                      count++;
                }
            }
        }
        return count; 

       
    }
}