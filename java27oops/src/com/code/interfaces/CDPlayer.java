package com.code.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Rock music start");
    }

    @Override
    public void stop() {
        System.out.println("Stop it now");

    }
}
