class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int step = 1;
        while(m != n)
        {
            m = m >> 1;
            n = n >> 1;
            step = step << 1;
        }
        
        return m * step;
    }
}
