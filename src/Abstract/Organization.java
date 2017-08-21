package Abstract;

abstract class Person{
    private String name;
    private String gender;

    Person(String name,String gender){
        this.name=name;
        this.gender=gender;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Name="+name+" Gender="+gender;
    }
}
class Student extends Person{
    private int StudentId;
    Student(String name,String gender,int id)
    {
        super(name,gender);
        this.StudentId=id;
    }
    @Override
    public void work() {
        if(StudentId==0){
            System.out.println("Student Not working");

        }
        else
            System.out.println("Student Working");

    }
}
class Employee extends Person{
    private int empid;

    Employee(String nm,String gen,int id)
    {
        super(nm,gen);
        this.empid=id;
    }

    @Override
    public void work() {
        if(empid==0){
            System.out.println("Employee Not working");

        }
        else
            System.out.println("Employee Working");

    }

}
public class Organization{

    public static void main(String[] args) {

        Person student=new Student("Shubham","male",0);
        Person employee=new Employee("xyz","male",123);

        System.out.println(student);
        student.work();
        System.out.println(employee);
        employee.work();



    }
}
