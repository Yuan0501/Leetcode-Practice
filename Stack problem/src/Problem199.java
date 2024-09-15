import java.util.ArrayList;
import java.util.List;

public class Problem199 {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        rightSide(root, result,0);
        return result;


    }

    private void rightSide(TreeNode root, List<Integer> result, int level){
        if(root == null){
            return;
        }

        if(level == result.size()){
            result.add(root.val);
        }

        rightSide(root.right, result, level + 1);
        rightSide(root.left, result, level  +1);
    }

}
