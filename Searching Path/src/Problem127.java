import java.util.*;

public class Problem127 {
    private boolean findDiffWord(String word, String wordInList){
        int diff = 0;
       for (int i = 0; i < word.length(); i++){
           if(word.charAt(i) != wordInList.charAt(i)){
               diff++;
           }
       }
       return diff == 1;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        int unequalCount = 0;
        for(String word : wordList){
            if(!word.equals(endWord)){
                unequalCount++;
            }
        }
        if(unequalCount == wordList.size()){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int ladderLenghth = 1;
        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                String word = queue.poll();
                if(word.equals(endWord)){
                    return ladderLenghth;
                }
                for(String s : wordList){
                    if(findDiffWord(word, s) && !visited.contains(s)){
                        queue.add(s);
                        visited.add(s);
                    }
                }
                size--;
            }
            ladderLenghth++;

        }
        return 0;
    }
}
