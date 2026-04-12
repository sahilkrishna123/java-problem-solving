abstract class Factory{
    abstract Burger createBurger(String type);
}
class KingFactory extends Factory{
    @Override
    Burger createBurger(String type){
        if (type == "Standard") {
            System.out.println("Wheat standard burger is prepared by KingFactory");
            return new StandardWheatBurger();
        }
        else{
            System.out.println("Another type");
            return null;
        }
    }
}
class SinghFactory extends Factory{
    @Override
    Burger createBurger(String type){
        if (type == "Standard") {
            System.out.println("Normal standard burger is prepared by SinghFactory");
            return new StandardBurger();
        }
        else{
            System.out.println("Another type");
            return null;
        }
    }
}

abstract class Burger{
    abstract void prepare();
}

class StandardBurger extends Burger{
    @Override
    void prepare(){
        System.out.println("Preparing Standard Normal Burger");
    }
} 

class StandardWheatBurger extends Burger{
    @Override
    void prepare(){
        System.out.println("Preparing Wheat Standard Burger");
    }
}


public class FactoryMethod {
    public static void main (String[] args){
        String type = "Standard";

        Factory myFactory = new SinghFactory();

        Burger burger = myFactory.createBurger(type); 
        
        burger.prepare();
        

    }
}
