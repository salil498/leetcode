class Solution {
    public int maxVowels(String s, int k) {
        String str="aeiou";
        int max_count=0;
        int curr_count=0;
        for(int i=0;i<Math.min(s.length(),k);i++){
            if(str.contains(Character.toString(s.charAt(i))))
                curr_count++;
        }
        if(curr_count>max_count)
            max_count=curr_count;
        if(s.length()>k){
            for(int i=k;i<s.length();i++){
                if(str.contains(Character.toString(s.charAt(i-k)))){
                    if(str.contains(Character.toString(s.charAt(i))))
                        continue;
                    else
                        curr_count--;
                }
                else{
                    if(str.contains(Character.toString(s.charAt(i))))
                        curr_count++;
                }
                max_count=Math.max(curr_count,max_count);
            }
                
        }
        return max_count;
    }
}
