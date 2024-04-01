import java.util.HashMap;
import java.util.Map;
// 242. Valid Anagram
// Time complexity: O(n)
// Space complexity: O(n)
// Approach 1: sort the array and count the string
// Approach 2: Using hashmap to count the string frequency
public class Problem242 {
    public boolean isAnagram(String s, String t){
        Map<Character, Integer> stringCount = new HashMap<>();
//    O(n)
        for(char i : s.toCharArray() ){
            if(stringCount.containsKey(i)){
                stringCount.put(i, stringCount.get(i) + 1);
            }else{
                stringCount.put(i, 1);
            }
        }
//    O(n)
        for(char i : t.toCharArray()){
            if(stringCount.containsKey(i)){
                stringCount.put(i, stringCount.get(i) - 1);
                if(stringCount.get(i) == 0){
                    stringCount.remove(i);
                }
            }else{
                return false;
            }
        }

        if(stringCount.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
