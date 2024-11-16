import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem406 {
    public int[][] reconstructQueue(int[][] people){
        if(people.length == 1){
            return people;
        }

        Arrays.sort(people, (row1, row2)->{
            if(row1 != row2){
                return Integer.compare(row2[0], row1[0]);
            }
            return Integer.compare(row1[1], row2[1]);
        });

        List<int[]> res = new ArrayList<>();
        for (int[] p : people){
            res.add(p[1], p);
        }

        return res.toArray(new int[people.length][2]);

    }
}
