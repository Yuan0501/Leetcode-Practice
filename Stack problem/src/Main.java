import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BST tree = new BST();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        System.out.println("preorder using recursion:");
        tree.preOrder(tree.root);

        System.out.println("solusion:");

        Problem199 slu = new Problem199();
        List<Integer> list = slu.rightSideView(tree.root);
        for(int i : list){
            System.out.println(i);
        }



    }
}