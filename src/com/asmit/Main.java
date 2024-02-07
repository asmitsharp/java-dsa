package com.asmit;

public class Main {
    public static void main(String[] args) {
        // All these ref variables are pointing to just one object.
//        Singleton obj = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//        Singleton obj3 = Singleton.getInstance();
        //Without Inheritence
//        Box box = new Box();
//        Box box2 = new Box(10);
//        Box box3 = new Box(10,11,12);
//        Box box4 = new Box(box2);
//
//        System.out.println(box.l + " " + box.h + " " + box.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        System.out.println(box3.l + " " + box3.h + " " + box3.w);
//        System.out.println(box4.l + " " + box4.h + " " + box4.w);
        //With Inheritence
        BoxWeight box5 = new BoxWeight();
        BoxWeight box6 = new BoxWeight(12,13,18,450);
        BoxWeight box7 = new BoxWeight(10, 400);
        BoxWeight box8 = new BoxWeight(box6);

        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);
        System.out.println(box6.l + " " + box6.h + " " + box6.w + " " + box6.weight);
        System.out.println(box7.l + " " + box7.h + " " + box7.w + " " + box7.weight);
        System.out.println(box8.l + " " + box8.h + " " + box8.w + " " + box8.weight);




    }
}
