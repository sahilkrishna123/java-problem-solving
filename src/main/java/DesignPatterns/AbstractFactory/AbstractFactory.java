package DesignPatterns.AbstractFactory;
// /////////////////////////
// 8 products

    // Dolphin Factory
// Cake
// 1 Plain Cake
// 1 DryFruit Cake

// Bread
// 1 White Bread
// 1 Brown Bread

    // Citi Factory
// Cake
// 1 Plain Cake with Dessi Ghee
// 1 DryFruit Cake with Dessi Ghee

// Bread
// 1 White Bread with Dessi Ghee
// 1 Brown Bread with Dessi Ghee
// /////////////////////////

public class AbstractFactory {
    // Main Class
    static void main(String[] args) {
//        Factory factory = new DolphinFactory();

        Factory factory = new CitiFactory();

        Cake cake = factory.createCake("DryFruit");
        cake.prepare();

        Bread bread = factory.createBread("Brown");
        bread.prepare();
    }
}
// Cake
abstract class Cake{
    abstract void prepare();
}
class PlainCake extends Cake{
    @Override
    public void prepare(){
        System.out.println("Preparing Plain Cake");
    }
}
class DryFruitCake extends Cake{
    @Override
    public void prepare(){
        System.out.println("Preparing DryFruit Cake");
    }
}
class PlainCakeDessiGhee extends Cake{
    @Override
    public void prepare(){
        System.out.println("Preparing Plain Cake DessiGhee");
    }
}
class DryFruitCakeDessiGhee extends Cake{
    @Override
    public void prepare(){
        System.out.println("Preparing DryFruit Cake DessiGhee");
    }
}
// Bread
abstract class Bread{
    abstract void prepare();
}
class WhiteBread extends Bread{
    @Override
    public void prepare(){
        System.out.println("Preparing White Bread");
    }
}
class BrownBread extends Bread{
    @Override
    public void prepare(){
        System.out.println("Preparing Brown Bread");
    }
}
class WhiteBreadDessiGhee extends Bread{
    @Override
    public void prepare(){
        System.out.println("Preparing White Bread DessiGhee");
    }
}
class BrownBreadDessiGhee extends Bread{
    @Override
    public void prepare(){
        System.out.println("Preparing Brown Bread DessiGhee");
    }
}


// Factory
abstract class Factory{
    abstract Cake createCake(String type);
    abstract Bread createBread(String type);
}
class DolphinFactory extends Factory{
    @Override
    public Cake createCake(String type){
        if(type.equals("Plain")){
            return new PlainCake();
        } else if (type.equals("DryFruit")) {
            return new DryFruitCake();
        }
        else {
            System.out.println("Invalid cake type");
            return null;
        }
    }

    @Override
    public Bread createBread(String type){
        if(type.equals("White")){
            return new WhiteBread();
        }
        else if(type.equals("Brown")){
            return new BrownBread();
        }
        else {
            System.out.println("Invalid bread type");
            return null;
        }
    }
}
class CitiFactory extends Factory{
    @Override
    public Cake createCake(String type){
        if(type.equals("Plain")){
            return new PlainCakeDessiGhee();
        } else if (type.equals("DryFruit")) {
            return new DryFruitCakeDessiGhee();
        }
        else {
            System.out.println("Invalid cake type");
            return null;
        }
    }

    @Override
    public Bread createBread(String type){
        if(type.equals("White")){
            return new WhiteBreadDessiGhee();
        }
        else if(type.equals("Brown")){
            return new BrownBreadDessiGhee();
        }
        else {
            System.out.println("Invalid bread type");
            return null;
        }
    }
}
