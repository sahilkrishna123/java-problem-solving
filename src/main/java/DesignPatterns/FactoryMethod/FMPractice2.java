package DesignPatterns.FactoryMethod;

public class FMPractice2 {
    public static void main(String[] args){
        String type = "Premium";

        CakeFactory factory = new DolphinFactory();
        Cake cake = factory.createCake(type);

        cake.prepare();
    }
}
abstract class Cake{
    abstract void prepare();
}
class PlainCake extends Cake{
    public void prepare(){
        System.out.println("Preparing Plain Cake");
    }
}
class PlainCakePremium extends Cake{
    public void prepare(){
        System.out.println("Preparing Plain Cake Premium");
    }
}
class DryFruitCake extends Cake{
    public void prepare(){
        System.out.println("Preparing Dry Fruits Cake");
    }
}
class DryFruitCakePremium extends Cake{
    public void prepare(){
        System.out.println("Preparing Dry Fruits Cake Premium");
    }
}
abstract class CakeFactory{
    abstract Cake createCake(String type);
}
class DolphinFactory extends CakeFactory{

    @Override
    Cake createCake(String type) {
        if (type.equals("Premium")) {
            return new PlainCakePremium();
        } else {
            return new PlainCake();
        }
    }
}
class CitiFactory extends CakeFactory{
    @Override
    Cake createCake(String type) {
        if (type.equals("Premium")) {
            return new DryFruitCakePremium();
        } else {
            return new DryFruitCake();
        }
    }
}

