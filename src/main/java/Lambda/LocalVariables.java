package Lambda;
// Local variables and instance variables
public class LocalVariables {
    public static void main(String[] args) {
        int localVar = 9;

        Employee3 employee = () -> {
//            final int localVar = 9; // Throw error.
            return "Employee 1: salary is 100 " + localVar;
        };

        System.out.println(employee.getSalary());
        // Inner class:
        doSomething();
    }
    // Inner anonymous class:
    private static void doSomething() {
        Employee3 employee2 = new Employee3() {
            int instanceVar = 4;
            @Override
            public String getSalary() {
                int localVar = 5;
                return "Employee 2: salary is 2000 " + this.instanceVar + " " + localVar;
            }
        };

        System.out.println(employee2.getSalary());
    }
}

interface Employee3 {
    public String getSalary();
}
