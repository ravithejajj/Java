package datastructure.list;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public void add(int data)
    {
        if(head==null)
        {
            head= new Node(data);
        }else{
            Node node=head;
            while(node.nextNode!=null)
            {
                node=node.nextNode;
            }
            Node currentNode= new Node(data);
            node.nextNode=currentNode;
            currentNode.previousNode=node;
            tail=currentNode;
        }

    }
    public void iterate()
    {
        Node node = head;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.nextNode;
        }
    }
    public void iterateBackWord()
    {
        Node node = tail;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.previousNode;
        }
    }
    public int length()
    {
        int count=0;
        Node node=head;
        while(node!=null)
        {
            node=node.nextNode;
            count++;
        }
     return count;
    }
    public void insertBeginningOfList(int data)
    {
        Node node = head;
        Node currentNode = new Node(data);
        currentNode.nextNode=node;
        node.previousNode=currentNode;
        head = currentNode;

    }
    public void insertEndOfList(int data)
    {
        Node node = tail;
        Node currentNode = new Node(data);
       node.nextNode=currentNode;
     currentNode.previousNode=node;
        tail = currentNode;
    }
    public void insertAtPosition(int data,int position)
    {
        int count=0;

        if(position==0)
        {
            Node node= new Node(data);
            node.nextNode=head;
            head.previousNode=node;
            head=node;
            return;
        }
        Node node= head;
      while(node!=null)
      {
          if(count==position-1)
      {
           Node currentNode= new Node(data);
           Node nextNode = node.nextNode;
           node.nextNode=currentNode;
           currentNode.nextNode=nextNode;
           currentNode.previousNode=node;
           nextNode.previousNode=currentNode;
      }
          node=node.nextNode;
          count++;
      }
    }
    public static void main(String[] args){

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(3);
        doubleLinkedList.add(13);
        doubleLinkedList.add(2);
        doubleLinkedList.add(5);
        doubleLinkedList.add(7);
        doubleLinkedList.insertBeginningOfList(34);
        doubleLinkedList.insertEndOfList(455);
        doubleLinkedList.insertAtPosition(2,2);
    System.out.println("forward direction");
        doubleLinkedList.iterate();
    System.out.println("back work direction");
        doubleLinkedList.iterateBackWord();
    System.out.println("length : "+ doubleLinkedList.length());


    }


    class Node{
        Node previousNode;
        Node nextNode;
        int data;
        Node(int data)
        {
            this.data=data;
            this.nextNode=null;
            this.previousNode=null;
        }

    }
}


