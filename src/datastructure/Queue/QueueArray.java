package datastructure.Queue;


import java.util.*;

public class QueueArray {

    int[] queue;
    int size,front,rear=0;
    int capacity=16;
    public QueueArray()
    {
        queue = new int[capacity];
    }
    public QueueArray(int capacity)
    {

        this.capacity=capacity;
        queue = new int[capacity];
        Integer[] boxedArray = Arrays.stream(queue).boxed().toArray(Integer[]::new);

        // Sorting in reverse order
        Arrays.sort(boxedArray, Comparator.reverseOrder());
    }
    public boolean enqueue(int value)
    {
        if(size==capacity)
        {
            enLarge();
            //System.out.println("queue is full");
            //return false;
        }
            queue[rear%capacity]=value;
            rear=rear%capacity+1;
            size++;

        return true;
    }
    public int deque()
    {
        if(size==0)
        {
            System.out.println("queue is empty");
        }
        else {
            int result = queue[front];

            queue[front%capacity]=0;
            front=front%capacity+1;
            size--;
           return result;
        }
        return 0;
    }
    public int size()
    {
        return size;
    }
    public int[] getData()
    {
        return queue;
    }
    private void enLarge()
    {
        capacity  =capacity<<1;
        int growingQueue[] = new int[capacity];
        int i=0;
        for(int a:queue)
        {
            if(i==front)
            {
                break;
            }
            growingQueue[i]=a;
            i++;

        }
        for(int j=front;j<size;j++)
        {
            growingQueue[j]=queue[j];
        }
        rear=size;
        front =0;
        queue=growingQueue;
        System.out.println("enLarge capacity "+capacity);

    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(6);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        queue.enqueue(10);
        queue.enqueue(13);
        queue.enqueue(15);
        queue.enqueue(17);
        queue.enqueue(19);
       // System.out.println(queue.size());
        System.out.println("==================");
        Arrays.stream(queue.getData()).forEach(System.out::println);
        System.out.println("==================");
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
       System.out.println(queue.deque());
        System.out.println(queue.size());
    }
}
