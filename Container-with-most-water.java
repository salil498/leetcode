/////////Naive approach///////////
class Solution {
    public int maxArea(int[] height) {
        if(height.length==0)
            return 0;
        int max_area=0;
        int n=height.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int area=Math.min(height[i],height[j])*(j-i);
                max_area=Math.max(area,max_area);
            }
        }
        return max_area;
    }
}
