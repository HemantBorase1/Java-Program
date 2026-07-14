class Problem3
{

     public static void main(String[] args)
     {
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           char c=str.charAt(i);
           rev+=c;
        }
        System.out.println(str+"\t"+rev);
        if(rev.equals(str))
        {
              System.out.println("String is Palindrome");
        }
        else
        {
             System.out.println("Not Palindrome");
        }
     }
}