import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    List<String> res = new ArrayList<>();
    String [] strings = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqr", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits){
        if(digits.length() == 0){
            return res;
        }

        recursion(digits,0, new StringBuilder());
        return res;
    }

    private void recursion(String digits, int index, StringBuilder s){
        if(index == digits.length()){
            res.add(s.toString());
            return;
        }

        char c = digits.charAt(index);
        String str = strings[c-'0'];
        for(int i = 0; i < str.length(); i++){
            char d = str.charAt(i);
            s.append(d);
            recursion(digits, index + 1, s);
            s.deleteCharAt(s.length()-1);
        }

    }

}
