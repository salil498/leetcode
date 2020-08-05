class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<Math.min(i+nums[i]+1,nums.length);j++){
                if(dp[j]!=0)
                dp[j]=Math.min(dp[j],1+dp[i]);
                else
                    dp[j]=1+dp[i];
            }
                
        }
        return dp[nums.length-1];
    }
}

////////////////////////linear approach//////////////////////
public int jump(int[] A) {
	int jumps = 0, curEnd = 0, curFarthest = 0;
	for (int i = 0; i < A.length - 1; i++) {
		curFarthest = Math.max(curFarthest, i + A[i]);
		if (i == curEnd) {
			jumps++;
			curEnd = curFarthest;
		}
	}
	return jumps;
}
