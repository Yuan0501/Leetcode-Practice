import java.util.Arrays;

public class Problem435 {
    public int eraseOverlapIntervals(int[][] intervals){
        if(intervals.length == 0){
            return 0;
        }
        int res = 1;
        Arrays.sort(intervals, (row1, row2)->{
            if(row1[1] != row2[1]){
                return Integer.compare(row1[1], row2[1]);
            }
            return Integer.compare(row1[0], row2[0]);
        });
        int pre = 0;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= intervals[pre][1]){
                res += 1;
                pre = i;
            }
        }

        return intervals.length - res;

//        for(int[] in : intervals){
//            for (int i : in){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

    }

}
