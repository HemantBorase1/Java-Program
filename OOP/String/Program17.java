class Program17
{

    public static void main(String[] args)
    {
       String s1="hello i am java developer";
       String s2[]=s1.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=s2.length-1;i>=0;i--)
       {
             sb.append(s2[i]);
             if(i>0)
                 sb.append(" ");
       }
       System.out.println(sb+".");
    }
}
/*
Input: hello i am java developer
Output: developer java am i hello.

*/