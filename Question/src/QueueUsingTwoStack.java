//https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {

    }
}

class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception{
        while (!first.isEmpty()){
            int popped = first.pop();
            second.push(popped);
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            int popped = second.pop();
            first.push(popped);
        }
        return removed;
    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            int popped = first.pop();
            second.push(popped);
        }
        int peeked = second.pop();
        while(!second.isEmpty()){
            int popped = second.pop();
            first.push(popped);
        }
        return peeked;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}