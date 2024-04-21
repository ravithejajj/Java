package Queue;

import java.util.Arrays;

public class StackArray {
    int[] stack ;
    int size =0,top=-1;
    int capacity=16;
    public StackArray(){
      stack =   new int[capacity];
    }
    public StackArray(int capacity)
    {
        this.capacity=capacity;
        stack = new int[capacity];
    }
    public int size()
    {
        return size();
    }
    public void push(int value)
    {
        if(size==capacity)
        {
          enLarge();
        }
        top++;
        stack[top]=value;
        size++;
    }
    public int pop()
    {
        if(size==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value = stack[top];
        stack[top]=-1;
        top--;
        size--;
        return value;
    }
    public void printStack()
    {
        Arrays.stream(stack).forEach(System.out::println);
    }
    private void enLarge()
    {
        capacity = capacity<<1;
        int[] newStack = new int[capacity];
        for(int i=0;i<size;i++)
        {
            newStack[i]=stack[i];
        }
        for(int i=size;i<capacity;i++)
        {
            newStack[i]=-1;
        }
        stack  =newStack;
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(6);
        stackArray.push(12);
        stackArray.push(13);
        stackArray.push(14);
        stackArray.push(15);
        stackArray.push(16);
        stackArray.push(17);
        stackArray.push(18);
        System.out.println("pop"+ stackArray.pop());
        System.out.println("pop"+ stackArray.pop());
        System.out.println("pop"+ stackArray.pop());
        stackArray.push(54);
        stackArray.printStack();
    }

}
