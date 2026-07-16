class Problem8
{

     public static void main(String[] args)
     {
          String str="Java Full Stack Developer";
          String newStr="";
          for(int i=0;i<str.length();i++)
          {
                char c=str.charAt(i);
                if(c==' ')
                {
                    newStr+='-';
                }
                else{
                  newStr+=c;
                 }
          }
          System.out.println(newStr);
     }
}