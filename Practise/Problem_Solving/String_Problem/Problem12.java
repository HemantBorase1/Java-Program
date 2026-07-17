class Problem12
{

     public static void main(String[] args)
     {
            String s1="ABCD";
            String s2="CDAB";
            if(s1.length()==s2.length()&&(s1+s2).contains(s2))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
     }
}