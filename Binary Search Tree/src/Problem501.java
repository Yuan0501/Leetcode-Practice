import java.util.ArrayList;
import java.util.List;

public class Problem501 {
    List<Integer> res = new ArrayList<>();
    int count = 1;
    TreeNode preNode = null;
    int max = 1;
    public int[] findMode(TreeNode root){
        inorder(root);
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);

        if(preNode != null && preNode.val == root.val){
            count++;
        }else {
            count = 1;
        }
        if(count > max){
            max = count;
            res.clear();
            res.add(root.val);
        }else if (count == max){
            res.add(root.val);
        }
        preNode = root;
        inorder(root.right);
    }
}
