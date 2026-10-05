class Solution {
    public long minimumRemoval(int[] beans) {
         int n = beans.length;
        Arrays.sort(beans);
        long totalSum = 0;
        for (int bean : beans) {
            totalSum += bean;
        }
        long prefixSum = 0;
        long answer = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long target = beans[i];
            long removeSmaller = prefixSum;
            long remainingSum = totalSum - prefixSum;
            long remainingBags = n - i;
            long removeLarger =
                    remainingSum - target * remainingBags;
            long totalRemoval =
                    removeSmaller + removeLarger;
            answer = Math.min(answer, totalRemoval);
            prefixSum += beans[i];
        }
        return answer;
    }
}