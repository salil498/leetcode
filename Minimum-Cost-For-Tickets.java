class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        boolean[] isTravelDay = new boolean[366];
        for (int day : days) {
            isTravelDay[day] = true;
        }
        int[] dp = new int[366];
        for (int i = 1; i < 366; i++) {
            if (!isTravelDay[i]) {
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = Integer.MAX_VALUE;
            dp[i] = Math.min(dp[i], dp[Math.max(0, i - 1)] + costs[0]);
            dp[i] = Math.min(dp[i], dp[Math.max(0, i - 7)] + costs[1]);
            dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
        }
        return dp[365];
    }
}