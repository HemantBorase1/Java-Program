class Problem30
{

     public static void main(String[] args)
     {
         String str="swiss";
         char found='\0';
         for(int i=0;i<str.length();i++)
         {
              char c=str.charAt(i);
              int count=0;
              for(int j=0;j<str.length();j++)
              {
                   if(c==str.charAt(j))
                   {
                     count++;
                    }
               
              }
              if(count==1){
                  found=c;  
                  break;
                 }
         }
         System.out.println(found);
     }
}