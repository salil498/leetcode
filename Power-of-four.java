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


////////////////without loop 1 line solution/////////////
public class Solution {
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
