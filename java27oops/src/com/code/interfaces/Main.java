package com.code.interfaces;

public class Main {
    public static void main(String[] args) {


      //  Engine car = new Car(); //type of the variable as type of the interfaces
        //  Car car = new Car();
//        car.stop();
//        car.start();
//        car.acc();
        //car.brake();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradEngine(); //change engine to electric engine
        car.start();


    }
}
