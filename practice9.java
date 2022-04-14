package com.company;

class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class practice9 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(4);
        System.out.println(c.getRadius());
        c.setHeight(5);
        System.out.println(c.getHeight());


    }
}
