class MainClass
{

     public static void main(String[] args)
     {
           Site s=new Site();
           User u1=new User(s);
           User u2=new User(s);
           User u3=new User(s);

           Thread T1=new Thread(u1);
           Thread T2=new Thread(u2);
           Thread T3=new Thread(u3); 
 
           T1.setName("Pratik");
           T2.setName("PD");
           T3.setName("Hemant");
         
           T1.start();
           T2.start();
           T3.start();
     }
}