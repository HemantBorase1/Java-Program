class Problem2
{

     public static void main(String[] args){
           
         String str="Hello";
         String rev="";
         for(int i=str.length()-1;i>=0;i--)
         {
                char c=str.charAt(i);
                rev+=c;
         }
         System.out.println(rev);
     }
}