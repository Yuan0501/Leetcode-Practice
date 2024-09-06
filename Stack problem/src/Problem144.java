import java.util.ArrayList;
import java.util.List;

public class Problem144 {
    public List<Integer> preorderTraveral(TreeNode root){
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        preorderTraveral(root.left);
        preorderTraveral(root.right);

        return list;
    }
}
