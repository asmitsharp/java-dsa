package com.customarraylist;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }


    public void add(T num) {
        if(isFull()) {
            resize();
        }

        data[size++] = num;
    }

    public  void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public void set(int index, T value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();
//        list.add(3);
//        list.add(4);
//        list.add(5);
        list.add("asmit");
        list.add("awadh");



        System.out.println(list);


    }
}
