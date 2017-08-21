package Polymorphism;

class A{
    public void show(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void show()
    {
        System.out.println("Class B");
    }
}
public class OverRiding {
    public static void main(String[] args) {

        // Upcasting
        A obj1=new A();
        obj1.show();
        obj1=new B();
        obj1.show();

        // downcasting
        B obj2=new B();
        obj2.show();
        obj2=(B)new A();    //Type cast  and error
        obj2.show();
    }
}
