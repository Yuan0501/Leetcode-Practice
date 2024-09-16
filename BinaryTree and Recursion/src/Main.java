
public class Main {
    public static void main(String[] args) {
        BT bt = new BT();
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(-1);
        TreeNode node5 = new TreeNode(-1);
        TreeNode node6 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        bt.addNode(node1);
        bt.addNode(node2);
        bt.addNode(node3);
        bt.addNode(node4);
        bt.addNode(node5);
        bt.addNode(node6);
        bt.addNode(node7);

        bt.levelTraversal(bt.root);



    }
}