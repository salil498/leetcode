class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j==s.length())
                break;
            else if(s.charAt(j)==t.charAt(i))
                j++;
            
        }
        if(j==s.length())
            return true;
        else
            return false;
    }
}