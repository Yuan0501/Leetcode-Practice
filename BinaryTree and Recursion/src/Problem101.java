//Time complexity: O(n)
//Space complexity: O(N)
public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left == null || root.right == null){
            return false;
        }

        if(root.left.val != root.right.val){
            return false;
        }


        return isSymmetric(root.left, root.right);


    }

    private boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if((left.left == null && right.right != null)||(left.left != null && right.right == null)){
            return false;
        }

        if((left.right == null && right.left != null)||(left.right != null && right.left == null )){
            return false;
        }

        if(left.left != null && right.right != null && left.left.val != right.right.val){
            return false;
        }
        if(left.right != null && right.left != null && left.right.val != right.left.val){
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);

    }
}
