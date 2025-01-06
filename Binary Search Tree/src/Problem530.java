public class Problem530 {
    int min = Integer.MAX_VALUE;
    TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root){
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(preNode != null){
            min = Math.min(min, Math.abs(root.val - preNode.val));
        }
        preNode = root;

        inorder(root.right);


    }
}
