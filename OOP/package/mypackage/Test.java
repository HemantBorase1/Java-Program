package mypackage;
import mypackage.Student;
public class Test {

    public static void main(String[] args) {

        Student s = new Student();

         System.out.println(s.id);      // Error

        System.out.println(s.city);
        System.out.println(s.name);
        System.out.println(s.salary);
    }
}