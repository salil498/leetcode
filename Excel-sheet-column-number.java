class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-64;
            sum=sum*26+val;
        }
        return sum;
        
    }
}
