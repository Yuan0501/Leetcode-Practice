import java.util.Collections;
import java.util.List;

public class Problem120 {
    public int minmumTotal(List<List<Integer>> triangle){
        for(int r = 1; r < triangle.size(); r++){
            List<Integer> prev = triangle.get(r-1);
            List<Integer> cur = triangle.get(r);
            int smallestNum = Integer.MIN_VALUE;
            for (int c = 0; c <= r; c++){
                if (c == 0){
                    smallestNum = prev.get(0);
                }
                if(c == r){
                    smallestNum = prev.get(r-1);
                }
                if(c > 0 && c != r){
                    smallestNum = Math.min(prev.get(c-1), prev.get(c));
                }
                int sum = cur.get(c) + smallestNum;
                cur.set(c, sum);
            }
        }
        List<Integer> lastRow = triangle.get(triangle.size()-1);
        return Collections.min(lastRow);

    }
}
