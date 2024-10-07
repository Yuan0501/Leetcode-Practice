import java.util.ArrayList;
import java.util.List;

public class Problem93 {

    private boolean valid(String s, int startIndex, int length){
        return length == 1 || s.charAt(startIndex) !='0' && (length < 3 || s.substring(startIndex, startIndex + length).compareTo("255") <= 0);
    }
    private void helper(String s, int startIndex, List<Integer> dots, List<String> ans){
        int remainLength = s.length() - startIndex;
        int remainInteger = 4-dots.size();
        if(remainLength > remainInteger *3 || remainLength < remainInteger){
            return;
        }

        if(dots.size() == 3){
            if (valid(s, startIndex, remainLength)){
                StringBuilder sb = new StringBuilder();
                int last = 0;
                for(int dot: dots){
                    sb.append(s.substring(last, last + dot));
                    sb.append(".");
                    last += dot;
                }
                sb.append(s.substring(startIndex));
                ans.add(sb.toString());
            }
            return;
        }

        for(int i = 1; i <= 3 || i < remainLength; i++){

            dots.add(i);
            if(valid(s, startIndex, i)){
                helper(s, startIndex + i, dots, ans);
            }

            dots.remove(dots.size() - 1);

        }

    }
    public List<String> restoreIpAddresses(String s){
        List<String> ans = new ArrayList<>();
        helper(s,0,new ArrayList<>(), ans);

        return ans;
    }
}
