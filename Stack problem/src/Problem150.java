import java.util.Stack;
//Time complexity:O(n)
//Space complexity:O(1)
public class Problem150 {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }

            if(tokens[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();

                stack.push(a + b);
                
            } else if (tokens[i].equals("-")) {
                int a = stack.pop();
                int b = stack.pop();

                stack.push(a - b);
                
            } else if (tokens[i].equals("*")) {
                int a = stack.pop();
                int b = stack.pop();

                stack.push(a * b);
            } else if (tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                stack.push(a / b);
            }
        }
        return stack.pop();
    }

}
