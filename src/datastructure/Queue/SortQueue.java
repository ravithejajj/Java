package datastructure.Queue;

import java.util.*;

public class SortQueue {
    public static void main(String args[])
    {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(7);
        queue.add(2);
    //    int j=queue.size();
        stack.push(queue.poll());
        while(!queue.isEmpty()) {

            while (!queue.isEmpty())
            {
                if (queue.peek() < stack.peek()) {
                    queue1.add(stack.pop());
                    stack.push(queue.poll());
                }
                else {
                    queue1.add(queue.poll());
                }
               // i++;
            }
            queue=queue1;


        }

        System.out.println(queue1);

    }

}
