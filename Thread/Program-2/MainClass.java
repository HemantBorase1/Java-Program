class MainClass
{

    public static void main(String[] args)
    {
            Site s=new Site();
            User u1=new User(s);
            User u2=new User(s);
            User u3=new User(s);
  
           Thread t1=new Thread(u1);
           Thread t2=new Thread(u2);
           Thread t3=new Thread(u3);

           t1.setName("Pratik");
           t2.setName("Hemant");
           t3.setName("PD");
   
           t2.setPriority(10);
           t1.setPriority(6);
           t3.setPriority(4);
           t1.start();
           t2.start();
           t3.start();
    }
}