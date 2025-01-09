import java.util.Stack;

public class MyQueue {
    Stack<Integer> bottom;
    Stack<Integer> top;
    public MyQueue() {
        bottom = new Stack<>();
        top = new Stack<>();
    }

    public void push(int x) {
        bottom.push(x);
    }

    public int pop() {
     bottomToTop();
     return top.pop();
    }

    private void bottomToTop(){
        if(top.isEmpty()) {
            while (!bottom.isEmpty()) {
                top.push(bottom.pop());
            }
        }
    }

    public int peek() {
        bottomToTop();
        return top.peek();
    }

    public boolean empty() {
        return bottom.isEmpty() && top.isEmpty();
    }
}
