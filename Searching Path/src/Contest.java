import java.util.List;

public class Contest {
//    Q1
    public int buttonWithLongestTime(int[][] events){
        int len = events.length;
        int maxTime = events[0][1];
        int minIndex = events[0][0];
        for(int i = 1; i < len; i++){
            int time = events[i][1] - events[i - 1][1];
            if(time > maxTime){
                maxTime = time;
                minIndex = events[i][0];
            }else if(time == maxTime){
                if(events[i][0] < minIndex){
                    minIndex = events[i][0];
                }
            }
        }

        return minIndex;
    }

//    Q2
//    public double maxAmount(String initialCurrency, List<List<String>> pairs1, double[] rates1, List<List<String>> pair2, double[] rates2){
//
//    }


//    Q3
     public int countBeautifulSplits(int[] nums){
        int n = nums.length;
        int count = 0;

        for(int i = 1; i < n-1; i++){
            int firstLen = i;
            for(int j = i + 1; j < n; j++){

                boolean num1Prefix = true;
                for(int k = 0; k < firstLen; k++){
                    if(k >= j - i || nums[k] != nums[i + k]){
                        num1Prefix = false;
                    }
                }

                boolean num2Prefix = true;
                for(int k = 0; k < j - i; k++){
                    if(j + k >= n || nums[i + k] != nums[j + k]){
                        num2Prefix = false;
                    }
                }

                if(num1Prefix || num2Prefix){
                    count++;
                }
            }
        }
        return count;

     }


}
