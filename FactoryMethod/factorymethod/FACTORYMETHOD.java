package factorymethod;

import mypackage.SHAPE;

import java.util.Scanner;

import mypackage.Circle;
import mypackage.Rectangle;

class FACTORYMETHOD {
    
    public static SHAPE getShape(String shapetype){
        if (shapetype == null){
            return null;
        }
        else if (shapetype.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (shapetype.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    } 

    public static void main(String[] args) {
        String shapetype;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the shape ");
        shapetype = sc.nextLine();
        
        SHAPE object = getShape(shapetype);
        object.draw();

        sc.close();
    } //end of main

} // end of class FACTORYMETHOD