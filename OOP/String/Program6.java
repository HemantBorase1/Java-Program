class Program6
{

    public static void main(String[] args)
    {
       String s1="International";
       StringBuilder sb=new StringBuilder();
       int count=s1.length();
       for(int i=0;i<s1.length();i++)
       {
              sb.append(count--);
              sb.append(s1.charAt(i));
       }
     System.out.println(sb);
    }
}