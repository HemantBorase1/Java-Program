class Demo1
{

    int a=125;
    void display(){System.out.println("Display Method of Demo1");}
}
class Demo2 extends Demo1
{

   int a=250;
   void display()
   {
    
       System.out.println("Display Method of Demo2");
       System.out.println(this.a);
    }
}
class Demo3 extends Demo2
{
  
   int a=500;
   void display()
   {
      
        System.out.println("Display Method of Demo3");
        System.out.println(super.a);
   }
}