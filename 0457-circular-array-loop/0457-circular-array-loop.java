class Solution {
    public boolean circularArrayLoop(int[] nums) {
         int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean forward = nums[i] > 0;
            int slow = i;
            int fast = i;
            while (true) {
                slow = next(nums, slow, forward);
                if (slow == -1) {
                    break;
                }
                fast = next(nums, fast, forward);
                if (fast == -1) {
                    break;
                }
                fast = next(nums, fast, forward);
                if (fast == -1) {
                    break;
                }
                if (slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }
    private int next(int[] nums, int current, boolean forward) {

        boolean direction = nums[current] > 0;
        if (direction != forward) {
            return -1;
        }
        int n = nums.length;
        int next = ((current + nums[current]) % n + n) % n;
        if (next == current) {
            return -1;
        }
        return next;
    }
}