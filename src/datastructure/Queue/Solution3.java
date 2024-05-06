package datastructure.Queue;

class Solution3 {
    public static void main(String[] args) {
       int count =  longestCommonSubsequence("bbbb","bbbb");
        System.out.println(count);
    }
    public static int longestCommonSubsequence(String text1, String text2) {

        int[][] lcm = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++)
        {

            for(int j=1;j<=text2.length();j++)
        {

        if(text1.charAt(i-1)==text2.charAt(j-1))
        {

            lcm[i][j]=1+lcm[i-1][j-1];
        }
        else
        {

            lcm[i][j]=Math.max(lcm[i-1][j],lcm[i][j-1]);
        }
        }
        }
        return lcm[text1.length()][text2.length()];
    }
}