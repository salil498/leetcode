class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
       int j=matrix[0].length-1;
       int i=0;
        while(i>=0 && i< matrix.length && j>=0 && j<matrix[0].length){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]>target)
                j=j-1;
            else
                i=i+1;
        }
        return false;
    }
}
