package com.code.enumexamples;

public class Main {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are basically called enum constants
        // public, static and final
        //since its final you can crate child enum
        //type is Week





        Week() {
           // System.out.println("Constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("Hey how are you");
        }

        //this is not public or protected, only private or default
        // why ? we don't want to create new objects
        // this is not the enum concept, thats why

        //internally: public static final week Monday = new week();

    }

    public static void main(String[] args) {
        Week week ;
        week = Week.Sunday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
        for(Week day : Week.values()){
           // System.out".println(day);
        }

      //  System.out.println(week);

        //System.out.println(week.ordinal());
    }
}
