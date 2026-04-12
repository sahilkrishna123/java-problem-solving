public class FactoryMethodPractice {

    public static void main(String[] args){
        String type = "Basic";
//        ZingerBurgerFactory factory = new DeewanFactory();

        ZingerBurgerFactory factory = new SindhFactory();

        ZingerBurger burger = factory.createBurger(type);

        burger.prepare();
    }
}

// Product: Burger
abstract class ZingerBurger{
    abstract void prepare();
}

class BasicCheeseZingerBurger extends ZingerBurger{
    @Override
    public void prepare(){
        System.out.println("Preparing Basic Cheese Zinger Burger");
    }
}
class PremiumCheeseZingerBurger extends ZingerBurger{
    @Override
    public void prepare(){
        System.out.println("Preparing Premium Cheese Zinger Burger");
    }
}
class BasicCreamyZingerBurger extends ZingerBurger{
    @Override
    public void prepare(){
        System.out.println("Preparing Basic Creamy Zinger Burger");
    }
}
class PremiumCreamyZingerBurger extends ZingerBurger{
    @Override
    public void prepare(){
        System.out.println("Preparing Premium Creamy Zinger Burger");
    }
}

// Factory
abstract class ZingerBurgerFactory{
    abstract ZingerBurger createBurger(String type);
}

class SindhFactory extends ZingerBurgerFactory{
    public ZingerBurger createBurger(String type){
        if(type.equals("Basic")){
            System.out.println("Burger is to be prepared by Sindh Factory");
            return new BasicCheeseZingerBurger();
        }
        else if(type.equals("Premium")){
            System.out.println("Burger is to be prepared by Sindh Factory");
            return new PremiumCheeseZingerBurger();
        }
        else {
            System.out.println("Invalid burger choice.");
            return null;
        }
    }
}
class DeewanFactory extends ZingerBurgerFactory{
    public ZingerBurger createBurger(String type){
        if(type.equals("Basic")){
            System.out.println("Burger is to be prepared by Deewan Factory");
            return new BasicCreamyZingerBurger();
        }
        else if(type.equals("Premium")){
            System.out.println("Burger is to be prepared by Deewan Factory");
            return new PremiumCreamyZingerBurger();
        }
        else {
            System.out.println("Invalid burger choice.");
            return null;
        }
    }
}