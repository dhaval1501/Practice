package com.company;

class Animal {
    public void sleep(){
        System.out.println("sleeping");
    }
    public void run(){
        System.out.println("running");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    public void miyaw(){
        System.out.println("miyaw....");
    }
}