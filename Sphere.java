package com.company;

 class Sphere {
     private int radius;
    /* public void getRadius(int r){
         radius=r;
     }*/
     public int setRadius(){
         return radius;
     }
     public double area(){
         return 4*Math.PI*radius*radius;
     }
     public double volume(){
         return 4d/3d*Math.PI*radius*radius*radius;
     }
     public Sphere(){
         radius=4;
     }
}

