public class SingletonPractice {
    public static void main(String[] args){
        System.out.println("");
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1==s2);
    }
}

class Singleton1{
    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
            return instance;
        }
        else{
            return instance;
        }

    }


}
class Singleton2{
    private static Singleton2 instance;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if ( instance == null){
            instance  = new Singleton2();
        }
        return instance;
    }
}