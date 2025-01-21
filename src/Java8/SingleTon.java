package Java8;

public class SingleTon {
    private static SingleTon singleTon;
    private SingleTon()
    {

    }
    public SingleTon getSingleTon()
    {
        if(singleTon==null)
        {
            return new SingleTon();
        }
        else
        {
            return singleTon;
        }
    }
}
