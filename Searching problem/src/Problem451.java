//451. Sort Characters by frequency
//Time complexity: O(nlogn) or O(n + klogk)
//Space complexity: O(n)

import java.util.*;

public class Problem451 {

    public String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
//        Time complexity: O(n)
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
//        Since the sort function in Collections is mergesort which has time complexity is O(nlogn)
        Collections.sort(list, (a, b)->map.get(b) - map.get(a));
        StringBuilder res = new StringBuilder();
        for(char c : list){
            while(map.get(c) > 0){
                res.append(c);
                map.put(c, map.get(c) - 1);
            }
        }
        return res.toString();
    }
}
