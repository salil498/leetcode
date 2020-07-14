class Solution {
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int[][] dp=new int[coins.length+1][amount+1];
        for(int i=0;i<=amount;i++)
            dp[0][i]=0;
        for(int j=0;j<=coins.length;j++)
            dp[j][0]=1;
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1])
                dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                else
                dp[i][j]=dp[i-1][j];
        }            
        }
        return dp[coins.length][amount];

    }
}