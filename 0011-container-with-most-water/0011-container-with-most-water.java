class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;
        while (left < right) {
            int height = Math.min(nums[left], nums[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}