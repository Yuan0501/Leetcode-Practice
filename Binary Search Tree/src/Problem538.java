public class Problem538 {
    public TreeNode convertBST(TreeNode root){
      traver(root);
      return root;
    }
    int sum = 0;
    public void traver(TreeNode root){
        if(root == null){
            return;
        }

        traver(root.right);
        sum += root.val;
        root.val = sum;
        traver(root.left);
    }
}
