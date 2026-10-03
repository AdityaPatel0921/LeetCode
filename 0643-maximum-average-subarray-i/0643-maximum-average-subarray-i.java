class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int low = 0;
        int high = k - 1;
        for (int i = low; i <= high; i++) {
            sum = sum + nums[i];
        }
        int result = sum;
        while (high < n - 1) {
            sum = sum - nums[low];
            low++;
            high++;
            sum = sum + nums[high];
            result = Math.max(result, sum);
        }
        double avg = (double) result / k;
        return avg;
    }
}