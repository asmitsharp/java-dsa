package com.customarraylist;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }


    public void add(int num) {
        if(isFull()) {
            resize();
        }

        data[size++] = num;
    }

    public  void resize() {
        int[] temp = new int[data.length * 2];

        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
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

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list);

    }
}
