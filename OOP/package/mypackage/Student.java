package mypackage;
public class Student {

    private int id = 101;
    String city = "Pune";
    protected String name = "Rahul";
    public double salary = 50000;

    public void display() {
        System.out.println(id);
        System.out.println(city);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.id);
        System.out.println(s.city);
        System.out.println(s.name);
        System.out.println(s.salary);
    }
}