import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k){
        backtracking1(n, k, new ArrayList<>(), 1);
        return res;
    }

    public void backtracking1(int n, int k, List<Integer> lst, int index){
        if(lst.size() == k){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i = index; i <= n - (k - lst.size()) + 1; i++){
            lst.add(i);
            backtracking1(n, k, lst, i + 1);
            lst.remove(lst.size() - 1);
        }
    }



}
