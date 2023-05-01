package permutationQues;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dicee("",4);
        System.out.println(diceReturn("",4));
    }

    static void dicee(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dicee(p+i,target-i);

        }
    }
    static void diceface(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=face && i<=target; i++) {
            diceface(p+i,target-i,face);

        }
    }
    static ArrayList<String> diceReturn(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(diceReturn(p+i,target-i));

        }
        return list;
    }
    static ArrayList<String> diceFaceReturn(String p, int target,int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        for (int i = 1; i <=face && i<=target; i++) {
            list.addAll(diceFaceReturn(p+i,target-i,face));

        }
        return list;
    }
}
