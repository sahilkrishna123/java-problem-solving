package Lambda;

public class AnonymousInnerClass {
    public static void main(String[] args){
        Employee1 employee1 = new Employee1() {
            @Override
            public void getSalary() {
                System.out.println("Salary is 100000");
            }
        };
        employee1.getSalary();
    }
}

interface Employee1{
    public void getSalary();
}