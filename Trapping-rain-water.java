///////////basic approach////////////
class Solution {
    public int trap(int[] height) {
        int sum=0;
        for(int i=1;i<height.length-1;i++){
            if(i!=0 && i !=height.length-1){
                int lmax=0;
                int rmax=0;
                for(int j=0;j<i;j++)
                    lmax=Math.max(lmax,height[j]);
                for(int j=i+1;j<height.length;j++)
                    rmax=Math.max(rmax,height[j]);
                int total=Math.min(lmax,rmax);
                // System.out.print(total+""+height[i]+" ");
                if(total-height[i]>0)
                sum+=total-height[i];
                
                
            }
        }
        return sum;
    }
}
