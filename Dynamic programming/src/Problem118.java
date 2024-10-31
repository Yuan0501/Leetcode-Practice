import java.util.ArrayList;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int i = 1; i < numRows; i++){
            List<Integer> cur = new ArrayList<>();
            List<Integer> prev = res.get(i-1);
            cur.add(1);
            for (int j = 0; j < prev.size() - 1; j++){
                cur.add(prev.get(j) + prev.get(j + 1));
            }

            cur.add(1);
            res.add(cur);
        }
        return res;
    }
}
