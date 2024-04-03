import java.util.HashMap;

// 205. Isomorphic Strings
// Time complexity is: O(n)
// Space complexity is:O(1) length of s
public class Problem205 {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        int index = 0;
        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                if(map.get(i) != t.charAt(index)){
                    return false;
                }

            }else{
                if(map.containsValue(t.charAt(index))){
                    return false;
                }else{
                    map.put(i, t.charAt(index));
                }
            }
            index++;
        }
        return true;

    }
}
