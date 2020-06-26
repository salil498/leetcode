import java.lang.*;
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min=0;
        int i=0;
        int dp[]=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for( i=2;i<cost.length;i++){
            dp[i]=Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]);
        }
        return Math.min(dp[i-1],dp[i-2]);
       
        
    }
}