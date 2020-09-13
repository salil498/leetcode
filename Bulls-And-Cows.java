class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;int cows=0;
        int arr[]=new int[10];
        int ar[]=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            else{
            arr[secret.charAt(i)-'0']++;
            ar[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>0 && ar[i]>0)
                cows+=Math.min(arr[i],ar[i]);
        }
        return bull+"A"+cows+"B";
        
    }
}
