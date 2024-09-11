import java.util.*;

public class Problem107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        if(root == null){
            return result;
        }
        int level = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int level_num = queue.size();

            for(int i = 0; i < level_num; i++){
                TreeNode node = queue.poll();
                list.add(node.val);

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            stack.add(list);
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
        

    }
}
