public class Problem112 {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null && targetSum == 0){
            return true;
        }else if(root == null && targetSum != 0){
            return false;
        }

       return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);


    }
}
