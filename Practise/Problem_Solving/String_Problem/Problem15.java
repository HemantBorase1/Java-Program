class Problem15
{

    public static void main(String[] args)
    {

        String str1="Java";
        String str2="jAva";
        int l1=str1.length();
        int l2=str2.length();
        Boolean b=false;
        if(l1==l2)
        {
        for(int i=0;i<str1.length();i++)
        {
              char c1=str1.charAt(i);
              char c2=str2.charAt(i);
             if(c1==c2)
             {
                    b=true;
             }
             else
             {
                   b=false;
                   break;
              }
        }
        }
       else
       {
            System.out.println("String is Not Exactly Same.");
       }
       if(b)
       {
            System.out.println("String is Exactly Same");
       }
       else
       {
               System.out.println("String is Not Exactly Same.");
        }
     }
}