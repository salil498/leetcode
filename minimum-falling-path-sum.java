class Solution {
    public int minFallingPathSum(int[][] A) {
        int dp[][]=new int[A.length][A.length];
        int min,max;
        for(int i=0;i<A.length;i++)
            dp[0][i]=A[0][i];
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                min=Math.max(0,j-1);
                max=Math.min(A.length-1,j+1);
                int m=dp[i-1][min]+A[i][j];
                for(int k=min+1;k<=max;k++){
                    m=Math.min(m,dp[i-1][k]+A[i][j]);
                }
                dp[i][j]=m;
            }
        }

        min=dp[A.length-1][0];
        for(int i=1;i<A.length;i++){
            min=Math.min(min,dp[A.length-1][i]);
        }
        return min;
    }
}