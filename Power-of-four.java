class Solution {
    public boolean isPowerOfFour(int num) {
        int r=num %10;
        if(num==1) return true;
        if(r==4 || r==6){
            while(num%4==0)
                 num/=4;
            if(num==1) return true;
            else return false;
        }
        else return false;
        
    }
}
