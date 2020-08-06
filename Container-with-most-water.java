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
//////////////O(N) solution using two pointer////////////////
class Solution {
    public int maxArea(int[] height) {
        if(height.length==0)
            return 0;
        int max_area=Integer.MIN_VALUE;
        int x=0;
        int y=height.length-1;
        while(x<y){
            int min=Math.min(height[x],height[y]);
            int area=min*(y-x);
            max_area=Math.max(area,max_area);
            if(height[x]<height[y])
                x++;
            else y--;
        }
        return max_area;
        
    }
}
