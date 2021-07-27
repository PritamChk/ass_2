package Vehicle.mypackage;

public abstract class Vehicle {
    private int speed_;
    private int wheels_;
    public Vehicle(int speed, int wheels){
        speed_=speed;
        wheels_=wheels;
    }
    public Vehicle compareSpeed(Vehicle V1){
        
        if(speed_>V1.speed_)
            return this;
        else 
            return V1;
    }
    public void show(){
        System.out.println("Speed: "+speed_);
        System.out.println("Wheels: "+wheels_);
    }
    public abstract void printmessage();
}