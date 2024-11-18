import java.util.ArrayList;
import java.util.List;

public class Problem763 {
    public List<Integer> partitionLabels(String s){
        int[] lastOccur = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastOccur[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();
        int ancor = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            j = Math.max(lastOccur[s.charAt(i) - 'a'], j);
            if(i == j){
                ans.add(j - ancor + 1);
                ancor = i + 1;
            }
        }
        return ans;
    }
}
