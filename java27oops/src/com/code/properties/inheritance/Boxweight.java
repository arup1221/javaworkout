package com.code.properties.inheritance;

public class Boxweight extends Box { //to get the properties of the Box class
    double weight;

    public  Boxweight() {
        this.weight = -1;
        
    }
   // @Override
//
    Boxweight (Boxweight other){
        super(other);
        weight = other.weight;
    }
        Boxweight(double side, double weight){
        super(side);
        }
    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);// what is this?  call the parent class constuctor
        // used to initialise values present in parent class
        this.weight = weight;

    }
}
