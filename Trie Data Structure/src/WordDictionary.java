import java.util.TreeMap;
// Leetcode 211. Design Add and Search Words Data Structure
public class WordDictionary {
    private class Node{
        boolean isWord;
        TreeMap<Character, Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node(){
            this(false);
        }
    }
    private Node root;
    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node cur = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(cur.next.get(c) == null){
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }
        if(!cur.isWord){
            cur.isWord = true;
        }
    }

    public boolean search(String word){
        return match(word, root, 0);
    }

    private boolean match(String word, Node root, int index) {
        if(index == word.length()){
            return root.isWord;
        }

        Node cur = root;
        char c = word.charAt(index);
        if(c != '.'){
            if(cur.next.get(c) == null){
                return false;
            }else{
               return match(word, cur.next.get(c), index + 1);
            }
        }else{
            for(char nextChar : cur.next.keySet()){
                if(match(word, cur.next.get(nextChar), index + 1)){
                    return true;
                }
            }
            return false;
        }

    }
}
