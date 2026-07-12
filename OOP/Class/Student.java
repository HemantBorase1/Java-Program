class Student
{
     public int id;
     public String name;
     public String address;
     public double CGPA;

     Student()
     {
          id=1;
          name="OM";
          address="Pune";
          CGPA=10;
        //  display();
     }
     Student(int id,String name){
         this.id=id;
         this.name=name;
     }
     Student(int id,String name,String address,double CGPA)
     {
         this.id=id;
         this.name=name;
         this.address=address;
         this.CGPA=CGPA;
     }
     void display()
     {
         System.out.println(id+"\t"+name+"\t"+address+"\t"+CGPA);
     }
 
}