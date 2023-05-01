package com.code.interfaces;

public class PowerEngine implements Engine{
    @Override
     public void start(){
        System.out.println("PowerEngine start ");
    }
    @Override
    public void stop(){
        System.out.println("PoweEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}
