package datastructure.Arrays;

public class LeaderElements {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 2};
        LeaderElements leaderElements = new LeaderElements();
        leaderElements.getLeaderElements(a);
    }
    public void getLeaderElements(int[] a)
    {
        int length = a.length;
        String  s=a[length-1]+"";
        int max=a[length-1];
        for(int i=length-1;i>0;i--)
        {
          max=Math.max(max,a[i]);
          s=max+", "+s;
        }
    System.out.println(s);
    }
}
