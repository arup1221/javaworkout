package code.arup;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
//        System.out.println(find(arr,4,0));
//        System.out.println(findindex(arr,4,0));
//        System.out.println(findindexlast(arr,4,arr.length-1));
//        findallindex(arr,4,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();  //seperately initilize
//        ArrayList<Integer> ans = findAll(arr,4,0, list);
//        System.out.println(list);
//        System.out.println(ans);
        System.out.println(findAll2(arr,4,0));
    }
    static boolean find(int[] arr, int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findindex(int[] arr, int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }
        else{
            return findindex(arr,target,index+1);
        }
    }
    static int findindexlast(int[] arr, int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }
        else{
            return findindex(arr,target,index-1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index] ==target){
           list.add(index);
        }

             findallindex(arr,target,index+1);

    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr,target, index+1,list);
    }



    //don't use the approach, but it is important to understand how things are working

    static ArrayList<Integer> findAll2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
       ArrayList<Integer> ansfrombelowcalls = findAll2(arr,target, index+1);


        list.addAll(ansfrombelowcalls);
        return list;
    }

}

