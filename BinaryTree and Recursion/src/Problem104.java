public class Problem104 {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDep = maxDepth(root.left);
        int rightDep = maxDepth(root.right);

        return Math.max(leftDep, rightDep) + 1;
    }

}
