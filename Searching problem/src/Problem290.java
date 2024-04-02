import java.util.HashMap;

//290. Word Pattern
// Time complexity is O(n)
// Space complexity is O(1)
public class Problem290 {
    public boolean wordPattern(String pattern, String s){
        HashMap<Character, String> map = new HashMap<>();
        String[] splited = s.split(" ");
        int index = 0;
//        should consider the length of pattern and splited array is same
        if(pattern.length() != splited.length){
            return false;
        }
        for(char i : pattern.toCharArray()){
            if(map.containsKey(i)){
                if(!map.get(i).equals(splited[index])){
                    return false;
                }
            }else{
                if(map.containsValue(splited[index])){
                    return false;
                }else{
                    map.put(i, splited[index]);
                }

            }
            index++;
        }
        return true;
    }
}
