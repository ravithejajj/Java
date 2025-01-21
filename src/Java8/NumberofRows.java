package Java8;

public class NumberofRows {

    public static void main(String[] args){
    printNumbers(5);
    }

    private static void printNumbers(int num)
    {
        int count=2;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {

                System.out.print((i+j)*2);
                count=count+2;
            }
            System.out.println();
        }
    }
}
