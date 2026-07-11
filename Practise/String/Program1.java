class Program1{

      public static void main(String[] args){
           String s1=new String("Durga");
           String s2=new String("Durga");
           s1.concat("Solution");
           s1=s1.concat("Software");
           System.out.println(s1);
           System.out.println(s1==s2);
           System.out.println(s1.equals(s2));
      }
}

/* Output:

DurgaSoftware



*/