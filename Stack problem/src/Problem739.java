import java.util.Stack;

public class Problem739 {
    public int[] dailyTemperatures(int[] temperatures){
       int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int cur = 0; cur < temperatures.length; cur++){
            while (!stack.isEmpty() && temperatures[cur] > temperatures[stack.peek()]){
                int pre = stack.pop();
                res[pre] = cur - pre;
            }
            stack.push(cur);
        }
        return res;
    }
}
