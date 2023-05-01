package partB.MultiInherit;
import java.util.*;

class iphone12{
    int frontCamera =  48;
    int rearcamera = 64;

}

class iphone13 extends iphone12{
    int frontCamera = super.frontCamera;
    int rearCamera = super.rearcamera;
    int Storage = 128;
    int icloud_storage = 64;
}

class iphone14 extends iphone13{
    int frontCamera = super.frontCamera;
    int rearCamera = super.rearCamera;
    int Storage = super.Storage;
    int icloud_Storage = super.icloud_storage;
    int ram = 8;
    int gpu = 12;
}

public class Multilevel {
    public static void main(String[] args) {
        iphone14 f = new iphone14();
        iphone13 p = new iphone13();
        iphone12 m = new iphone12();
        System.out.println("Iphone 14 contain features of iphone12 and 13");
        System.out.println("FrontCamera = " + f.frontCamera+"mp\n RearCamera = "
                +f.rearCamera+" mp\n Storage = "+f.Storage +"Gb\n Icloud Storage = "+f.icloud_storage +
                "Gb\n RAM= "+f.ram+"gb\n GPU = "+ f.gpu+"gb\n");
        System.out.println("Iphone 13 contain features of iphone12 features");
        System.out.println("FrontCamera = " + p.frontCamera+"mp\n RearCamera = "
                +p.rearCamera+"mp\n Storage = "+p.Storage +"Gb\n Icloud Storage = "+p.icloud_storage +
                "Gb\n ");
        System.out.println("Iphone12 features ");
        System.out.println("FrontCamera =" + m.frontCamera +"mp \n RearCamera = " + m.rearcamera+"mp");
    }
}
