class Problem6
{

  public static void main(String[] args)
  {
       String str="Developer";
       int count=0;
       for(int i=0;i<str.length();i++)
       {
           count++;
       }
      System.out.println("Total Length of String:"+count);
  }
}

/*
Error:
Error: Could not find or load main class Promblem6
Caused by: java.lang.ClassNotFoundException: Promblem6

*/