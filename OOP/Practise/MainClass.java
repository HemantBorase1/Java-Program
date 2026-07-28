class Demo
{
    int a=10;
    void display(Demo Obj)
    {
        System.out.println("Display Method of Demo.");
        System.out.println(Obj);
        System.out.println(this.a);
    }

}
class MainClass 
{

     public static void main(String args[])
     {
          Demo d1=new Demo();
          System.out.println(d1);
          d1.display(d1);
         
     }
}