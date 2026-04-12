package Lambda;

public class Threads {
    public static void main(String[] args){
        Runnable runnable = () -> {
            for(int i=1; i<=10; i++){
                System.out.println("Child Thread " + i);
            }
        };
        Thread childThread = new Thread(runnable);
        childThread.run();
        for(int i=1; i<=10; i++){
            System.out.println("Main Thread " + i);
        }

    }
}
