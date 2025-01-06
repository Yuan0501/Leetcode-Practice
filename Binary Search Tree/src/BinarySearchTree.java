import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {
        // Root node of the BST
        public TreeNode root;

        // Constructor
        public BinarySearchTree() {
            root = null;
        }

        // Method to add a node to the BST
        public void addNode(Integer val) {
            root = addNodeRec(root, val);
        }

        // Recursive helper method to add a node
        private TreeNode addNodeRec(TreeNode root, Integer val) {
            if (root == null) {
                return new TreeNode(val); // Create a new node
            }

            if (val < root.val) {
                root.left = addNodeRec(root.left, val);
            } else if (val > root.val) {
                root.right = addNodeRec(root.right, val);
            }

            return root;
        }

        // Method for level order traversal
        public void levelOrderTraversal() {
            if (root == null) {
                System.out.println("The tree is empty.");
                return;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                if (current == null) {
                    System.out.print("null ");
                } else {
                    System.out.print(current.val + " ");
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }
            System.out.println();
        }

    // Method to print the tree in order
    public void printInOrder() {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(TreeNode node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.print(node.val + " ");
            printInOrderRec(node.right);
        } else {
            System.out.print("null ");
        }

    }


}
