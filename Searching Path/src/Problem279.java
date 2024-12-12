import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem279 {
    public int numSquares(int n){
        List<Integer> squares = new ArrayList<>();
        for(int i = 1; i * i <=n ; i++){
            squares.add(i * i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int level = 0;
        boolean[] meet = new boolean[n + 1];
        meet[n] = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;

            while ( size > 0) {
                int node = queue.poll();

                for (int sq : squares) {
                    int reminder = node - sq;

                    if (reminder > 0) {
                        queue.add(reminder);
                    } else if (reminder < 0) {
                        continue;
                    } else if (meet[reminder]) {
                        continue;
                    } else {
                        return level;
                    }
                }
                size--;
            }
        }
        return n;
    }
}
