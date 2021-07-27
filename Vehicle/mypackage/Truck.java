package Vehicle.mypackage;

public class Truck extends Vehicle{
    private int load_limit_;
    public Truck(int speed,int wheels, int load_limit){
        super(speed,wheels);
        load_limit_=load_limit;
    }
    public void show(){
        super.show();
        System.out.println("load limit: "+load_limit_);
    }
    public void printmessage(){
        System.out.println("Truck is faster");
    }
}