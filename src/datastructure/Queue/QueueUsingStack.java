package datastructure.Queue;

import java.util.Collections;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack;
    Stack<Integer> stack1 = new Stack<>();
    int front,rear;
    int size;
    public QueueUsingStack()
    {
        stack = new Stack<>();
    }

    public void enqueue(int value)
    {
        stack.push(value);
    }
    public int deque()
    {
        if (stack1.isEmpty()) {
        while(!stack.isEmpty())
        {

            stack1.push(stack.pop());
        }
        }

       return stack1.pop();
    }
    public int size()
    {
        return stack.size();
    }
    public void printValues()
    {

    System.out.println("===========================================");
        stack1.stream().forEach(System.out::println);
    stack.stream().forEach(System.out::println);

        System.out.println("===========================================");
    }
    public static void main(String[] args){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println("deque "+queue.deque());
        System.out.println("deque "+queue.deque());
        System.out.println("deque "+queue.deque());
        System.out.println("deque "+queue.deque());
        queue.printValues();
        queue.enqueue(43);
        queue.printValues();
        queue.enqueue(81);
        queue.enqueue(91);
    System.out.println(queue.deque());
    queue.printValues();
    System.out.println(queue.deque());
    }
}
