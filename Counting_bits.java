class Solution {
    static int highestPowerof2(int n) 
    { 
        // Invalid input 
        if (n < 1) 
            return 0; 

        int res = 1; 

        // Try all powers  
        // starting from 2^1 
        for (int i = 0; i < 8 * Integer.BYTES; i++) 
        { 
            int curr = 1 << i; 

            // If current power is  
            // more than n, break 
            if (curr > n) 
            break; 

            res = curr; 
        } 

        return res; 
    } 
    public int[] countBits(int num) {
       int dp[]=new int[num+1];
        for(int i=0;i<=num;i++){
            if(i==0)
                dp[0]=0;
            else{
                int x=highestPowerof2(i);
                if(x==i)
                    dp[i]=1;
                else
                    dp[i]=1+dp[i-x];
            }
        }
        return dp;
    }
}