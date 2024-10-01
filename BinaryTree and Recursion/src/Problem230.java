import java.util.Stack;

public class Problem230 {
    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            k = k-1;
            if (k == 0){
                return root.val;
            }
            root = root.right;
        }
    }
}
