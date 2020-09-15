class Solution {
    public boolean wordPattern(String pattern, String s) {
       String words[]=s.split(" ");
        
        if(words.length !=pattern.length()) return false;
        
       HashMap<Character,String> hm1=new HashMap<>();
       HashMap<String,Character> hm2=new HashMap<>();        
        
       for(int i=0;i<pattern.length();i++){
           char ch=pattern.charAt(i);
           if(!hm1.containsKey(ch)){ //ch not mapped with any string.
              if(hm2.containsKey(words[i])) // if that string with any other char.
			  return false;
               else{
                hm1.put(ch,words[i]);
                hm2.put(words[i],ch);
               }     
           }
           else{
               String val=hm1.get(ch);
               if(!val.equals(words[i])) return false;               
           }     
       }
        return true;
        
        
    }
}
