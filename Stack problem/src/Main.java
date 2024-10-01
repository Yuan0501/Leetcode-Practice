import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BST tree = new BST();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        Problem98 slu = new Problem98();
        System.out.println(slu.isValidBST(tree.root));
//        tree.add(4);
//        tree.add(5);
//        System.out.println("preorder using recursion:");
//        tree.preOrder(tree.root);
//
//        System.out.println("solusion:");
//
//        Problem199 slu = new Problem199();
//        List<Integer> list = slu.rightSideView(tree.root);
//        for(int i : list){
//            System.out.println(i);
//        }

//        MaxHeap<Integer> heap = new MaxHeap<>();
//        heap.add(3);
//        heap.add(1);
//        heap.add(5);
//        heap.add(8);
//
//        while(!heap.isEmpty()){
//            System.out.println(heap.removeMax());
//        }

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(3);
//        pq.add(5);
//        pq.add(10);
//        pq.add(1);
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.remove());
//        }


    }
}