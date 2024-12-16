import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    String[] letters = {"", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits){
        if(digits.length() == 0){
            return res;
        }
        dfs(digits, 0, new StringBuilder());
        return res;
    }

    private void dfs(String digits, int index, StringBuilder s){
        if(index == digits.length()){
            res.add(s.toString());
            return;
        }

        int num = digits.charAt(index) - '0';
        String str = letters[num];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            s.append(c);
            dfs(digits, index + 1, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
