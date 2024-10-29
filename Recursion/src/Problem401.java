import java.util.ArrayList;
import java.util.List;

public class Problem401 {

    private void backtrack(int[] nums, int count, int sum, int index, List<Integer>list){
        if(count == 0){
            list.add(sum);
            return;
        }
        for (int i = index; i < nums.length; i++){
            backtrack(nums, count - 1, sum + nums[i], i + 1, list);
        }

    }
    private List<Integer> generateDigits(int[] nums, int count){
        List<Integer> list = new ArrayList<>();
        backtrack(nums, count,0,0, list);
        return list;
    }
    public List<String> readBinaryWatch(int turnedOn){
        List<String> res = new ArrayList<>();
        int[] hour = {1,2,4,8};
        int[] minute = {1,2, 4, 8, 16, 32};
        for(int i = 0; i <= turnedOn; i++){
            List<Integer> hourList = generateDigits(hour, i);
            List<Integer> minuteList = generateDigits(minute,turnedOn - i);
            for(int h : hourList){
                if(h > 11){
                    continue;
                }
                for(int m : minuteList){
                    if (m > 59){
                        continue;
                    }
                    if(m < 10){
                        res.add(h + ":" + "0" + m);
                    }else{
                        res.add(h + ":" + m);
                    }
                }
            }
        }
        return res;
    }
}
