class MainClass
{

    public static void main(String[] args)
    {
 
       Reading r=new Reading();
       Writing w=new Writing();
       Listening l=new Listening();
 
      Thread t1=new Thread(w);
      Thread t2=new Thread(r);
      Thread t3=new Thread(l);

      t1.start();
      t2.start();
      t3.start();
     /*  r.start();
       w.start();
       l.start();
    */
      }
}