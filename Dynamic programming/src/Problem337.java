//Time complexity:O(N)
//Space complesity: O(N) stack of deep of the tree
public class Problem337 {

    public int[] generateRob(TreeNode root){
        if (root == null){
            return new int[]{0, 0};
        }

        int[] left = generateRob(root.left);
        int[] right = generateRob(root.right);

        int rob = root.val + left[0] + right[0];
        int nonRob = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        return new int[]{nonRob, rob};
    }
    public int rob(TreeNode root){
        int[] robArr = generateRob(root);
        return Math.max(robArr[0],robArr[1]);
    }
}
