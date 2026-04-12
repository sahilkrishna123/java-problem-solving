package Lambda;

interface A{
    default void sayHello(){
        System.out.println("Hello from A");
    }
}
interface B{
    default void sayHello(){
        System.out.println("Hello from B");
    }
}


public class DefaultMethods implements A,B{
    public static void main(String[] args){
        DefaultMethods obj = new DefaultMethods();
        obj.sayHello();
    }
    @Override
    public void sayHello(){
        B.super.sayHello();
    }
}
