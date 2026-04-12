public class InheritancePractice {

    public static void main(String[] args){
        Car car = new Car("Suzuki", "Swift");
        car.drive();

        System.out.println(" ");

        ManualCar mcar = new ManualCar("BMW", "m4");
        mcar.drive();
        mcar.gearShift(4);

        System.out.println(" ");

        AutomaticCar autocar = new AutomaticCar("Tesla", "x100");
        autocar.drive();
        autocar.batteryCharge(68);
        
    }
}


class Car{
    public String name;
    public String model;

    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    public void drive(){
        System.out.println("Driving "+ name + " and model is: " + model);
    }
}
class ManualCar extends Car{
    private int gear=0;
//    ManualCar(){
//        super();
//    }
public ManualCar(String name, String model) {
    super(name, model);
}
//    super(name, model);
    public void gearShift(int gear) {
        this.gear = gear;
        System.out.println("Gear shifted to: " + gear);
    }
}
class AutomaticCar extends Car{
    private int batteryLevel=0;
    AutomaticCar(String name, String model){
        super(name, model);
    }
    public void batteryCharge(int batteryLevel){
        this.batteryLevel = batteryLevel;
        System.out.println("Battery is charging and level is: " + batteryLevel);
    }
}