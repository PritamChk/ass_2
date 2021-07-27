import Vehicle.mypackage.*;

public class VehicleTest {
    
    public static void main(String[] args) {
        Car C1=new Car(90,4,2);
        Truck T1=new Truck(60,8,200);
        
        C1.show();
        T1.show();
        Vehicle v=C1.compareSpeed(T1);
        v.printmessage();
    }
    
}