class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        else
            fill(image,sr,sc,image[sr][sc],newColor);
        return image;
     }
    public void fill(int[][] image, int sr, int sc,int color, int newColor){
        if(sr<0 || sc<0 || sr>=image.length || sc>= image[sr].length || image[sr][sc]!=color || image[sr][sc]==newColor)
            return;
        image[sr][sc]=newColor;
        fill(image,sr+1,sc,color,newColor);
        fill(image,sr,sc+1,color,newColor);
        fill(image,sr-1,sc,color,newColor);
        fill(image,sr,sc-1,color,newColor);
        return;
        
    }
}
