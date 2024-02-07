package com.asmit;

public class InnerClass {
    static class Text {
        String name;

        public Text(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
    Text a  = new Text("Asmit");
    Text b  = new Text("Gaurav");

        System.out.println(a);
    }
}
