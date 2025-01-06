import java.util.ArrayList;
import java.util.List;

public class Problem653 {
    List<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k){
        inorder(root);
        int p1 = 0;
        int p2 = res.size() - 1;
        while (p1 < p2){
            int sum = res.get(p1) + res.get(p2);
            if(sum > k){
                p2--;
            } else if (sum < k) {
                p1++;
            }else{
                return true;
            }
        }
        return false;

    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
