package Java8;

public interface A {
  public void print();
}

 interface B{
  public void  print();
}
interface Z extends A,B
{
    @Override
    void print();
}
