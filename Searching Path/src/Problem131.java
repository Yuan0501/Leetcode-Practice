import java.util.ArrayList;
import java.util.List;

public class Problem131 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s){
        backtracking(s, new ArrayList<>());
        return res;
    }

    public void backtracking(String s, List<String> cur){
        if(s.length() == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < s.length(); i++){
            String subString = s.substring(0, i + 1);
            if(isPalindrome(subString)){
                cur.add(subString);
                backtracking(s.substring(i + 1), cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s){
        int end = s.length() - 1;
        int start = 0;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
