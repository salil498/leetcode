class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[255];
        for(int i=0;i<s.length();i++){
            arr[Integer.valueOf(s.charAt(i))]++;
        }
        int length=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                length+=arr[i];
            else{
                length+=arr[i]-1;
                odd=1;
            }
        }
        if(odd==1)
            length+=1;
        return length;
    }
}
