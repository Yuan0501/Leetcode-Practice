public class Problem617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return null;
        }

        if (root1 == null && root2 != null) {
            return root2;
        } else if (root1 != null && root2 == null) {
            return root1;
        }
        TreeNode node = new TreeNode(root1.val + root2.val);
        TreeNode left = mergeTrees(root1.left, root2.left);
        TreeNode right = mergeTrees(root1.right, root2.right);
        node.left = left;
        node.right = right;
        return node;


    }
}
