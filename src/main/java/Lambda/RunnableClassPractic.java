package Lambda;

public class RunnableClassPractic {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();

        // Using Lambda Expression
//        Runnable runnable = () -> {
//            System.out.println("Runnable class called using Lambda");
//        };
        Thread thread1 = new Thread(() -> {
            System.out.println("Runnable class called using Lambda");
        });
        thread1.run();
    }
}

class MyClass implements Runnable{
    @Override
    public void run(){
        System.out.println("My class is called");
    }
}