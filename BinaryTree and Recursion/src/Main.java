import java.util.List;

public class Main {
    public static void main(String[] args) {
        BT bt = new BT();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(15);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node8 = new TreeNode(7);
//        TreeNode node9 = new TreeNode(2);
//        TreeNode node10 = new TreeNode(0);
//        TreeNode node11 = new TreeNode(0);
//        TreeNode node12 = new TreeNode(5);
//        TreeNode node13 = new TreeNode(1);

        bt.addNode(node1);
        bt.addNode(node2);
        bt.addNode(node3);
        bt.addNode(node4);
        bt.addNode(node5);
//        bt.addNode(node6);
//        bt.addNode(node7);
//        bt.addNode(node8);
//        bt.addNode(node9);
//        bt.addNode(node10);
//        bt.addNode(node11);
//        bt.addNode(node12);
//        bt.addNode(node13);

        bt.levelTraversal(bt.root);
        System.out.println();

        Problem404 slu = new Problem404();
        System.out.println(slu.sumOfLeftLeaves(bt.root));
//        Problem101 slu = new Problem101();
//        System.out.println(slu.isSymmetric(bt.root));
//        Problem222 slu = new Problem222();
//        System.out.println("solution"+slu.countNodes(bt.root));
//        Problem257 slu = new Problem257();
//        System.out.println(slu.binaryTreePaths(bt.root));
//        Problem113 slu = new Problem113();
//        List<List<Integer>> res = slu.pathSum(bt.root, 22);
//        for(List<Integer> lst: res){
//            System.out.println("result" + lst);
//        }



    }
}