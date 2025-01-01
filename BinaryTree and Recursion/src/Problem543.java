public class Problem543 {
    int max;
    public int diameterOfBinaryTree(TreeNode root){
        max = 0;
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDep = maxDepth(root.left);
        int rightDep = maxDepth(root.right);
        max = Math.max(max, leftDep + rightDep);
        return Math.max(leftDep, rightDep) + 1;
    }
}
