package com.code.generics;

import java.util.Arrays;
import java.util.List;

// Here T should either be the number or its subclass
public class WildcardExample<T extends  Number> {  // only add number
    // we can use ? insted of T
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also working as a index value

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number > list){
    //do something
    //  this is number now you can pass integer and float etc in subclass

    }


    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size()  {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildcardExample list = new WildcardExample();
        //list.add(3);
      //  list.add(5);
      //  list.add(9);
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);


//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("aklff");


        WildcardExample<Integer> list3 = new WildcardExample<>();
        list3.add(23);
        //list3.add("fasd");
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
