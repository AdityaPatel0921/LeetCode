class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n  = nums.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int previousDay = stack.pop();
                answer[previousDay] = i - previousDay;
            }
            stack.push(i);
        }
        return answer;
    }
   
}