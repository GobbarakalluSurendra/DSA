import java.util.*;

class Pair<F, S> {
    F first;
    S second;

    Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

class MinStack {
    Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair<>(val, val));
        } else {
            int currentMin = stack.peek().second;
            stack.push(new Pair<>(val, Math.min(val, currentMin)));
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek().first;
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.peek().second;
        }
        throw new RuntimeException("Stack is empty");
    }
}