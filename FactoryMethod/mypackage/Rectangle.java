package FactoryMethod.mypackage;

import FactoryMethod.mypackage.SHAPE;

public class Rectangle implements SHAPE {
    
    @Override
    public void draw(){
        // takes no argument
        // prints the shape
        System.out.println("ami rectangle");
        return;
    }

}
