import java.util.Arrays;
import java.util.Stack;

public class Problem503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n * 2; i++ ){
            int cur = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < cur){
                res[stack.pop()] = cur;
            }
            if(i < n){
                stack.push(i);
            }
        }
        return res;
    }
}
