class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
          if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                str+=Character.toLowerCase(s.charAt(i));  
        }
        int i;
        for( i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                break;
        }
        if(i==str.length()/2)
            return true;
            
        return false;
    }
}
