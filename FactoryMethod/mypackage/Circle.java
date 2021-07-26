package FactoryMethod.mypackage;

import FactoryMethod.mypackage.SHAPE;

public class Circle implements SHAPE {
    
    @Override
    public void draw(){
        System.out.println("Ami Circle");
        return;
    }
}
