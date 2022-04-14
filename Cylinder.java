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

    public double surfaceArea() {
        return 2 * Math.PI * height * radius + 2 * Math.PI * radius * radius;


    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public Cylinder() {
        this.radius = radius;
        this.height = height;
    }
}
