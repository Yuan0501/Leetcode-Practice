
public class Main {
    public static void main(String[] args) {
        BT bt = new BT();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);

        bt.addNode(node1);
        bt.addNode(node2);
        bt.addNode(node3);
        bt.addNode(node4);
        bt.addNode(node5);
        bt.addNode(node6);
        bt.addNode(node7);

        bt.levelTraversal(bt.root);

//        Problem101 slu = new Problem101();
//        System.out.println(slu.isSymmetric(bt.root));
        Problem222 slu = new Problem222();
        System.out.println("solution"+slu.countNodes(bt.root));



    }
}