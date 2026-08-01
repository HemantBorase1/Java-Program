class Problem24
{

      public static void main(String [] args)
      {
           String str="interview";
           char found=' ';
           for(int i=0;i<str.length();i++)
           {
                 char c=str.charAt(i);
                 for(int j=i+1;j<str.length();j++)
                 {
                      if(c==str.charAt(j))
                      {
                          found=c;
                          break; 
                      }
                 }
           }
           System.out.println(found);
      }
}