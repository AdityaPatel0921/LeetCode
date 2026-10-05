class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        boolean[] visited = new boolean[1001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int operations = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                int x = queue.poll();
                for (int num : nums) {
                    int[] nextValues = {
                        x + num,
                        x - num,
                        x ^ num
                    };
                    for (int next : nextValues) {
                        if (next == goal) {
                            return operations + 1;
                        }
                        if (next >= 0 && next <= 1000 && !visited[next]) {
                            visited[next] = true;
                            queue.offer(next);
                        }
                    }
                }
            }
            operations++;
        }
        return -1;
    }
}