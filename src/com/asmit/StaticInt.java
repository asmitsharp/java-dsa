package com.asmit;

public class StaticInt {
    static int a = 4;
    static int b;

    // Only run once when the first obj is created i.e.
    // when the class is loaded for the first time.
    static  {
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj  = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
