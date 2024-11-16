public class Problem121 {
    public int maxProfit(int[] prices){
        int min = prices[0];
        int max = 0;
        for (int p : prices){
            if(p < min){
                min = p;
            }else{
                max = Math.max(p - min, max);
            }
        }
        return max;
    }
}
