import java.util.HashMap;

public class Problem91 {

    HashMap<Integer, Integer> map = new HashMap<>();
    private int divideNum(int index, String s){
        if (index == s.length()){
            return 1;
        }
        if (index == s.length() - 1){
            return 1;
        }
        if (s.charAt(index - 1) == '0'){
            return 0;
        }
        if (map.containsKey(index)){
            return map.get(index);
        }

        int ans = divideNum(index + 1, s);
        if (Integer.parseInt(s.substring(index, index + 2)) <= 26){
            ans += divideNum(index + 2, s);
        }

        map.put(index, ans);
        return map.get(s.length());
    }
    public int numDecoding(String s){
       return divideNum(0, s);
    }
}
