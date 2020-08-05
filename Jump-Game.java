class Solution {
    public boolean canJump(int[] nums) {
        int reach[]=new int[nums.length];
        if(nums.length==1)
            return true;
        else if(nums[0]==0)
            return false;
        reach[0]=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && reach[i]!=0){
            for(int j=i+1;j<Math.min(i+nums[i]+1,nums.length);j++){
                reach[j]++;
            }}
        }
        
        if(reach[nums.length-1]!=0)
            return true;
        else return false;
    }
}
