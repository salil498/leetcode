class Solution {
    public int numberOfArithmeticSlices(int[] A) {
    int start=0;
    int count=0,final_count=0,flag=0;
    for(int i=2;i<A.length;i++){
        if(A[i]-A[i-1]==A[i-1]-A[i-2]){
            count++;
    
        }
        else{
            final_count+=count*(count+1)/2;
            count=0;
            flag=1;
        }
            
    }
        return final_count+count*(count+1)/2;
    }
}
