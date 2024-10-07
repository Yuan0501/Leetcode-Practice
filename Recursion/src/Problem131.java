import java.util.ArrayList;
import java.util.List;

public class Problem131 {
    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        for(; start <= end; start++, end--){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
        }
        return true;
    }
    private void helper(String s, List<String> lst, List<List<String>> res){
        if(s.length() == 0 || s == null){
            res.add(new ArrayList<>(lst));
            return;
        }

        for(int i = 1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            if(isPalindrome(temp)) {
                lst.add(temp);
                helper(s.substring(i, s.length()), lst, res);
                lst.remove(lst.size()-1);
            }


        }

    }




    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        helper(s,new ArrayList<>(), res);
        return res;

    }


}
