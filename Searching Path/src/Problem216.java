import java.util.ArrayList;
import java.util.List;

public class Problem216 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n){
        if(k > n){
            return res;
        }
        backtracking(k, n, new ArrayList<>(), 1);
        return res;
    }

    public void backtracking(int k, int n, List<Integer> cur, int index){
        if(n == 0 || k == 0){
            if(n == 0 && k == 0){
                res.add(new ArrayList<>(cur));
            }
            return;
        }

        for(int i = index; i <= 9; i++){
            if(i <= n){
                cur.add(i);
                backtracking(k - 1, n - i, cur, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
