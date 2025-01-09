import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Problem739 slu = new Problem739();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] res = slu.dailyTemperatures(temperatures);
        for(int i : res){
            System.out.print(i + " ");
        }


    }
}