import java.util.Stack;
//Time complexity:O(n)
//Space complexity: O(N)

public class Problem71 {
    public String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] s = path.split("/");
        for(String i:s){
            System.out.println("i="+i);
            if(i.isEmpty() || i.equals(".")){
                continue;
            } else if (i.equals("..")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else {
                stack.push(i);
            }
        }

        StringBuilder res = new StringBuilder();
        for(String i:stack){
            res.append('/');
            res.append(i);
        }
        return res.length()>0? res.toString():"/";
        }

}
