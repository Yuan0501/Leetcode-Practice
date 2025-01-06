import java.util.ArrayList;
import java.util.List;

public class Problem230 {
    List<Integer> res = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k){
        inorderTraverse(root);
        return res.get(k-1);
    }

    public void inorderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraverse(root.left);
        res.add(root.val);
        inorderTraverse(root.right);
    }
}
