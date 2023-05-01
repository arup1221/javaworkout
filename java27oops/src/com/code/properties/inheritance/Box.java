package com.code.properties.inheritance;

import java.awt.dnd.DropTargetListener;

public class Box {
  private double l;
    double h;
    double w;
    // double weight;
   // @Override
    static void greeting(){
        System.out.println("Hey, I am in Box class, Greeting !");
    }

    public double getL() {
        return l;
    }

    Box(){ // if super is not called than this default will be called
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        //super();   Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    //cube
     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.h;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
