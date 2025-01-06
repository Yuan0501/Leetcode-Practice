public class Problem669 {
    public TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null){
            return null;
        }
        if(root.val < low){
            return trimBST(root.right, low, high);
        }
        if(root.val > high){
            return root.left;
        }
        TreeNode left = trimBST(root.left, low, high);
        TreeNode right = trimBST(root.right, low, high);
        root.left = left;
        root.right = right;
        return root;
    }
}
