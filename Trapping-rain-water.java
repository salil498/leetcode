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

//////////////pre computing lmax and max...O(N) time and O(N) space solution/////////////

class Solution {
    public int trap(int[] height) {
        int sum=0;
        if(height.length==0)
            return 0;
        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        lmax[0]=height[0];
        rmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
            lmax[i]=Math.max(lmax[i-1],height[i]);
        for(int i=height.length-2;i>=0;i--)
            rmax[i]=Math.max(rmax[i+1],height[i]);
        for(int i=0;i<height.length;i++){
                int total=Math.min(lmax[i],rmax[i]);
                sum += total-height[i];    
        }
        return sum;
    }
}
