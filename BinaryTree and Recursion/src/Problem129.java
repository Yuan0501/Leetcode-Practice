//Time complexity: O(N)
//Space complexity: O(H)
public class Problem129 {
    int rootToLeaf = 0;
    public int sumNumbers(TreeNode root){
        traverseTree(root, 0);
        return rootToLeaf;

    }

    private void traverseTree(TreeNode root, int curNum){
        if(root != null){
            curNum = curNum * 10 + root.val;
            if(root.left == null && root.right == null){
                rootToLeaf += curNum;
            }

            traverseTree(root.left, curNum);
            traverseTree(root.right, curNum);
        }
    }
}
