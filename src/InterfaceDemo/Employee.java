package InterfaceDemo;

public class Employee implements Rules {
    @Override
    public void swapCard() {
        System.out.println("Swipe from Employee");
    }

    @Override
    public void calculateSalary() {
        System.out.println("calculate from employee");
    }

    public void showDetails()
    {
        System.out.println("Show employee details");
    }
}
