package com.company;

class Avon implements Bicycle {


    @Override
    public void brake() {
        System.out.println("This is from brake method");
    }

    @Override
    public void speedUp() {

        System.out.println("This is from speedUp method");

    }
}
