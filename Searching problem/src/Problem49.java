import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//49. Group Anagrams

//Solution: sort the string in the list, the anagrams string will equal to each other after sorted
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
