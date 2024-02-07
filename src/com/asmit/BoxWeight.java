package com.asmit;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l,h,w); // Call the parent class constructor.
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side); // Call the parent class constructor.
        this.weight = weight;
    }

    public BoxWeight(BoxWeight box) {
        super(box);
        this.weight = box.weight;
    }
}
