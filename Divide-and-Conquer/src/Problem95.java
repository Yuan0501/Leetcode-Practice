import java.util.ArrayList;
import java.util.List;

public class Problem95 {
    public List<TreeNode> generateTrees(int n){

        if (n < 1){
            return new ArrayList<>();
        }
        return generateBinaryTrees(1, n);
    }

    public List<TreeNode> generateBinaryTrees(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start > end){
            res.add(null);
        }

        for(int i = start; i <= end; i++){
            List<TreeNode> leftTree = generateBinaryTrees(start, i - 1);
            List<TreeNode> rightTree = generateBinaryTrees(i + 1, end);

            for(TreeNode lnode : leftTree){
                for(TreeNode rnode: rightTree){
                    TreeNode newRoot = new TreeNode(i);
                    newRoot.left = lnode;
                    newRoot.right = rnode;
                    res.add(newRoot);
                }
            }
        }

        return res;
    }
}
