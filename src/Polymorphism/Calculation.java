package Polymorphism;

public class Calculation {
    public void sum(){
        System.out.println("sum()");
    }
    public void sum(int val1){
        System.out.println("sum(int)");
    }
    public void sum(int val1,int val2){
        System.out.println("sum(int,int)");
    }
    public void sum(float num1,int val2){
        System.out.println("sum(float,int)");
    }
    public void sum(int val1, float num1){
        System.out.println("sum(int,float)");

    }

    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        calculation.sum();
        calculation.sum(1);
        calculation.sum(22,33);
        calculation.sum(1.1f,11);
        calculation.sum(22,2.2f);
    }
}
