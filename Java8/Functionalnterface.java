package Java8;

 interface I1 {
    default int calc(int a, int b) {
        return a+b;}
}
 interface I2{
    default int calc(int a, int b) {
        return a-b;}
}
public class Functionalnterface implements I1, I2{
    public static void main(String[] args) {
        Functionalnterface x=new Functionalnterface();
        x.calc(12, 10);

    }

    @Override
    public int calc(int a, int b) {
        return I2.super.calc(a, b);
    }
}