import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    private void generateCombine(int n, int k, int start, List<Integer> cur, List<List<Integer>> res){
        boolean[] used = new boolean[n + 1];
        if(cur.size() == k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start; i <= n; i++){
            cur.add(i);
            used[start] = true;
            generateCombine(n, k, i + 1, cur, res);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        generateCombine(n, k, 1, new ArrayList<>(), res);
        return res;
    }
}
