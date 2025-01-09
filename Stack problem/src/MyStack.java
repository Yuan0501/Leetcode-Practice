
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> in;
    Queue<Integer> out;

    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    public void push(int x) {
        while (!in.isEmpty()) {
            out.add(in.remove());
        }
        in.add(x);
        while (!out.isEmpty()){
            in.add(out.remove());
        }
    }


    public int pop() {
        return in.remove();
    }

    public int top() {
        return in.peek();
    }

    public boolean empty() {
        return in.isEmpty();
    }
}
