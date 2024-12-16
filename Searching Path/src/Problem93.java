import java.util.ArrayList;
import java.util.List;

public class Problem93 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s){
        if(s.length() < 4){
            return res;
        }
        dfs(s, 0, new StringBuilder());
        return res;

    }

    public void dfs(String s, int index, StringBuilder sbuilder){
        if(index == 4 || s.length() == 0){
            if(index == 4 && s.length() == 0){
                res.add(sbuilder.toString());
            }
            return;
        }
        for(int i = 0 ;i < s.length() && i <= 2; i++){
            String subString = s.substring(0, i+1);
            if((i != 0 && subString.charAt(0) == '0')|| Integer.valueOf(subString) > 255){
                break;
            }

            if(sbuilder.length() != 0){
                subString = "." + subString;
            }
            sbuilder.append(subString);
            dfs(s.substring(i+1), index + 1, sbuilder);
            sbuilder.delete(sbuilder.length() - subString.length(), sbuilder.length());
        }
    }
}
