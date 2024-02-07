package com.asmit.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career("Doctor");

        Daughter daughter = new Daughter(28);
        daughter.career("Coder");

        Parent.hello();

    }
}
