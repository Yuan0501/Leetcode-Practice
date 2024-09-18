import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        if(root.left == null && root.right == null && root.val == targetSum){
            List<Integer> num = new ArrayList<>();
            num.add(0, root.val);
            res.add(num);
            return res;
        }

        if(root.left != null){
            List<List<Integer>> left = pathSum(root.left, targetSum - root.val);
            for(List<Integer> lst: left){
                lst.add(0, root.val);
                res.add(lst);
            }

        }

        if(root.right != null){
            List<List<Integer>> right = pathSum(root.right, targetSum - root.val);
            for(List<Integer> lst: right){
                lst.add(0, root.val);
                res.add(lst);
            }
        }

        return res;


    }


}
