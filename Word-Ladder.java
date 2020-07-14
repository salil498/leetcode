class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet();
        for(String str:wordList)
            s.add(str);
        if(!s.contains(endWord))
            return 0;
        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
            String str=queue.poll();
            char[] curr_word=str.toCharArray();
            for(int j=0;j<curr_word.length;j++){
                char ch=curr_word[j];
            for(char c='a';c<='z';c++){
                if(c==ch) continue;
                else{
                    curr_word[j]=c;
                    String s1=String.valueOf(curr_word);
                    if(s1.equals(endWord)) return level+1;
                    else{
                        if(s.contains(s1)){
                            queue.offer(s1);
                            s.remove(s1);
                        }
                        
                    }
                    curr_word[j]=ch;
                }
            }
            }
            }
            level++;
        }
        return 0;
    }
}
