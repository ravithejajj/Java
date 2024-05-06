package datastructure.Queue;

import java.util.List;

public class QueueListNode {
ListNode listNode;
int capacity=16;
int size=0;
     ListNode front,rear;
    public QueueListNode()
    {
       // listNode = new ListNode(capacity);
    }
    public QueueListNode(int capacity)
    {
        this.capacity=capacity;
       // listNode = new ListNode(capacity);
    }
    public int size()
    {
        return size;
    }
    public void enQueue(int value)
    {

        ListNode head = listNode;
        front=listNode;
        if(listNode==null)
        {
            listNode=new ListNode(value);
        }
        else {
            while (head.next != null) {
                head=head.next;
            }
            head.next=new ListNode(value);
            rear=head.next;
        }
    size++;
    }
    public int deQueue()
    {
        int result=front.val;
        front = front.next;
        listNode = listNode.next;
        size--;
        return result;
    }
    public void getData(){
        ListNode data = listNode;
        while(data!=null)
        {
            System.out.println(data.val);
            data=data.next;
        }
    }

    public static void main(String[] args) {
        QueueListNode queueListNode = new QueueListNode();
        queueListNode.enQueue(5);
        queueListNode.enQueue(4);
        queueListNode.enQueue(3);
        queueListNode.enQueue(7);
        queueListNode.enQueue(9);
        queueListNode.enQueue(0);
      queueListNode.getData();
        System.out.println("deQueue Value: " +queueListNode.deQueue());
        System.out.println("deQueue Value: " + queueListNode.deQueue());
        System.out.println("size :" + queueListNode.size());
        queueListNode.getData();
        queueListNode.enQueue(77);
        queueListNode.enQueue(67);
        System.out.println("size :" + queueListNode.size());
        queueListNode.getData();
    }
}

 class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
