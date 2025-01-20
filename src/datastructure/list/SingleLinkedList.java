package datastructure.list;

class Node{
     int data;
     Node next;
     Node(int data)
    {
        this.data=data;
        this.next = null;
    }

}
public class SingleLinkedList {

    Node head;

    public void add(int data)
    {
        if(head==null)
        {
            head=new Node(data);;
        }
        else {
            Node node=head;
            while(node.next!=null)
            {
                node=node.next;
            }
            Node node1 = new Node(data);
            node.next=node1;
        }

    }
    public void traverse()
    {
        Node node= head;
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public void search(int value)
    {
        Node node = head;
        int count=0;
        while(node!=null)
        {
            if(node.data==value)
            {
                System.out.println("found the element at " +count+ " position");
                return;
            }
            count++;
            node=node.next;
        }
        System.out.println("did not find element at any position ");
    }
    public int length()
    {
        int count=0;
        Node node = head;
        while(node!=null)
        {
            node=node.next;
            count++;
        }
        return count;
    }
    public void insertAtBeginning(int data)
    {
      Node node = new Node(data);
      node.next=head;
      head=node;

    }
    public void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head=node;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }
    public void insertAtPosition(int position,int data)
    {
        Node node = new Node(data);

        if(position==0)
        {
           node.next=head;
           head=node;
        }
        else {
            Node currentNode = head;
            int count = 0;
            while (currentNode != null) {
                if (count == position-1) {
                    Node nextNode = currentNode.next;
                    currentNode.next = node;
                    node.next = nextNode;
                }
                currentNode = currentNode.next;
                count++;
            }
        }
    }

    public void deleteAtBeginning()
    {
        head=head.next;
    }
    public void deleteAtEnd()
    {
        Node node  = head;
        while(node.next!=null)
        {
            if(node.next.next!=null) {
                node = node.next;
            }
            else {
                node.next=null;
                break;
            }
        }
    }
    public void deleteAtPosition(int position)
    {
        int count=0;
        Node node = head;
        if(position==0)
        {
            head=head.next;
        }
        while(node.next!=null)
        {
            if(count==position-1)
            {
                node.next=node.next.next;
                break;
            }
            node=node.next;
            count++;
        }
    }
    public static void main(String[] args) {
        SingleLinkedList traversalLinkedList = new SingleLinkedList();
        traversalLinkedList.add(2);
       traversalLinkedList.add(4);
         traversalLinkedList.add(6);
        traversalLinkedList.add(8);
        traversalLinkedList.add(7);
      //  traversalLinkedList.traverse();
       // traversalLinkedList.search(6);
       // System.out.println(traversalLinkedList.length());
       // traversalLinkedList.insertAtBeginning(32);
      //  System.out.println("after insertion");
      //  traversalLinkedList.traverse();
       // traversalLinkedList.insertAtEnd(43);
       // System.out.println("after end insertion");
       // traversalLinkedList.traverse();
     //   traversalLinkedList.insertAtPosition(2,55);
      //  System.out.println("at position");
       // traversalLinkedList.traverse();
       // traversalLinkedList.deleteAtBeginning();
       // System.out.println("after first deletion");
       // traversalLinkedList.traverse();
  /*      traversalLinkedList.deleteAtEnd();
        System.out.println("after delete at end");
        traversalLinkedList.traverse();*/
        traversalLinkedList.deleteAtPosition(0);
        traversalLinkedList.traverse();
    }

}
