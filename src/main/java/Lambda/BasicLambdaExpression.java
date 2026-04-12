package Lambda;

public class BasicLambdaExpression {

    public static void main(String[] args) {
        // Ordinary Method
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());

        // Using Functional Interface and Lambda Expressions
        Employee employee = () -> "sahil krishna";
        System.out.println(employee.getName());
    }
}
