package VehicleTest.mypackage;

public class Car extends Vehicle{
    private int no_of_passenger_;
    public Car(int speed,int wheels, int no_of_passenger){
        super(speed,wheels);
        no_of_passenger_=no_of_passenger;
    }
    public void show(){
        super.show();
        System.out.println("No. of passenger: "+no_of_passenger_);
    }
    public void printmessage(){
        System.out.println("Car is faster");
    }
}